using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MessageTransmitter_Client
{
    public partial class FormClient : Form
    {
        public FormClient()
        {
            InitializeComponent();
        }

        Socket socketSend;

        /// <summary>
        ///
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void buttonStart_Click(object sender, EventArgs e)
        {
            try
            {
                socketSend = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp);
                //服务端IP地址
                IPAddress IPAddress = IPAddress.Parse(textBoxIPAddress.Text);
                //端口号
                IPEndPoint Port = new IPEndPoint(IPAddress, Convert.ToInt32(textBoxPort.Text));
                //绑定端口号
                // socketSend.Bind(Port);
                socketSend.Connect(Port);
                ShowMsg("连接成功");
                // socketSend.Listen(10);
                //创建监听线程
                Thread th = new Thread(Receive);
                th.IsBackground = true;
                th.Start(socketSend);
            }
            catch
            {

            }
        }

        /// <summary>
        ///
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void buttonStop_Click(object sender, EventArgs e)
        {

        }

        /// <summary>
        ///
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void buttonSendMessage_Click(object sender, EventArgs e)
        {
            try
            {
                string str = textBoxTransmissibleMessage.Text;
                byte[] buffer = Encoding.UTF8.GetBytes(str);
                socketSend.Send(buffer);
            }
            catch
            {

            }
        }

        /// <summary>
        ///
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void buttonExit_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        /// <summary>
        ///
        /// </summary>
        /// <param name="str"></param>
        public void ShowMsg(string str)
        {
            textBoxMessage.AppendText(str + "\r\n");
        }

        /// <summary>
        /// 接收数据
        /// </summary>
        /// <param name="obj"></param>
        void Receive(object obj)
        {
            Socket socketSend = obj as Socket;
            while (true)
            {
                try
                {
                    byte[] buffer = new byte[1024 * 1024 * 2];
                    int r = socketSend.Receive(buffer);
                    // Thread.Sleep(200);
                    if (r == 0)
                    {
                        break;
                    }
                    string str = Encoding.UTF8.GetString(buffer, 0, r);
                    //str = socketSend.RemoteEndPoint + str;
                    ShowMsg(socketSend.RemoteEndPoint + " : " + str);
                }
                catch { }
            }
        }

        private void toolStripMenuItemStart_Click(object sender, EventArgs e)
        {
            buttonStart_Click(sender, e);
        }

        private void ToolStripMenuItemStop_Click(object sender, EventArgs e)
        {
            buttonStop_Click(sender, e);
        }

        private void ToolStripMenuItemSend_Click(object sender, EventArgs e)
        {
            buttonExit_Click(sender, e);
        }

        private void ToolStripMenuItemExit_Click(object sender, EventArgs e)
        {
            buttonSendMessage_Click(sender, e);
        }

        private void FormClient_Load(object sender, EventArgs e)
        {
            Control.CheckForIllegalCrossThreadCalls = false;
        }
    }
}
