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
using System.Data.SqlClient;
using System.Collections.Specialized;


namespace WebApplication2.App_Code
{
    /// <summary>
    /// _080011 的摘要说明
    /// </summary>
    public class _080011 : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/plain";
            context.Response.Write("Hello World");
        }
        protected void Page_Load(object sender, EventArgs e)
        {
            string[] adu = Request.Form.GetValues("adu");
            string[] adp = Request.Form.GetValues("adp");

            SqlConnection sqlconn;
            string sqlconnstr;
            sqlconnstr = "server=localhost;uid=sa;pwd=123;database=Exam;";
            sqlconn = new SqlConnection(sqlconnstr);
            sqlconn.Open();
            SqlCommand myComm = new SqlCommand("select * from admin where ad_name='" + adu[0] + "' AND ad_pass ='" + adp[0] + "'", sqlconn);
            SqlDataReader myRead;
            myRead = myComm.ExecuteReader();
            if (myRead.Read())
            {
                Session["username"] = adu[0];
                Session["password"] = adp[0];
                Response.Write("<script>alert('登录成功');window.window.location.href='08002.aspx';</script>");
                myRead.Close();
            }
            else
            {
                myRead.Close();
                Response.Write("<script>alert('用户名或密码错误!如果还未注册，请先注册！');window.window.location.href='08002.aspx';</script>");
            }
            sqlconn.Close();
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