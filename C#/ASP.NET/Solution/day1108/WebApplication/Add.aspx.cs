using Perject.BLL;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using User.Model;

namespace WebApplication
{
    public partial class Add : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            //if (!string.IsNullOrEmpty(Request.Form["hidd"]))
            if (IsPostBack)
            {
                UserInfoService userInfoService = new UserInfoService();
                UserInfo userInfo = new UserInfo();
                userInfo.UserName = Request.Form["UserName"];
                userInfo.UserPass = Request.Form["UserPass"];
                userInfo.Email = Request.Form["Email"];
                userInfo.RegTime = DateTime.Now;
                if (userInfoService.AddUserInfo(userInfo) > 0)
                {
                    Response.Redirect("WebForm.aspx");
                }
                else
                {
                    Response.Write("添加失败");
                }
            }

        }
    }
}