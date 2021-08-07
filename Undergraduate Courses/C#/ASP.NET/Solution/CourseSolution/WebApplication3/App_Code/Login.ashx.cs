using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication3.App_Code
{
    /// <summary>
    /// Login 的摘要说明
    /// </summary>
    public class Login : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
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