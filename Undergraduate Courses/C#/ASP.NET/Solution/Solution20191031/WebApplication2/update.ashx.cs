using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using TestBLL;
using TestModel;

namespace WebApplication2
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
            userInfo.UserName = context.Request.Form["userPwd"];
            userInfo.UserName = context.Request.Form["userEmail"];
            userInfo.RegTime = DateTime.Now;
            
            int id;
            if (int.TryParse(context.Request.QueryString["id"], out id))
            {
                if (userInfoServer.UpdataEntityList(userInfo,id) == 1)
                {
                    context.Response.Redirect("UserInfoList.ashx");
                }
                else
                {
                    //context.Response.Write("没有此用户");
                    context.Response.Redirect("Error.html");
                }
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