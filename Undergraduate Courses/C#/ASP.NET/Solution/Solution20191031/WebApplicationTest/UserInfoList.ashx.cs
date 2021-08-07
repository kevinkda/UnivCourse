using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Web;
using TestBLL;
using TestModel;

namespace WebApplicationTest
{
    /// <summary>
    /// UserInfoList 的摘要说明
    /// </summary>
    public class UserInfoList : IHttpHandler
    {

        public void ProcessRequest(HttpContext context)
        {
            context.Response.ContentType = "text/html";
            UserInfoServer userInfoService = new UserInfoServer();
            List<UserInfo> list = userInfoService.GetEntityList();
            StringBuilder sb = new StringBuilder();
            foreach (UserInfo userInfo in list)
            {
//                sb.AppendFormat(
//                    "<tr><td>{0}</td><td>{1}</td><td>{2}</td><td>{3}</td><td>{4}</td><td><a href='userInfo.ashx?id={5}'> 详 细 </a></td><td><a href='delete.ashx?id={5}' >删除</a></td><td ><a href='update.ashx?id={5}'>编辑</a></td></tr>",
//                    userInfo.SN, userInfo.UserName, userInfo.UserPass, userInfo.RegTime.ToShortDateString(),
//                    userInfo.Email, userInfo.SN);
                sb.AppendFormat(
                    "<tr><td>{0}</td><td>{1}</td><td>{2}</td><td>{3}</td><td>{4}</td><td><a href='ShowDetail.ashx?id={5}'> 详 细 </a></td></tr>",
                    userInfo.SN, userInfo.UserName, userInfo.UserPass, userInfo.RegTime.ToShortDateString(),
                    userInfo.Email, userInfo.SN);
            }
            string filePath = context.Request.MapPath("UserInfoList.html");
            string fileContent = File.ReadAllText(filePath);
            fileContent = fileContent.Replace("$tbody", sb.ToString());
            context.Response.Write(fileContent);
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