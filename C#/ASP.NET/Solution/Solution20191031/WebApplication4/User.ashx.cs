using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using TestBLL;
using TestModel;

namespace WebApplication4
{
    /// <summary>
    /// User 的摘要说明
    /// </summary>
    public class User : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";

            UserInfoServer userInfoServer = new UserInfoServer();
            int id;
            if (int.TryParse(context.Request.QueryString["id"], out id))
            {
                UserInfo userInfo = userInfoServer.GetEntityList(id);
                string StrPath = context.Request.MapPath("User.html");
                string countStr = File.ReadAllText(StrPath);
                countStr = countStr.Replace("$userName", userInfo.UserName);
                countStr = countStr.Replace("$userPass", userInfo.UserPass);
                countStr = countStr.Replace("$userEmail", userInfo.Email);
                context.Response.Write(countStr);
            }
            else
            {
                context.Response.Write("没有此用户");
            }
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