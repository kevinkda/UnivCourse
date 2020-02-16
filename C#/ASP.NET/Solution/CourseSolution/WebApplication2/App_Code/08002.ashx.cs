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
    /// _08002 的摘要说明
    /// </summary>
    public class _08002 : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/plain";
            context.Response.Write("Hello World");
        }
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["username"] == null && Session["userpass"] == null)
                Response.Write("<script>alert('请先登录');window.window.location.href='08001a.aspx';</script>");
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