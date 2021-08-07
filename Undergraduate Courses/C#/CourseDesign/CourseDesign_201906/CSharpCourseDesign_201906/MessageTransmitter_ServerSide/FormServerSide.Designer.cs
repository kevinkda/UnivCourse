namespace MessageTransmitter_ServerSide
{
    partial class FormServerSide
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
            this.buttonStart = new System.Windows.Forms.Button();
            this.textBoxMessage = new System.Windows.Forms.TextBox();
            this.textBoxIPAddress = new System.Windows.Forms.TextBox();
            this.buttonStop = new System.Windows.Forms.Button();
            this.labelIPAddress = new System.Windows.Forms.Label();
            this.labelPort = new System.Windows.Forms.Label();
            this.textBoxPort = new System.Windows.Forms.TextBox();
            this.buttonExit = new System.Windows.Forms.Button();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.toolStripMenuItemStart = new System.Windows.Forms.ToolStripMenuItem();
            this.ToolStripMenuItemStop = new System.Windows.Forms.ToolStripMenuItem();
            this.ToolStripMenuItemSend = new System.Windows.Forms.ToolStripMenuItem();
            this.ToolStripMenuItemExit = new System.Windows.Forms.ToolStripMenuItem();
            this.textBoxTransmissibleMessage = new System.Windows.Forms.TextBox();
            this.buttonSendMessage = new System.Windows.Forms.Button();
            this.textBoxMaxNumConnect = new System.Windows.Forms.TextBox();
            this.labelMaxNumConnect = new System.Windows.Forms.Label();
            this.comboBoxIPPort = new System.Windows.Forms.ComboBox();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // buttonStart
            // 
            this.buttonStart.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonStart.Location = new System.Drawing.Point(435, 52);
            this.buttonStart.Name = "buttonStart";
            this.buttonStart.Size = new System.Drawing.Size(75, 23);
            this.buttonStart.TabIndex = 0;
            this.buttonStart.Text = "Start";
            this.buttonStart.UseVisualStyleBackColor = true;
            this.buttonStart.Click += new System.EventHandler(this.buttonStart_Click);
            // 
            // textBoxMessage
            // 
            this.textBoxMessage.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.textBoxMessage.Location = new System.Drawing.Point(29, 98);
            this.textBoxMessage.Multiline = true;
            this.textBoxMessage.Name = "textBoxMessage";
            this.textBoxMessage.Size = new System.Drawing.Size(378, 149);
            this.textBoxMessage.TabIndex = 1;
            // 
            // textBoxIPAddress
            // 
            this.textBoxIPAddress.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.textBoxIPAddress.Location = new System.Drawing.Point(29, 53);
            this.textBoxIPAddress.Name = "textBoxIPAddress";
            this.textBoxIPAddress.Size = new System.Drawing.Size(174, 21);
            this.textBoxIPAddress.TabIndex = 2;
            this.textBoxIPAddress.Text = "192.168.10.102";
            // 
            // buttonStop
            // 
            this.buttonStop.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonStop.Location = new System.Drawing.Point(435, 98);
            this.buttonStop.Name = "buttonStop";
            this.buttonStop.Size = new System.Drawing.Size(75, 23);
            this.buttonStop.TabIndex = 4;
            this.buttonStop.Text = "Stop";
            this.buttonStop.UseVisualStyleBackColor = true;
            this.buttonStop.Click += new System.EventHandler(this.buttonStop_Click);
            // 
            // labelIPAddress
            // 
            this.labelIPAddress.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.labelIPAddress.AutoSize = true;
            this.labelIPAddress.Location = new System.Drawing.Point(87, 32);
            this.labelIPAddress.Name = "labelIPAddress";
            this.labelIPAddress.Size = new System.Drawing.Size(59, 12);
            this.labelIPAddress.TabIndex = 5;
            this.labelIPAddress.Text = "IPAddress";
            // 
            // labelPort
            // 
            this.labelPort.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.labelPort.AutoSize = true;
            this.labelPort.Location = new System.Drawing.Point(247, 32);
            this.labelPort.Name = "labelPort";
            this.labelPort.Size = new System.Drawing.Size(29, 12);
            this.labelPort.TabIndex = 6;
            this.labelPort.Text = "Port";
            // 
            // textBoxPort
            // 
            this.textBoxPort.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.textBoxPort.Location = new System.Drawing.Point(209, 54);
            this.textBoxPort.Name = "textBoxPort";
            this.textBoxPort.Size = new System.Drawing.Size(104, 21);
            this.textBoxPort.TabIndex = 7;
            this.textBoxPort.Text = "50000";
            // 
            // buttonExit
            // 
            this.buttonExit.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonExit.Location = new System.Drawing.Point(435, 415);
            this.buttonExit.Name = "buttonExit";
            this.buttonExit.Size = new System.Drawing.Size(75, 23);
            this.buttonExit.TabIndex = 8;
            this.buttonExit.Text = "Exit";
            this.buttonExit.UseVisualStyleBackColor = true;
            this.buttonExit.Click += new System.EventHandler(this.buttonExit_Click);
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripMenuItemStart,
            this.ToolStripMenuItemStop,
            this.ToolStripMenuItemSend,
            this.ToolStripMenuItemExit});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(548, 25);
            this.menuStrip1.TabIndex = 9;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // toolStripMenuItemStart
            // 
            this.toolStripMenuItemStart.Name = "toolStripMenuItemStart";
            this.toolStripMenuItemStart.Size = new System.Drawing.Size(47, 21);
            this.toolStripMenuItemStart.Text = "Start";
            this.toolStripMenuItemStart.Click += new System.EventHandler(this.toolStripMenuItemStart_Click);
            // 
            // ToolStripMenuItemStop
            // 
            this.ToolStripMenuItemStop.Name = "ToolStripMenuItemStop";
            this.ToolStripMenuItemStop.Size = new System.Drawing.Size(47, 21);
            this.ToolStripMenuItemStop.Text = "Stop";
            this.ToolStripMenuItemStop.Click += new System.EventHandler(this.ToolStripMenuItemStop_Click);
            // 
            // ToolStripMenuItemSend
            // 
            this.ToolStripMenuItemSend.Name = "ToolStripMenuItemSend";
            this.ToolStripMenuItemSend.Size = new System.Drawing.Size(49, 21);
            this.ToolStripMenuItemSend.Text = "Send";
            this.ToolStripMenuItemSend.Click += new System.EventHandler(this.ToolStripMenuItemSend_Click);
            // 
            // ToolStripMenuItemExit
            // 
            this.ToolStripMenuItemExit.Name = "ToolStripMenuItemExit";
            this.ToolStripMenuItemExit.Size = new System.Drawing.Size(40, 21);
            this.ToolStripMenuItemExit.Text = "Exit";
            this.ToolStripMenuItemExit.Click += new System.EventHandler(this.ToolStripMenuItemExit_Click);
            // 
            // textBoxTransmissibleMessage
            // 
            this.textBoxTransmissibleMessage.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.textBoxTransmissibleMessage.Location = new System.Drawing.Point(29, 259);
            this.textBoxTransmissibleMessage.Multiline = true;
            this.textBoxTransmissibleMessage.Name = "textBoxTransmissibleMessage";
            this.textBoxTransmissibleMessage.Size = new System.Drawing.Size(378, 149);
            this.textBoxTransmissibleMessage.TabIndex = 10;
            // 
            // buttonSendMessage
            // 
            this.buttonSendMessage.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonSendMessage.Location = new System.Drawing.Point(435, 385);
            this.buttonSendMessage.Name = "buttonSendMessage";
            this.buttonSendMessage.Size = new System.Drawing.Size(75, 23);
            this.buttonSendMessage.TabIndex = 11;
            this.buttonSendMessage.Text = "Send";
            this.buttonSendMessage.UseVisualStyleBackColor = true;
            this.buttonSendMessage.Click += new System.EventHandler(this.buttonSendMessage_Click);
            // 
            // textBoxMaxNumConnect
            // 
            this.textBoxMaxNumConnect.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.textBoxMaxNumConnect.Location = new System.Drawing.Point(319, 54);
            this.textBoxMaxNumConnect.Name = "textBoxMaxNumConnect";
            this.textBoxMaxNumConnect.Size = new System.Drawing.Size(88, 21);
            this.textBoxMaxNumConnect.TabIndex = 12;
            this.textBoxMaxNumConnect.Text = "10";
            // 
            // labelMaxNumConnect
            // 
            this.labelMaxNumConnect.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.labelMaxNumConnect.AutoSize = true;
            this.labelMaxNumConnect.Location = new System.Drawing.Point(322, 32);
            this.labelMaxNumConnect.Name = "labelMaxNumConnect";
            this.labelMaxNumConnect.Size = new System.Drawing.Size(83, 12);
            this.labelMaxNumConnect.TabIndex = 13;
            this.labelMaxNumConnect.Text = "MaxNumConnect";
            // 
            // comboBoxIPPort
            // 
            this.comboBoxIPPort.FormattingEnabled = true;
            this.comboBoxIPPort.Location = new System.Drawing.Point(414, 259);
            this.comboBoxIPPort.Name = "comboBoxIPPort";
            this.comboBoxIPPort.Size = new System.Drawing.Size(121, 20);
            this.comboBoxIPPort.TabIndex = 14;
            // 
            // FormServerSide
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(548, 462);
            this.Controls.Add(this.comboBoxIPPort);
            this.Controls.Add(this.labelMaxNumConnect);
            this.Controls.Add(this.textBoxMaxNumConnect);
            this.Controls.Add(this.buttonSendMessage);
            this.Controls.Add(this.textBoxTransmissibleMessage);
            this.Controls.Add(this.buttonExit);
            this.Controls.Add(this.textBoxPort);
            this.Controls.Add(this.labelPort);
            this.Controls.Add(this.labelIPAddress);
            this.Controls.Add(this.buttonStop);
            this.Controls.Add(this.textBoxIPAddress);
            this.Controls.Add(this.textBoxMessage);
            this.Controls.Add(this.buttonStart);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "FormServerSide";
            this.Text = "Server";
            this.Load += new System.EventHandler(this.FormServerSide_Load);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button buttonStart;
        private System.Windows.Forms.TextBox textBoxMessage;
        private System.Windows.Forms.TextBox textBoxIPAddress;
        private System.Windows.Forms.Button buttonStop;
        private System.Windows.Forms.Label labelIPAddress;
        private System.Windows.Forms.Label labelPort;
        private System.Windows.Forms.TextBox textBoxPort;
        private System.Windows.Forms.Button buttonExit;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuItemStart;
        private System.Windows.Forms.ToolStripMenuItem ToolStripMenuItemStop;
        private System.Windows.Forms.ToolStripMenuItem ToolStripMenuItemExit;
        private System.Windows.Forms.TextBox textBoxTransmissibleMessage;
        private System.Windows.Forms.Button buttonSendMessage;
        private System.Windows.Forms.ToolStripMenuItem ToolStripMenuItemSend;
        private System.Windows.Forms.TextBox textBoxMaxNumConnect;
        private System.Windows.Forms.Label labelMaxNumConnect;
        private System.Windows.Forms.ComboBox comboBoxIPPort;
    }
}

