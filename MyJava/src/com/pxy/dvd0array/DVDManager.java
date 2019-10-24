/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy;

import java.util.Date;

public class DVDManager {
	private DVD[] dvdList = new DVD[50];	//DVD列表
	
	public DVDManager(){
		dvdList[0] = new DVD();
		dvdList[0].setNo("9527");
		dvdList[0].setName("监狱风云2");
		dvdList[0].setState(1);
		dvdList[0].setOutDate(new Date());
		
		dvdList[1] = new DVD();
		dvdList[1].setNo("3432");
		dvdList[1].setName("复仇者联盟");
		
		dvdList[2] = new DVD();
		dvdList[2].setNo("6655");
		dvdList[2].setName("中国机长");
	}
	
	//	添加()
	//格式：访问修饰符 返回值类型 方法名(参数列表){}
	public int add(DVD dvd){
		int state = 0;	//0. 添加失败 1.成功
		for (int i = 0; i < dvdList.length; i++) {
			if(dvdList[i]==null){
				dvdList[i] = dvd;
				state = 1;
				break;
			}
		}
		
		return state;
	}
	//查看所有DVD()
	public void showAll(){
		System.out.println("序号\t名称\t状态\t借出时间");
		for (int i = 0; i < dvdList.length; i++) {
			if(dvdList[i]!=null){
				System.out.println(dvdList[i].getNo()+"\t"+
						dvdList[i].getName()+"\t"+
						(dvdList[i].getState()==0?"可借":"已借出")+"\t"+
						(dvdList[i].getOutDate()==null?"":dvdList[i].getOutDate()));
			}
			
		}
	}
	
	//，删除()
	public int remove(String dvdNO){
		int state = 0;	//0. 没有数据 1.成功 2.已借出不能删除
		for (int i = 0; i < dvdList.length; i++) {
			if(dvdList[i]!=null){
				if(dvdList[i].getNo().equals(dvdNO)){
					if(dvdList[i].getState()==0){
						dvdList[i] = null;
						state = 1;
					}
					else{
						state = 2;
					}
					break;
				}
			}
		}
		
		return state;
	}
	
	//，修改()，出租()，归还()
}
