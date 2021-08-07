using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;
using System.Media;

namespace MusicPlayer
{
    public partial class FormMain_MusicPlayer : Form
    {
        /// <summary>
        ///
        /// </summary>
        public FormMain_MusicPlayer()
        {
            InitializeComponent();
        }
        List<string> list = new List<string>();
        SoundPlayer sp = new SoundPlayer();

        /// <summary>
        /// 打开音乐文件目录，获取音乐文件
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void buttonOpenFile_Click(object sender, EventArgs e)
        {
            OpenFileDialog pfd = new OpenFileDialog();
            // pfd.InitialDirectory = Application.StartupPath + @"..\..\Music";
            pfd.InitialDirectory = @"..\..\Music";
            pfd.Multiselect = true;
            pfd.Filter = "音乐文件|*.wav|所有文件|*.*";
            pfd.Title = "请选择音乐文件";
            pfd.ShowDialog();
            string[] path = pfd.FileNames;
            for (int i = 0; i < path.Length; i++)
            {
                listBoxMusicList.Items.Add(Path.GetFileName(path[i]));
                list.Add(path[i]);
            }
            listBoxMusicList.SelectedIndex = 0;
        }

        /// <summary>
        /// 播放上一首音乐
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void buttonLastSong_Click(object sender, EventArgs e)
        {
            int index = listBoxMusicList.SelectedIndex;
            listBoxMusicList.SelectedIndex = index;
            sp.SoundLocation = list[index];
            //这个方法只播放一遍
            sp.Play();
            //这个方法循环播放
            //sp.PlayLooping();
        }

        /// <summary>
        /// 播放下一首音乐
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void buttonNextTrack_Click(object sender, EventArgs e)
        {
            int index = listBoxMusicList.SelectedIndex;
            index--;
            if (index == 0)
            {
                index = listBoxMusicList.Items.Count;
            }
            listBoxMusicList.SelectedIndex = index;
            sp.SoundLocation = list[index];
            buttonPlay_Click(sender, e);
        }

        /// <summary>
        /// 获取当前播放音乐序号，开始播放
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void buttonPlay_Click(object sender, EventArgs e)
        {
            int index = listBoxMusicList.SelectedIndex;
            listBoxMusicList.SelectedIndex = index;
            sp.SoundLocation = list[index];
            //这个方法只播放一遍
            // sp.Play();
            //这个方法循环播放
            sp.PlayLooping();
        }

        /// <summary>
        /// 暂停播放
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void buttonStop_Click(object sender, EventArgs e)
        {
            sp.Stop();
            //sp.Pause();
        }

        /// <summary>
        /// 关闭程序
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void buttonExit_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        /// <summary>
        /// 在播放列表中选择播放音乐
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void listBoxMusicList_DoubleClick(object sender, EventArgs e)
        {
            sp.SoundLocation = list[listBoxMusicList.SelectedIndex];
            buttonPlay_Click(sender, e);
        }
    }
}
