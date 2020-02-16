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
    public partial class Form_Question_Error_Show : Form
    {
        public Form_Question_Error_Show()
        {
            InitializeComponent();

            StringBuilder Question_Error_Show_String = new StringBuilder();

            foreach (Question i in Form_Question_Show.Questions_Error_List)
            {
                Question_Error_Show_String.Append(i.Title + "\r\n");
                Question_Error_Show_String.Append(i.Option_A + "\r\n");
                Question_Error_Show_String.Append(i.Option_B + "\r\n");
                Question_Error_Show_String.Append(i.Option_C + "\r\n");
                Question_Error_Show_String.Append(i.Option_D + "\r\n");
                Question_Error_Show_String.Append("标准答案是：" + i.Answer + "\r\n");
                Question_Error_Show_String.Append("你的答案是：" + i.Answer_User + "\r\n" + "\r\n");
            }
            this.textBox1.Text = Question_Error_Show_String.ToString();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
