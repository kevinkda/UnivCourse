<%@ WebHandler Language="C#" Class="Register" %>

using System;
using System.Web;
using System.Data;
using System.Data.SqlClient;

public class Register : IHttpHandler {

    public void ProcessRequest(HttpContext context)
    {
        context.Response.ContentType = "text/HTML";
        string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;
        using (SqlConnection conn = new SqlConnection(connStr))
        {
            using (SqlCommand cmd = new SqlCommand())
            {
                conn.Open();
                cmd.Connection = conn;
                cmd.CommandText = "insert into admin(UserName,UserPass) values(@userName,@userPass)";
                //cmd.CommandText = "insert into Table_1(SN,UserName,UserPass,RegTime,Email,GUID) value(null,@userName,@userPass,null,@userEmail,null)";
                cmd.Parameters.Add("@userName", context.Request.Form["userName"]);
                cmd.Parameters.Add("@userPass", context.Request.Form["userPwd"]);
                if (cmd.ExecuteNonQuery() > 0)
                {
                    context.Response.Redirect("Login.ashx");
                }
                else
                {
                    //                    context.Response.Write("输入有误");
                    context.Response.Redirect("Error.html");
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