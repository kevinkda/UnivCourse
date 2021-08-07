<%@ WebHandler Language="C#" Class="Login" %>

using System;
using System.Web;
using System.Data;
using System.Data.SqlClient;

public class Login : IHttpHandler {
    
    public void ProcessRequest (HttpContext context) {
        context.Response.ContentType = "text/html";
        int count = 0;
        string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;//找个配置文件中的数据库
        using (SqlConnection conn = new SqlConnection(connStr))//打开数据库链接
        {
            using (SqlCommand cmd = new SqlCommand())
            {  //新建储存对象
                conn.Open();
                cmd.Connection = conn;
                cmd.CommandText = "select count (*) from admin where UserName=@userName and UserPass=@userPass";
                cmd.Parameters.Add(new SqlParameter("@userName", context.Request.Form["userName"]));
                cmd.Parameters.Add(new SqlParameter("@userPass", context.Request.Form["userPass"]));
                count = (int)cmd.ExecuteScalar();


                if (count > 0)
                {
                    context.Response.Write("登陆成功");
                }

                else
                {
                    context.Response.Write("登陆失败");
                }

            }
        }
    }
 
    public bool IsReusable {
        get {
            return false;
        }
    }
}

