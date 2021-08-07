using System;
using System.Data;
using System.Configuration;
using System.Collections;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;


namespace WebApplication2.App_Code
{
    /// <summary>
    /// _08001a1 的摘要说明
    /// </summary>
    public class _08001a1 : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            

        }
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["username"] != null || Session["userpass"] != null)
            {
                Response.Write("欢迎" + Session["username"] + "!");
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