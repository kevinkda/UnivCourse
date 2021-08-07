/************************************************************
*  标题: 74HC595驱动数码管上显示数字（C语言）             *
/*************************************************************/
#include <intrins.h>
#include<reg52.h>
#define  AT24C02 0xa0  //AT24C02 地址
#define  NOP() _nop_()  /* 定义空指令 */
sbit MOSIO =P2^0;
sbit R_CLK =P2^1;
sbit S_CLK =P2^2;
void delay(unsigned int i);      //函数声名
void HC595SendData(unsigned char SendVal,unsigned char Wei);
void Led_Show(unsigned char Wei); 
void SetLedNum(unsigned long int Numcode);
void system_Ini();
void  keyscan(void);
void SengUart(unsigned char SenData);
void SendString(unsigned char *str);
void SengNum(unsigned int num);
// 此表为 LED 的字模0    1    2    3    4    5    6   7    8    9    A    b    c    d    E    -    L   P    U    Hidden  _ (20)
unsigned char code Disp_Tab[] = { 0xC0,0xF9,0xA4,0xB0,0x99,0x92,0x82,0xF8,0x80,0x90,0x88,0x83,0xC6,0xA1,0x86,0xbf,0xc7,0x8c,0xc1, 0xff,  0xf7 }; 
unsigned char code LED7Code[] = {~0x3F,~0x06,~0x5B,~0x4F,~0x66,~0x6D,~0x7D,~0x07,~0x7F,~0x6F,~0x77,~0x7C,~0x39,~0x5E,~0x79,~0x71};
unsigned char code Nuntable[]="0123456789abcdef";
unsigned char NumBuffer[8];
unsigned int LedNum=0; 
unsigned int time=0;
unsigned char P0flg;
unsigned char  temp;
unsigned char  key;               //键顺序吗
unsigned char ReData;
unsigned char pDat[8];
main()
{ 
   unsigned long int Num=0;
   P0=0xff;
   P1=0xff;
   P2=0xff;   
   system_Ini();   
   P0flg=0;
   NumBuffer[6]=pDat[5];
  while(1)
  {	 
		if(LedNum==0)
		{
			Num++;
			Num%=10000;
			SetLedNum(Num);
		}
	    keyscan();	
  }
}
/***********************************************************
purpose: 系统初始化
/**********************************************************/
void system_Ini()
{
    TMOD= 0x21;
	 TH0 = (65536-30000)>>8;    //12.000
	 TL0 = (65536-30000)&0xff;	
     ET0 =1;
     TR0  = 1;
     SCON = 0x50;  //REN=1允许串行接受状态，串口工作模式2 
	 TMOD|= 0x20;      //定时器工作方式2 
	 PCON|= 0x80;      //波特率提高一倍                                                    
	 TH1 = 0xF3;// //baud*2  /* 波特率4800、数据位8、停止位1。
     TL1 = 0xF3; 
	 TR1  = 1;        //开启定时器1                                                      
ES   = 1;        //开串口中断
     IT0=1;           //下降沿触发
     EX0=1;		            
     EA   = 1;	      // 开总中断 
}
void SetLedNum(unsigned long int Numcode)
{
    unsigned char i;
    for(i=0;i<6;i++)
	{
		NumBuffer[i]=Numcode%10;
		Numcode/=10;
	}
}	
void Led_Show(unsigned char Wei)
{	 
    unsigned char  HC595SendVal;
	HC595SendVal = ~Disp_Tab[NumBuffer[Wei]];
	HC595SendData(HC595SendVal,Wei);	
}
void delay(unsigned int i)
{
    unsigned int j;
    for(i; i > 0; i--)
        for(j = 300; j > 0; j--);
}
/************************************************************
** 函数名称: HC595SendData
** 功能描述: 向SPI总线发送数据
************************************************************/
void HC595SendData(unsigned char SendVal,unsigned char Wei)
{  
  unsigned char i;
  for(i=0;i<16;i++) 
   {
   	if(i<8)
	{
		if((SendVal<<i)&0x80) MOSIO=1; 
		else MOSIO=0;	   // 如果为真 MOSIO = 1  
 	}
	else 
	{
	   MOSIO=((~(1<<Wei)>>(i-8))&0x01);
	}
	S_CLK=0;
	NOP();
	NOP();
	S_CLK=1;	
   }
  R_CLK=0; //set dataline low
  NOP();
  NOP();
  R_CLK=1; //片选
}
void SengUart(unsigned char SenData)
{
	     SBUF=SenData;	             //SUBF接受/发送缓冲器
	    while(TI==0);
         TI=0;
}
void SendString(unsigned char *str)
{
	while(*str!='\0')
	{
		SengUart(*str);
		str++;
	}
}
void SengNum(unsigned int num)
{
    unsigned char buffer[10];
	unsigned char *Buf=buffer+8;
	do{
	   *Buf=Nuntable[num%10];
	   Buf--;
	   num/=10;
	}while(num!=0);
	buffer[9]=0;
	Buf++;
	SendString(Buf);
}
 /*************************************************************/
/*键扫描子程序  (4*3 的矩阵) P1.4 P1.5 P1.6 P1.7为行      */
/*							  P1.1 P1.2 P1.3为列        */
/**************************************************************/
 void  keyscan(void)
 { 	temp = 0;
    P1=0xF0;            //高四位输入   行为高电平  列为低电平
    delay(1);
	temp=P1;                 //读P1口 
    temp=temp&0xF0;			 //屏蔽低四位
    temp=~((temp>>4)|0xF0);	  
    if(temp==1)	  // p1.4 被拉低
        key=0;
    else if(temp==2)   // p1.5 被拉低
        key=1;
    else if(temp==4)   // p1.6 被拉低
        key=2;
    else if(temp==8)   // p1.7 被拉低
         key=3;
    else
        key=16;  
    P1=0x0F;              //低四位输入  列为高电平 行为低电平
    delay(1);
	temp=P1;                //读P1口       
    temp=temp&0x0F;
    temp=~(temp|0xF0);
	if(temp==1)		   // p1.0  被拉低
        key=key+0;
    else if(temp==2)		   // p1.1  被拉低
        key=key+4;
    else if(temp==4)   // p1.2  被拉低
        key=key+8;
    else if(temp==8)	// p1.3  被拉低
        key=key+12;
    else
        key=16;	 
    if(key<16)
	{
    	NumBuffer[7]=key;
		SendString("get the key number: ");
		SengNum((unsigned int)key);
		SendString("\r\n");
		if(key==0)
		{
           	SendString("write num 5 to 24c02 !\r\n");	
		}
		else if(key==1)
		{
		    SendString("read num from 24c02 : ");
            NumBuffer[6]=pDat[0];		
			SengNum((unsigned int)pDat[0]);
			SendString("\r\n");
		}
	}
 }
/********************************************************
* INT0中断函数                                          *
********************************************************/
void  counter(void) interrupt 0 
{
   EX0=0;
   EX0=1;
}
/*************************************
 [ t1 (1ms)中断] 中断
*************************************/
void T1zd(void) interrupt 1     //3定时器0的中断号  1定时器0的中断号 0外部中断1 2外部中断2  4串口中断
{
	 TH0 = (65536-3000)>>8;    //12.000
	 TL0 = (65536-3000)&0xff;
	 time++;
	 if(time==10)
	 {
	    P0flg++;
		P0flg%=16;
	 	time = 0;
		if(P0flg<8)
		    P0=~(0x01<<P0flg);
		else
		    P0=~(0x80>>(P0flg-8));
	 }
   LedNum++;     //中断计数  
   LedNum%=8;
   Led_Show(LedNum); 
}
/****************************************************
               串口中断程序
******************************************************/
void ser_int (void) interrupt 4 using 1
{
 if(RI == 1)        //RI接受中断标志
 {
 	RI = 0;		    //清除RI接受中断标志
	ReData = SBUF;  //SUBF接受/发送缓冲器
 }
}
