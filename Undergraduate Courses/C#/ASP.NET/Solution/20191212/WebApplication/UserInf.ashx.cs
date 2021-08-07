using Perject.BLL;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using User.Model;
namespace WebApplication
{
    /// <summary>
    /// UserInf 的摘要说明
    /// </summary>
    public class UserInf : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            UserInfoService userInfoService = new UserInfoService();

            int id;
            if (int.TryParse(context.Request.QueryString["编号"], out id))
            {
                UserInfo userinf = userInfoService.GetEntity(id);

                string strPath = context.Request.MapPath("userInf.html");
                string strCont = File.ReadAllText(strPath);
                strCont = strCont.Replace("$name", userinf.UserName).Replace("$pwd", userinf.UserPass).Replace("$email", userinf.Email);
                context.Response.Write(strCont);
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