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

                cmd.Parameters.Add("@userName", context.Request.Form["userName"]);
                cmd.Parameters.Add("@userPass", context.Request.Form["userPwd"]);
                cmd.CommandText = "select COUNT(*) from admin where UserName=@userName";
                if ((int)cmd.ExecuteScalar() > 0)
                {
                    context.Response.Redirect("UserExists.html");
                }
                cmd.CommandText = "insert into admin(UserName,UserPass) values(@userName,@userPass)";
                if (cmd.ExecuteNonQuery() > 0)
                {
                    context.Response.Redirect("Success.html");
                }
                else
                {
                    context.Response.Redirect("Error.html");
                }

//                cmd.CommandText = "select COUNT(*) from admin where UserName=@userName";
//                cmd.Parameters.Add("@userName", context.Request.Form["userName"]);
//                int count;
//                count = (int)cmd.ExecuteScalar();
//                if(count>0){
//                    context.Response.Redirect("UserExists.html");
//                }
//                
//                cmd.CommandText = "insert into admin(UserName,UserPass) values(@userName,@userPass)";
//                //cmd.CommandText = "insert into Table_1(SN,UserName,UserPass,RegTime,Email,GUID) value(null,@userName,@userPass,null,@userEmail,null)";
//                //cmd.Parameters.Add("@userName", context.Request.Form["userName"]);
//                cmd.Parameters.Add("@userPass", context.Request.Form["userPwd"]);
//                if (cmd.ExecuteNonQuery() > 0)
//                {
//                    context.Response.Redirect("Success.html");
//                }
//                else
//                {
//                    //                    context.Response.Write("输入有误");
//                    context.Response.Redirect("Error.html");
//                }
            }
        }
    }
 
    public bool IsReusable {
        get {
            return false;
        }
    }

}