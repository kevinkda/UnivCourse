<%@ WebHandler Language="C#" Class="Handler01" %>

using System;
using System.Web;
using System.IO;

public class Handler01 : IHttpHandler {
    
    public void ProcessRequest (HttpContext context) {
        context.Response.ContentType = "text/html";
/*
        context.Response.Write("Hello World");
*/
        string filePath = context.Request.MapPath("HtmlPage01.html");
        string fileContent = File.ReadAllText(filePath);
        int count =Convert.ToInt32(context.Request.Form["txtCount"]);
        count++;
        string strHtml= fileContent.Replace("$value",count.ToString());
        context.Response.Write(strHtml);
    }
 
    public bool IsReusable {
        get {
            return false;
        }
    }

}