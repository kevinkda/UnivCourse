<%@ WebHandler Language="C#" Class="userInfo" %>

using System;
using System.Web;
using System.IO;
using System.Data;
using System.Data.SqlClient;
using System.Text;

public class userInfo : IHttpHandler {
    
    public void ProcessRequest (HttpContext context) {
        context.Response.ContentType = "text/HTML";
        string connStr = System.Configuration.ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;
        int id;
        if (int.TryParse(context.Request.QueryString["id"], out id))
        {
            using (SqlConnection conn = new SqlConnection(connStr))
            {
                using (SqlDataAdapter apter = new SqlDataAdapter("select * from Table_1 where SN=@id", conn))
                {
                    apter.SelectCommand.Parameters.AddWithValue("@id", id);
                    DataTable dt = new DataTable();
                    apter.Fill(dt);
                    if (dt.Rows.Count > 0)
                    {
                        string strPath = context.Request.MapPath("userInfo.html");
                        string countStr = File.ReadAllText(strPath);
                        countStr = countStr.Replace("$userName", dt.Rows[0]["UserName"].ToString());
                        countStr = countStr.Replace("$userPass", dt.Rows[0]["UserPass"].ToString());
                        countStr = countStr.Replace("$userEmail", dt.Rows[0]["Email"].ToString());
                        context.Response.Write(countStr);
                    }
                    else
                    {
                        context.Response.Write("没有此用户");
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