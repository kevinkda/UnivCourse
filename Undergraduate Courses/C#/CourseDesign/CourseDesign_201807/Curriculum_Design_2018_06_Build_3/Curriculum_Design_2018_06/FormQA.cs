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
        int QuestionNo = 0;
        public FormQA()
        {
            InitializeComponent();
            if (QuestionNo==0)
            {
                button_Last_Question.Enabled = false;
            }
            else if (QuestionNo == 5)
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
        }

        private void textBoxQuestion_TextChanged(object sender, EventArgs e)
        {

        }

        private void button_Submit_Click(object sender, EventArgs e)
        {
            QuestionIO qIO = new QuestionIO();
            qList = qIO.GetQuestion(@"C:\Users\Administrator\Desktop\Curriculum_Design_2018_06\西游记期末考试题.exam");

            this.textBoxQuestion.Text = qList[0].Title;
            this.checkBox_A.Text = qList[0].Option_A;
            this.checkBox_B.Text = qList[0].Option_B;
            this.checkBox_C.Text = qList[0].Option_C;
            this.checkBox_D.Text = qList[0].Option_D;
        }

        private void button_Next_Question_Click(object sender, EventArgs e)
        {
            if (QuestionNo < (qList.Count - 1))
            {
                QuestionNo++;
                this.button_Last_Question.Enabled = true;
            }
            else
            {
                //  最后一题
                this.button_Next_Question.Enabled = false;
            }

            this.textBoxQuestion.Text = qList[QuestionNo].Title;
            this.checkBox_A.Text = qList[QuestionNo].Option_A;
            this.checkBox_B.Text = qList[QuestionNo].Option_B;
            this.checkBox_C.Text = qList[QuestionNo].Option_C;
            this.checkBox_D.Text = qList[QuestionNo].Option_D;
        }

        private void button_Last_Question_Click(object sender, EventArgs e)
        {
            if (QuestionNo == (qList.Count - 1)) 
            {
                button_Next_Question.Enabled = true;
            }
            if (0 < QuestionNo) 
            {
                QuestionNo--;
                //  this.button_Last_Question.Enabled = true;
            }
            
            else
            {
                //  第一题
                this.button_Last_Question.Enabled = false;
            }

            this.textBoxQuestion.Text = qList[QuestionNo].Title;
            this.checkBox_A.Text = qList[QuestionNo].Option_A;
            this.checkBox_B.Text = qList[QuestionNo].Option_B;
            this.checkBox_C.Text = qList[QuestionNo].Option_C;
            this.checkBox_D.Text = qList[QuestionNo].Option_D;
        }
    }
}
