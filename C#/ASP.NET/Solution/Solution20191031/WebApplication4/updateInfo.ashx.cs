using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using TestBLL;
using TestModel;

namespace WebApplication4
{
    /// <summary>
    /// updateInfo 的摘要说明
    /// </summary>
    public class updateInfo : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            int id;
            if (int.TryParse(context.Request.Form["hid"], out id))
            {
                UserInfo userInfo = new UserInfo();
                userInfo.UserName = context.Request.Form["userName"];
                userInfo.UserPass = context.Request.Form["userPwd"];
                userInfo.Email = context.Request.Form["userEmail"];
                userInfo.RegTime = DateTime.Now;
                UserInfoServer userInfoServer = new UserInfoServer();
                userInfoServer.UpdataEntityList(Convert.ToInt32(context.Request.Form["hid"]));
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