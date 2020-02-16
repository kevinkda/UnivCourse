namespace MessageTransmitter_Client
{
    partial class FormClient
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.buttonExit = new System.Windows.Forms.Button();
            this.textBoxPort = new System.Windows.Forms.TextBox();
            this.labelPort = new System.Windows.Forms.Label();
            this.labelIPAddress = new System.Windows.Forms.Label();
            this.buttonStop = new System.Windows.Forms.Button();
            this.textBoxIPAddress = new System.Windows.Forms.TextBox();
            this.textBoxMessage = new System.Windows.Forms.TextBox();
            this.buttonStart = new System.Windows.Forms.Button();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.toolStripMenuItemStart = new System.Windows.Forms.ToolStripMenuItem();
            this.ToolStripMenuItemStop = new System.Windows.Forms.ToolStripMenuItem();
            this.ToolStripMenuItemExit = new System.Windows.Forms.ToolStripMenuItem();
            this.ToolStripMenuItemSend = new System.Windows.Forms.ToolStripMenuItem();
            this.buttonSendMessage = new System.Windows.Forms.Button();
            this.textBoxTransmissibleMessage = new System.Windows.Forms.TextBox();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // buttonExit
            // 
            this.buttonExit.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonExit.Location = new System.Drawing.Point(435, 427);
            this.buttonExit.Name = "buttonExit";
            this.buttonExit.Size = new System.Drawing.Size(75, 23);
            this.buttonExit.TabIndex = 19;
            this.buttonExit.Text = "Exit";
            this.buttonExit.UseVisualStyleBackColor = true;
            this.buttonExit.Click += new System.EventHandler(this.buttonExit_Click);
            // 
            // textBoxPort
            // 
            this.textBoxPort.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.textBoxPort.Location = new System.Drawing.Point(303, 65);
            this.textBoxPort.Name = "textBoxPort";
            this.textBoxPort.Size = new System.Drawing.Size(104, 21);
            this.textBoxPort.TabIndex = 18;
            this.textBoxPort.Text = "50000";
            // 
            // labelPort
            // 
            this.labelPort.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.labelPort.AutoSize = true;
            this.labelPort.Location = new System.Drawing.Point(341, 43);
            this.labelPort.Name = "labelPort";
            this.labelPort.Size = new System.Drawing.Size(29, 12);
            this.labelPort.TabIndex = 17;
            this.labelPort.Text = "Port";
            // 
            // labelIPAddress
            // 
            this.labelIPAddress.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.labelIPAddress.AutoSize = true;
            this.labelIPAddress.Location = new System.Drawing.Point(87, 43);
            this.labelIPAddress.Name = "labelIPAddress";
            this.labelIPAddress.Size = new System.Drawing.Size(59, 12);
            this.labelIPAddress.TabIndex = 16;
            this.labelIPAddress.Text = "IPAddress";
            // 
            // buttonStop
            // 
            this.buttonStop.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonStop.Location = new System.Drawing.Point(435, 110);
            this.buttonStop.Name = "buttonStop";
            this.buttonStop.Size = new System.Drawing.Size(75, 23);
            this.buttonStop.TabIndex = 15;
            this.buttonStop.Text = "Stop";
            this.buttonStop.UseVisualStyleBackColor = true;
            this.buttonStop.Click += new System.EventHandler(this.buttonStop_Click);
            // 
            // textBoxIPAddress
            // 
            this.textBoxIPAddress.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.textBoxIPAddress.Location = new System.Drawing.Point(29, 65);
            this.textBoxIPAddress.Name = "textBoxIPAddress";
            this.textBoxIPAddress.Size = new System.Drawing.Size(174, 21);
            this.textBoxIPAddress.TabIndex = 14;
            this.textBoxIPAddress.Text = "192.168.10.102";
            // 
            // textBoxMessage
            // 
            this.textBoxMessage.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.textBoxMessage.Location = new System.Drawing.Point(29, 110);
            this.textBoxMessage.Multiline = true;
            this.textBoxMessage.Name = "textBoxMessage";
            this.textBoxMessage.Size = new System.Drawing.Size(378, 149);
            this.textBoxMessage.TabIndex = 13;
            // 
            // buttonStart
            // 
            this.buttonStart.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonStart.Location = new System.Drawing.Point(435, 64);
            this.buttonStart.Name = "buttonStart";
            this.buttonStart.Size = new System.Drawing.Size(75, 23);
            this.buttonStart.TabIndex = 12;
            this.buttonStart.Text = "Start";
            this.buttonStart.UseVisualStyleBackColor = true;
            this.buttonStart.Click += new System.EventHandler(this.buttonStart_Click);
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
            this.menuStrip1.TabIndex = 20;
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
            // ToolStripMenuItemExit
            // 
            this.ToolStripMenuItemExit.Name = "ToolStripMenuItemExit";
            this.ToolStripMenuItemExit.Size = new System.Drawing.Size(40, 21);
            this.ToolStripMenuItemExit.Text = "Exit";
            this.ToolStripMenuItemExit.Click += new System.EventHandler(this.ToolStripMenuItemExit_Click);
            // 
            // ToolStripMenuItemSend
            // 
            this.ToolStripMenuItemSend.Name = "ToolStripMenuItemSend";
            this.ToolStripMenuItemSend.Size = new System.Drawing.Size(49, 21);
            this.ToolStripMenuItemSend.Text = "Send";
            this.ToolStripMenuItemSend.Click += new System.EventHandler(this.ToolStripMenuItemSend_Click);
            // 
            // buttonSendMessage
            // 
            this.buttonSendMessage.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonSendMessage.Location = new System.Drawing.Point(435, 397);
            this.buttonSendMessage.Name = "buttonSendMessage";
            this.buttonSendMessage.Size = new System.Drawing.Size(75, 23);
            this.buttonSendMessage.TabIndex = 22;
            this.buttonSendMessage.Text = "Send";
            this.buttonSendMessage.UseVisualStyleBackColor = true;
            this.buttonSendMessage.Click += new System.EventHandler(this.buttonSendMessage_Click);
            // 
            // textBoxTransmissibleMessage
            // 
            this.textBoxTransmissibleMessage.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.textBoxTransmissibleMessage.Location = new System.Drawing.Point(29, 271);
            this.textBoxTransmissibleMessage.Multiline = true;
            this.textBoxTransmissibleMessage.Name = "textBoxTransmissibleMessage";
            this.textBoxTransmissibleMessage.Size = new System.Drawing.Size(378, 149);
            this.textBoxTransmissibleMessage.TabIndex = 21;
            // 
            // FormClient
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(548, 462);
            this.Controls.Add(this.buttonExit);
            this.Controls.Add(this.textBoxPort);
            this.Controls.Add(this.labelPort);
            this.Controls.Add(this.labelIPAddress);
            this.Controls.Add(this.buttonStop);
            this.Controls.Add(this.textBoxIPAddress);
            this.Controls.Add(this.textBoxMessage);
            this.Controls.Add(this.buttonStart);
            this.Controls.Add(this.menuStrip1);
            this.Controls.Add(this.buttonSendMessage);
            this.Controls.Add(this.textBoxTransmissibleMessage);
            this.Name = "FormClient";
            this.Text = "Client";
            this.Load += new System.EventHandler(this.FormClient_Load);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button buttonExit;
        private System.Windows.Forms.TextBox textBoxPort;
        private System.Windows.Forms.Label labelPort;
        private System.Windows.Forms.Label labelIPAddress;
        private System.Windows.Forms.Button buttonStop;
        private System.Windows.Forms.TextBox textBoxIPAddress;
        private System.Windows.Forms.TextBox textBoxMessage;
        private System.Windows.Forms.Button buttonStart;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuItemStart;
        private System.Windows.Forms.ToolStripMenuItem ToolStripMenuItemStop;
        private System.Windows.Forms.ToolStripMenuItem ToolStripMenuItemExit;
        private System.Windows.Forms.ToolStripMenuItem ToolStripMenuItemSend;
        private System.Windows.Forms.Button buttonSendMessage;
        private System.Windows.Forms.TextBox textBoxTransmissibleMessage;
    }
}