using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using User.Model;
using Perject.BLL;

namespace WebApplication
{
    /// <summary>
    /// ModifiyPush 的摘要说明
    /// </summary>
    public class ModifiyPush : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            UserInfoService userInfoService = new UserInfoService();
            int id;
            UserInfo userInfo = new UserInfo();
            if (int.TryParse(context.Request.Form["id"], out id))
            {
                userInfo.UserName = context.Request.Form["userName"];
                userInfo.UserPass = context.Request.Form["userPass"];
                userInfo.Email = context.Request.Form["userEmail"];
                userInfo.RegTime = DateTime.Now;
                userInfo.UserID = id;
                int i = userInfoService.UpdateUserInfo(userInfo);
                if (i > 0)
                {
                    context.Response.Redirect("WebForm.aspx");
                }
                else
                {
                    context.Response.Write("修改失败！");
                }
            }
            else
            {
                context.Response.Write("程序Bug！");
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