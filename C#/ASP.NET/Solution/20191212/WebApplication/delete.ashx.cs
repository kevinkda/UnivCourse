using Perject.BLL;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;


namespace WebApplication
{
    /// <summary>
    /// delete 的摘要说明
    /// </summary>
    public class delete : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";

            UserInfoService userInfoServer = new UserInfoService();
            int id;
            if (int.TryParse(context.Request.QueryString["编号"], out id))
            {
                if (userInfoServer.DeleteEntity(id) == 1)
                {
                    context.Response.Redirect("UserList.ashx");
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
