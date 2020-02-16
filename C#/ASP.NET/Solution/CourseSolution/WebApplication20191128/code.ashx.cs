using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using WebDemo.Common;

namespace WebApplication20191128
{
    /// <summary>
    /// code 的摘要说明
    /// </summary>
    public class code : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/plain";
            ValidateCode vc = new ValidateCode();
            string  strCode=vc.CreateValidateCode(4);
            vc.CreateValidateGraphic(strCode, context);
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