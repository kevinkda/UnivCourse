using Perject.BLL;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Text;
using User.Model;
using System.IO;
namespace WebApplication
{
    /// <summary>
    /// UserList 的摘要说明
    /// </summary>
    public class UserList : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            UserInfoService userInfoService = new UserInfoService();
            List<UserInfo> list = userInfoService.GetEntityList();
            StringBuilder sb = new StringBuilder();
            foreach (UserInfo userInfo in list)
            {
                sb.AppendFormat("<tr><td>{0}</td><td>{1}</td><td>{2}</td><td>{3}</td><td>{4}</td><td><a href='UserInf.ashx?编号={5}'>详情</a></td><td><a href='delete.ashx?编号={5}' class='del'>删除</a></td><td><a href='update.ashx?编号={5}'>修改</a></td></tr>", userInfo.UserID, userInfo.UserName, userInfo.UserPass, userInfo.RegTime, userInfo.Email, userInfo.UserID);
            }

            string strPath = context.Request.MapPath("UserList.html");
            string countStr = File.ReadAllText(strPath);
            countStr = countStr.Replace("$tbody", sb.ToString());
            context.Response.Write(countStr);
        }

        public bool IsReusable
        {
            get
            {
                return false;
            }
        }
    }
}