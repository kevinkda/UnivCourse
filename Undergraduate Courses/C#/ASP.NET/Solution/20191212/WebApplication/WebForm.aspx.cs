using Perject.BLL;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using User.Model;

namespace WebApplication
{
    public partial class WebForm : System.Web.UI.Page
    {
        //public string strHtml { set; get; }

        public List<UserInfo> UserList { set; get; }
        protected void Page_Load(object sender, EventArgs e)  //Page_事件名称   Page_Init
        {

            UserInfoService userInfoService = new UserInfoService();
            List<UserInfo> list = userInfoService.GetEntityList();
            //StringBuilder sb = new StringBuilder();
            //foreach (UserInfo userInfo in list)
            //{
            //    sb.AppendFormat("<tr><td>{0}</td><td>{1}</td><td>{2}</td><td>{3}</td><td>{4}</td><td><a href='UserInf.ashx?编号={5}'>详情</a></td><td><a href='delete.ashx?编号={5}' class='del'>删除</a></td><td><a href='update.ashx?编号={5}'>修改</a></td></tr>", userInfo.UserID, userInfo.UserName, userInfo.UserPass, userInfo.RegTime, userInfo.Email, userInfo.UserID);
            //}
            //strHtml = sb.ToString();
            UserList = list;
        }
    }
}