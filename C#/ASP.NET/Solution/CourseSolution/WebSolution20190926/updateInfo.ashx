<%@ WebHandler Language="C#" Class="Edit" %>

using System;
using System.Data.SqlClient;
using System.Web;

public class Edit : IHttpHandler {
    
    public void ProcessRequest (HttpContext context) {
        context.Response.ContentType = "text/html";
        string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;
        int id;
        if (int.TryParse(context.Request.Form["hid"], out id))
        {
            using (SqlConnection conn = new SqlConnection(connStr))
            {
                using (SqlCommand cmd=new SqlCommand())
                {
                    conn.Open();
                    cmd.Connection = conn;
                    cmd.CommandText = "update Table_1 set UserName=@userName,UserPass=@userPass,Email=@userEmail where SN=@id";
                    cmd.Parameters.Add("@userName", context.Request.Form["userName"]);
                    cmd.Parameters.Add("@userPass", context.Request.Form["userPwd"]);
                    cmd.Parameters.Add("@userEmail", context.Request.Form["userEmail"]);
                    cmd.Parameters.Add("@hid", id);
                    if (cmd.ExecuteNonQuery()>0)
                    {
                        context.Response.Redirect("Handler01.ashx");
                    }
                    else
                    {
                        context.Response.Redirect("Error.html");
                    }
                }
            }
        }
        else
        {
                    context.Response.Write("参数有误");
        }
    }
 
    public bool IsReusable {
        get {
            return false;
        }
    }

}