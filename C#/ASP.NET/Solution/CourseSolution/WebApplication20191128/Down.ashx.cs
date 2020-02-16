using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication20191128
{
    /// <summary>
    /// Down 的摘要说明
    /// </summary>
    public class Down : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/plain";

            string encodeFileName ="/Image/img.jpg";
            context.Response.AddHeader("Content-Disposition", string.Format("attchment;filename=\"{0}\"", encodeFileName));
            context.Response.WriteFile(encodeFileName);
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