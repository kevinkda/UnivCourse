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
    public partial class FormQA : Form
    {
        List<Question> qList;
        int Question_No = 0;

        //private TextBox TextBoxTitle;

        public FormQA()
        {
            InitializeComponent();

            QuestionIO qIO = new QuestionIO();
            qList = qIO.GetQuestion(@"C:\Users\Kevin KDA\Desktop\Curriculum_Design_2018_06_Build_4\西游记期末考试题.exam");
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
            Question_Show(0);
            checkbox_user_show(Question_No);
            checkbox_user_save(Question_No);
            button_Control();
        }

        private void Question_Show(int Question_NO)
        {
            //this.TextBoxTitle.Text = qList[Question_No].Title;
            this.textBoxQuestion.Text = qList[Question_No].Title;
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
        }

        private void checkbox_user_save(int Question_No)
        {
            qList[Question_No].Check_A = this.checkBox_A.Checked;
            qList[Question_No].Check_B = this.checkBox_B.Checked;
            qList[Question_No].Check_C = this.checkBox_C.Checked;
            qList[Question_No].Check_D = this.checkBox_D.Checked;
        }

        private void checkbox_user_show(int Question_No)
        {
            checkBox_A.Checked = qList[Question_No].Check_A;
            checkBox_B.Checked = qList[Question_No].Check_B;
            checkBox_C.Checked = qList[Question_No].Check_C;
            checkBox_D.Checked = qList[Question_No].Check_D;
        }

        private void button_Control()
        {
            this.button_Last_Question.Enabled = true;
            this.button_Next_Question.Enabled = true;

            if (Question_No == 0)
            {
                this.button_Last_Question.Enabled = false;
            }
            if (Question_No == (qList.Count - 1))
            {
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
            button_Control();
        }
        */

        private void textBoxQuestion_TextChanged(object sender, EventArgs e)
        {

        }

        private void button_Submit_Click(object sender, EventArgs e)
        {
            
        }

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

            Question_No++;
            /*
            this.textBoxQuestion.Text = qList[Question_No].Title;
            this.checkBox_A.Text = qList[Question_No].Option_A;
            this.checkBox_B.Text = qList[Question_No].Option_B;
            this.checkBox_C.Text = qList[Question_No].Option_C;
            this.checkBox_D.Text = qList[Question_No].Option_D;
            */
            //  checkbox_user_show(Question_No);
            //  checkbox_user_save(Question_No);
            Question_Show(Question_No);
            button_Control();
        }

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

            Question_No--;
            /*
            this.textBoxQuestion.Text = qList[Question_No].Title;
            this.checkBox_A.Text = qList[Question_No].Option_A;
            this.checkBox_B.Text = qList[Question_No].Option_B;
            this.checkBox_C.Text = qList[Question_No].Option_C;
            this.checkBox_D.Text = qList[Question_No].Option_D;
            */
            //  checkbox_user_show(Question_No);
            //  checkbox_user_save(Question_No);
            Question_Show(Question_No);
            button_Control();
        }
    }
}
