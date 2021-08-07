using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using TestBLL;

namespace WebApplication4
{
    /// <summary>
    /// delete 的摘要说明
    /// </summary>
    public class delete : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";

            UserInfoServer userInfoServer = new UserInfoServer();
            int id;
            if (int.TryParse(context.Request.QueryString["id"], out id))
            {
                if (userInfoServer.DeleteEntityList(id) == 1)
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