using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using Test.BLL;
using Test.Model;
using System.Text;
namespace WebApplication
{
    /// <summary>
    /// UserInfoList 的摘要说明
    /// </summary>
    public class UserInfoList : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            UserInfoServer userInfoServer = new UserInfoServer();
            List<UserInfo> list = userInfoServer.GetEntityList();

            StringBuilder sb = new StringBuilder();
            foreach (UserInfo userInfo in list)
            {
                sb.AppendFormat("<tr><td>{0}</td><td>{1}</td><td>{2}</td><td>{3}</td><td>{4}</td><td><a href='User.ashx?id={5}'>详情</a></td><td><a href='delete.ashx?id={5}' class='del' >删除</a></td><td><a href='update.ashx?id={5}'  >修改</a></td></tr>", userInfo.ID, userInfo.UserName, userInfo.UserPass, userInfo.RegTime, userInfo.Email, userInfo.ID);
            }
            string str = context.Request.MapPath("UserInfoList.html");
            string countStr = File.ReadAllText(str);
            countStr = countStr.Replace("$tdoby", sb.ToString());
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