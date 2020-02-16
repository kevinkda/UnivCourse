using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using Test.BLL;
using Test.Model;

namespace WebApplication
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
                countStr = countStr.Replace("$pwd", userInfo.UserPass);
                countStr = countStr.Replace("$email",userInfo.Email);
                context.Response.Write(countStr);

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