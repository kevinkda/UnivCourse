using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using TestBLL;
using TestModel;

namespace WebApplication4
{
    /// <summary>
    /// update 的摘要说明
    /// </summary>
    public class update : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            UserInfoServer userInfoServer = new UserInfoServer();
            UserInfo userInfo = new UserInfo();
            userInfo.UserName = context.Request.Form["userName"];
            userInfo.UserPass = context.Request.Form["userPwd"];
            userInfo.Email = context.Request.Form["userEmail"];
            userInfo.RegTime = DateTime.Now;
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