using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using TestBLL;
using TestModel;

namespace WebApplication3
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
                countStr = countStr.Replace("$UserName", userInfo.UserName);
                countStr = countStr.Replace("$UserPass", userInfo.UserPass);
                countStr = countStr.Replace("$Email", userInfo.Email);
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