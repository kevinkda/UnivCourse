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
        public FormQA()
        {
            InitializeComponent();
        }

        private void textBoxQuestion_TextChanged(object sender, EventArgs e)
        {

        }

        private void button_Submit_Click(object sender, EventArgs e)
        {
            QuestionIO qIO = new QuestionIO();
            Question q = qIO.getQuestion(@"E:\Work_Space\课程设计\西游记期末考试题.exam");

            this.textBoxQuestion.Text = q.Title;
            this.checkBox_A.Text = q.Option_A;
            this.checkBox_B.Text = q.Option_B;
            this.checkBox_C.Text = q.Option_C;
            this.checkBox_D.Text = q.Option_D;
        }
    }
}
