namespace Curriculum_Design_2018_06
{
    partial class Form_Question_Show
    {
        /// <summary>
        /// 必需的设计器变量。
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 清理所有正在使用的资源。
        /// </summary>
        /// <param name="disposing">如果应释放托管资源，为 true；否则为 false。</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows 窗体设计器生成的代码

        /// <summary>
        /// 设计器支持所需的方法 - 不要
        /// 使用代码编辑器修改此方法的内容。
        /// </summary>
        private void InitializeComponent()
        {
            this.textBoxQuestion = new System.Windows.Forms.TextBox();
            this.checkBox_A = new System.Windows.Forms.CheckBox();
            this.checkBox_B = new System.Windows.Forms.CheckBox();
            this.checkBox_C = new System.Windows.Forms.CheckBox();
            this.checkBox_D = new System.Windows.Forms.CheckBox();
            this.button_Last_Question = new System.Windows.Forms.Button();
            this.button_Next_Question = new System.Windows.Forms.Button();
            this.button_Submit = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // textBoxQuestion
            // 
            this.textBoxQuestion.Location = new System.Drawing.Point(20, 48);
            this.textBoxQuestion.Margin = new System.Windows.Forms.Padding(4);
            this.textBoxQuestion.Multiline = true;
            this.textBoxQuestion.Name = "textBoxQuestion";
            this.textBoxQuestion.Size = new System.Drawing.Size(386, 136);
            this.textBoxQuestion.TabIndex = 0;
            this.textBoxQuestion.TextChanged += new System.EventHandler(this.textBoxQuestion_TextChanged);
            // 
            // checkBox_A
            // 
            this.checkBox_A.AutoSize = true;
            this.checkBox_A.Location = new System.Drawing.Point(81, 231);
            this.checkBox_A.Margin = new System.Windows.Forms.Padding(4);
            this.checkBox_A.Name = "checkBox_A";
            this.checkBox_A.Size = new System.Drawing.Size(43, 22);
            this.checkBox_A.TabIndex = 1;
            this.checkBox_A.Text = "A";
            this.checkBox_A.UseVisualStyleBackColor = true;
            // 
            // checkBox_B
            // 
            this.checkBox_B.AutoSize = true;
            this.checkBox_B.Location = new System.Drawing.Point(81, 286);
            this.checkBox_B.Margin = new System.Windows.Forms.Padding(4);
            this.checkBox_B.Name = "checkBox_B";
            this.checkBox_B.Size = new System.Drawing.Size(43, 22);
            this.checkBox_B.TabIndex = 2;
            this.checkBox_B.Text = "B";
            this.checkBox_B.UseVisualStyleBackColor = true;
            // 
            // checkBox_C
            // 
            this.checkBox_C.AutoSize = true;
            this.checkBox_C.Location = new System.Drawing.Point(81, 342);
            this.checkBox_C.Margin = new System.Windows.Forms.Padding(4);
            this.checkBox_C.Name = "checkBox_C";
            this.checkBox_C.Size = new System.Drawing.Size(43, 22);
            this.checkBox_C.TabIndex = 3;
            this.checkBox_C.Text = "C";
            this.checkBox_C.UseVisualStyleBackColor = true;
            // 
            // checkBox_D
            // 
            this.checkBox_D.AutoSize = true;
            this.checkBox_D.Location = new System.Drawing.Point(81, 398);
            this.checkBox_D.Margin = new System.Windows.Forms.Padding(4);
            this.checkBox_D.Name = "checkBox_D";
            this.checkBox_D.Size = new System.Drawing.Size(43, 22);
            this.checkBox_D.TabIndex = 4;
            this.checkBox_D.Text = "D";
            this.checkBox_D.UseVisualStyleBackColor = true;
            // 
            // button_Last_Question
            // 
            this.button_Last_Question.Location = new System.Drawing.Point(20, 490);
            this.button_Last_Question.Margin = new System.Windows.Forms.Padding(4);
            this.button_Last_Question.Name = "button_Last_Question";
            this.button_Last_Question.Size = new System.Drawing.Size(112, 34);
            this.button_Last_Question.TabIndex = 5;
            this.button_Last_Question.Text = "上一题";
            this.button_Last_Question.UseVisualStyleBackColor = true;
            this.button_Last_Question.Click += new System.EventHandler(this.button_Last_Question_Click);
            // 
            // button_Next_Question
            // 
            this.button_Next_Question.Location = new System.Drawing.Point(296, 490);
            this.button_Next_Question.Margin = new System.Windows.Forms.Padding(4);
            this.button_Next_Question.Name = "button_Next_Question";
            this.button_Next_Question.Size = new System.Drawing.Size(112, 34);
            this.button_Next_Question.TabIndex = 6;
            this.button_Next_Question.Text = "下一题";
            this.button_Next_Question.UseVisualStyleBackColor = true;
            this.button_Next_Question.Click += new System.EventHandler(this.button_Next_Question_Click);
            // 
            // button_Submit
            // 
            this.button_Submit.Location = new System.Drawing.Point(158, 572);
            this.button_Submit.Margin = new System.Windows.Forms.Padding(4);
            this.button_Submit.Name = "button_Submit";
            this.button_Submit.Size = new System.Drawing.Size(112, 34);
            this.button_Submit.TabIndex = 7;
            this.button_Submit.Text = "提交";
            this.button_Submit.UseVisualStyleBackColor = true;
            this.button_Submit.Click += new System.EventHandler(this.button_Submit_Click);
            // 
            // FormQA
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 18F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(426, 694);
            this.Controls.Add(this.button_Submit);
            this.Controls.Add(this.button_Next_Question);
            this.Controls.Add(this.button_Last_Question);
            this.Controls.Add(this.checkBox_D);
            this.Controls.Add(this.checkBox_C);
            this.Controls.Add(this.checkBox_B);
            this.Controls.Add(this.checkBox_A);
            this.Controls.Add(this.textBoxQuestion);
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "FormQA";
            this.Text = "答题";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBoxQuestion;
        private System.Windows.Forms.CheckBox checkBox_A;
        private System.Windows.Forms.CheckBox checkBox_B;
        private System.Windows.Forms.CheckBox checkBox_C;
        private System.Windows.Forms.CheckBox checkBox_D;
        private System.Windows.Forms.Button button_Last_Question;
        private System.Windows.Forms.Button button_Next_Question;
        private System.Windows.Forms.Button button_Submit;
    }
}

