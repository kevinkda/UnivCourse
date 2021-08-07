<%@ WebHandler Language="C#" Class="delete" %>

using System;
using System.Web;
using System.Data;
using System.Data.SqlClient;
//using WebSolution20190926;

public class delete : IHttpHandler {
    
    public void ProcessRequest (HttpContext context) {
        context.Response.ContentType = "text/html";
        string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;
        int id;
        if (int.TryParse(context.Request.QueryString["id"], out id))
        {
            using (SqlConnection conn = new SqlConnection(connStr))
            {
                using (SqlCommand cmd = new SqlCommand())
                {
                    conn.Open();
                    cmd.Connection = conn;
                    cmd.CommandText = "delete from Table_1 where SN=@id";
                    cmd.Parameters.Add("@id", id);
                    if (cmd.ExecuteNonQuery() > 0)
                    {
                        context.Response.Redirect("Handler01.ashx");
                    }
                    else
                    {
                        //context.Response.Write("没有此用户");
                        context.Response.Redirect("Error.ashx");
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