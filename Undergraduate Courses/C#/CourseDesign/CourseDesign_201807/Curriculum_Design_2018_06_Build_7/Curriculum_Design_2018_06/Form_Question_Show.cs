using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Curriculum_Design_2018_06
{
    public partial class Form_Question_Show : Form
    {
        //  抽取出要显示给用户的题目（列表）
        List<Question> qList;
        //  全面题库
        List<Question> Question_All;
        public static List<Question> Questions_Error_List;

        //  记录取题编号
        int Question_No = 0;

        //  记录取题数
        int Number_of_Questions = 3;
        string Question_Bank_Address;
        const string Question_Bank_Address_1 = (@"..\..\..\西游记期末考试题.exam");
        const string Question_Bank_Address_2 = (@"..\..\..\100+题库.exam");

        //  private TextBox TextBoxTitle;

        public Form_Question_Show()
        {
            InitializeComponent();

            QuestionIO qIO = new QuestionIO();
            Question_Bank_Address_Radrom();
            Number_of_Questions = Number_of_Questions_Radrom();
            Question_All = qIO.GetQuestion(Question_Bank_Address);
            /*
            if (Question_No==0)
            {
                button_Last_Question.Enabled = false;
            }
            else if (Question_No == 5)
            {
                //  第一题
                button_Next_Question.Enabled = false;
            }
            else
            {
                //  第一题
                button_Last_Question.Enabled = true;
                button_Next_Question.Enabled = true;
            }
            */
            //  Question_Extract();
            //随机取题
            Get_Random_Question();
            //显示第一题
            Question_Show(0);
            //第一题时，没有上一题，调用按钮状态控制方法
            Button_Control();
        }

        /// <summary>
        /// 随机取题库
        /// </summary>
        private void Question_Bank_Address_Radrom()
        {

            Random i = new Random();
            int j = i.Next();
            if (j % 2 == 1)
            {
                Question_Bank_Address = Question_Bank_Address_1;
            }
            else
            {
                Question_Bank_Address = Question_Bank_Address_2;
            }
        }

        /// <summary>
        /// 随机取题目数
        /// </summary>
        /// <returns></returns>
        private int Number_of_Questions_Radrom()
        {
            Random i = new Random();
            int j;
            if (Question_Bank_Address == Question_Bank_Address_1)
            {
                j = i.Next(3, 5);
            }
            else
            {
                j = i.Next(5, 99);
            }
            return j;
        }

        /// <summary>
        /// 出题方法
        /// </summary>
        /// <param name="Question_NO"></param>
        private void Question_Show(int Question_NO)
        {
            //this.TextBoxTitle.Text = qList[Question_No].Title;
            //this.textBoxQuestion.Text = qList[Question_No].Title;
            StringBuilder Question_Show_TextBoxTitle = new StringBuilder();
            Question_Show_TextBoxTitle.Append("当前第" + (Question_No+1) + "题，共" + Number_of_Questions + "题" + "\r\n\r\n" + qList[Question_No].Title);
            this.textBoxQuestion.Text = Question_Show_TextBoxTitle.ToString();

            //  显示题目
            this.checkBox_A.Text = qList[Question_No].Option_A;
            this.checkBox_B.Text = qList[Question_No].Option_B;
            this.checkBox_C.Text = qList[Question_No].Option_C;
            this.checkBox_D.Text = qList[Question_No].Option_D;

            //  清空选项
            this.checkBox_A.Checked = false;
            this.checkBox_B.Checked = false;
            this.checkBox_C.Checked = false;
            this.checkBox_D.Checked = false;

            //恢复用户选择
            if (qList[Question_NO].Answer_User != null)
            {
                if (qList[Question_NO].Answer_User.Contains("A"))
                {
                    this.checkBox_A.Checked = true;
                }
                if (qList[Question_NO].Answer_User.Contains("B"))
                {
                    this.checkBox_B.Checked = true;
                }
                if (qList[Question_NO].Answer_User.Contains("C"))
                {
                    this.checkBox_C.Checked = true;
                }
                if (qList[Question_NO].Answer_User.Contains("D"))
                {
                    this.checkBox_D.Checked = true;
                }
            }
        }

        /// <summary>
        /// 按钮控制方法
        /// </summary>
        private void Button_Control()
        {
            this.button_Last_Question.Enabled = true;
            this.button_Next_Question.Enabled = true;

            if (Question_No == 0)
            {
                //  第一题的时候
                this.button_Last_Question.Enabled = false;
            }
            if (Question_No == (qList.Count - 1))
            {
                //  最后一题的时候
                this.button_Next_Question.Enabled = false;
            }
        }

        /*
        private void Question_Extract()
        {
            this.textBoxQuestion.Text = qList[0].Title;
            this.checkBox_A.Text = qList[0].Option_A;
            this.checkBox_B.Text = qList[0].Option_B;
            this.checkBox_C.Text = qList[0].Option_C;
            this.checkBox_D.Text = qList[0].Option_D;
            Button_Control();
        }
        */

        /// <summary>
        /// 使用随机数方法取题
        /// </summary>
        private void Get_Random_Question()
        {
            qList = new List<Question>();

            //  随机数对象
            Random r = new Random();
            //  随机取x道题
            for (int i = 0; i < Number_of_Questions; i++)
            {
                int Random_1 = r.Next(Question_All.Count);
                Question q = Question_All[Random_1];
                qList.Add(q);
                // 全体库中，删除，防止重复取题
                Question_All.Remove(q);
            }
        }

        /// <summary>
        /// 记录用户选项
        /// </summary>
        private void Answer_User_Remember()
        {
            string sAnswer_User = "";
            if (this.checkBox_A.Checked)
            {
                sAnswer_User = sAnswer_User + "A";
            }
            if (this.checkBox_B.Checked)
            {
                sAnswer_User = sAnswer_User + "B";
            }
            if (this.checkBox_C.Checked)
            {
                sAnswer_User = sAnswer_User + "C";
            }
            if (this.checkBox_D.Checked)
            {
                sAnswer_User = sAnswer_User + "D";
            }
            qList[Question_No].Answer_User = sAnswer_User;
        }

        /// <summary>
        /// 消息盒子_问题显示
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void textBoxQuestion_TextChanged(object sender, EventArgs e)
        {

        }

        /// <summary>
        /// 题目提交按钮
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void button_Submit_Click(object sender, EventArgs e)
        {
            Questions_Error_List = new List<Question>();
            Answer_User_Remember();
            int Answer_User_Score = 100;
            int Answer_User_Score_One = Answer_User_Score / Number_of_Questions;
            int Answer_User_Right_Count = 0;
            int Answer_User_Error_Count = 0;

            /*
            for (int i = 0; i < Number_of_Questions; i++)
            {
                if (qList[i].Answer_User == qList[i].Answer)
                {
                    Answer_User_Right_Count++;
                }
                else
                {
                    Answer_User_Error_Count++;
                    Questions_Error_List.Add(i);
                }
            }
            */

            foreach (Question i in qList)
            {
                if (i.Answer_User == i.Answer)
                {
                    Answer_User_Right_Count++;
                }
                else
                {
                    Answer_User_Error_Count++;
                    Questions_Error_List.Add(i);
                }
            }

            Answer_User_Score = Answer_User_Score / Number_of_Questions * Answer_User_Right_Count;

            MessageBox.Show("您的试卷已提交" + "\r\n" +
                "本次测试共" + Number_of_Questions + "题，每题" + Answer_User_Score_One + "分" + "\r\n" +
                "您的得分是" + Answer_User_Score + "，您共答对" + Answer_User_Right_Count + "道题，您共答错" + Answer_User_Error_Count + "道题", "提示",
                MessageBoxButtons.OK);

            if (Answer_User_Error_Count != 0)
            {
                Form_Question_Error_Show fForm_Question_Error_Show = new Form_Question_Error_Show();
                fForm_Question_Error_Show.ShowDialog();
            }
        }

        /// <summary>
        /// 下一题按钮
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void button_Next_Question_Click(object sender, EventArgs e)
        {
            /*
            if (Question_No < (qList.Count - 1))
            {
                Question_No++;
                this.button_Last_Question.Enabled = true;
            }
            else
            {
                //  最后一题
                this.button_Next_Question.Enabled = false;
            }
            */

            //  在题号变换前，保存用户当前题的选项
            Answer_User_Remember();
            Question_No++;
            /*
            this.textBoxQuestion.Text = qList[Question_No].Title;
            this.checkBox_A.Text = qList[Question_No].Option_A;
            this.checkBox_B.Text = qList[Question_No].Option_B;
            this.checkBox_C.Text = qList[Question_No].Option_C;
            this.checkBox_D.Text = qList[Question_No].Option_D;
            */
            Question_Show(Question_No);
            Button_Control();
        }

        /// <summary>
        /// 上一题按钮
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void button_Last_Question_Click(object sender, EventArgs e)
        {
            /*
            if (Question_No == (qList.Count - 1))
            {
                button_Next_Question.Enabled = true;
            }
            if (0 < Question_No)
            {
                Question_No--;
                //  this.button_Last_Question.Enabled = true;
            }
            else
            {
                //  第一题
                this.button_Last_Question.Enabled = false;
            }
            */

            Answer_User_Remember();
            Question_No--;
            /*
            this.textBoxQuestion.Text = qList[Question_No].Title;
            this.checkBox_A.Text = qList[Question_No].Option_A;
            this.checkBox_B.Text = qList[Question_No].Option_B;
            this.checkBox_C.Text = qList[Question_No].Option_C;
            this.checkBox_D.Text = qList[Question_No].Option_D;
            */
            Question_Show(Question_No);
            Button_Control();
        }
    }
}
