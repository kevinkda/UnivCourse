namespace MusicPlayer
{
    partial class FormMain_MusicPlayer
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
            this.buttonExit = new System.Windows.Forms.Button();
            this.buttonStop = new System.Windows.Forms.Button();
            this.listBoxMusicList = new System.Windows.Forms.ListBox();
            this.buttonPlay = new System.Windows.Forms.Button();
            this.buttonNextTrack = new System.Windows.Forms.Button();
            this.buttonLastSong = new System.Windows.Forms.Button();
            this.buttonOpenFile = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // buttonExit
            // 
            this.buttonExit.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonExit.Location = new System.Drawing.Point(355, 394);
            this.buttonExit.Name = "buttonExit";
            this.buttonExit.Size = new System.Drawing.Size(75, 23);
            this.buttonExit.TabIndex = 13;
            this.buttonExit.Text = "Exit";
            this.buttonExit.UseVisualStyleBackColor = true;
            this.buttonExit.Click += new System.EventHandler(this.buttonExit_Click);
            // 
            // buttonStop
            // 
            this.buttonStop.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonStop.Location = new System.Drawing.Point(355, 168);
            this.buttonStop.Name = "buttonStop";
            this.buttonStop.Size = new System.Drawing.Size(75, 23);
            this.buttonStop.TabIndex = 12;
            this.buttonStop.Text = "Stop";
            this.buttonStop.UseVisualStyleBackColor = true;
            this.buttonStop.Click += new System.EventHandler(this.buttonStop_Click);
            // 
            // listBoxMusicList
            // 
            this.listBoxMusicList.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.listBoxMusicList.FormattingEnabled = true;
            this.listBoxMusicList.ItemHeight = 12;
            this.listBoxMusicList.Location = new System.Drawing.Point(54, 101);
            this.listBoxMusicList.Name = "listBoxMusicList";
            this.listBoxMusicList.Size = new System.Drawing.Size(228, 316);
            this.listBoxMusicList.TabIndex = 7;
            this.listBoxMusicList.DoubleClick += new System.EventHandler(this.listBoxMusicList_DoubleClick);
            // 
            // buttonPlay
            // 
            this.buttonPlay.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonPlay.Location = new System.Drawing.Point(355, 127);
            this.buttonPlay.Name = "buttonPlay";
            this.buttonPlay.Size = new System.Drawing.Size(75, 23);
            this.buttonPlay.TabIndex = 11;
            this.buttonPlay.Text = "Play";
            this.buttonPlay.UseVisualStyleBackColor = true;
            this.buttonPlay.Click += new System.EventHandler(this.buttonPlay_Click);
            // 
            // buttonNextTrack
            // 
            this.buttonNextTrack.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonNextTrack.Location = new System.Drawing.Point(355, 86);
            this.buttonNextTrack.Name = "buttonNextTrack";
            this.buttonNextTrack.Size = new System.Drawing.Size(75, 23);
            this.buttonNextTrack.TabIndex = 10;
            this.buttonNextTrack.Text = "Next Track";
            this.buttonNextTrack.UseVisualStyleBackColor = true;
            this.buttonNextTrack.Click += new System.EventHandler(this.buttonNextTrack_Click);
            // 
            // buttonLastSong
            // 
            this.buttonLastSong.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonLastSong.Location = new System.Drawing.Point(355, 45);
            this.buttonLastSong.Name = "buttonLastSong";
            this.buttonLastSong.Size = new System.Drawing.Size(75, 23);
            this.buttonLastSong.TabIndex = 9;
            this.buttonLastSong.Text = "Last Song";
            this.buttonLastSong.UseVisualStyleBackColor = true;
            this.buttonLastSong.Click += new System.EventHandler(this.buttonLastSong_Click);
            // 
            // buttonOpenFile
            // 
            this.buttonOpenFile.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.buttonOpenFile.Location = new System.Drawing.Point(54, 45);
            this.buttonOpenFile.Name = "buttonOpenFile";
            this.buttonOpenFile.Size = new System.Drawing.Size(75, 23);
            this.buttonOpenFile.TabIndex = 8;
            this.buttonOpenFile.Text = "OpenFile";
            this.buttonOpenFile.UseVisualStyleBackColor = true;
            this.buttonOpenFile.Click += new System.EventHandler(this.buttonOpenFile_Click);
            // 
            // FormMain_MusicPlayer
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(484, 462);
            this.Controls.Add(this.buttonExit);
            this.Controls.Add(this.buttonStop);
            this.Controls.Add(this.listBoxMusicList);
            this.Controls.Add(this.buttonPlay);
            this.Controls.Add(this.buttonNextTrack);
            this.Controls.Add(this.buttonLastSong);
            this.Controls.Add(this.buttonOpenFile);
            this.Name = "FormMain_MusicPlayer";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button buttonExit;
        private System.Windows.Forms.Button buttonStop;
        private System.Windows.Forms.ListBox listBoxMusicList;
        private System.Windows.Forms.Button buttonPlay;
        private System.Windows.Forms.Button buttonNextTrack;
        private System.Windows.Forms.Button buttonLastSong;
        private System.Windows.Forms.Button buttonOpenFile;
    }
}

