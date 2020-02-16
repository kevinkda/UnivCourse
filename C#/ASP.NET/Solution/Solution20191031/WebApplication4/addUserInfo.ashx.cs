using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using TestBLL;
using TestModel;

namespace WebApplication4
{
    /// <summary>
    /// addUserInfo 的摘要说明
    /// </summary>
    public class addUserInfo : IHttpHandler
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
            if (userInfoServer.AddEntityList(userInfo) == 1)
            {
                context.Response.Redirect("UserInfoList.ashx");
            }
            else
            {
                //context.Response.Write("没有此用户");
                context.Response.Redirect("Error.html");
            }

           // context.Response.Write(context.Request.Form["userName"]);
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