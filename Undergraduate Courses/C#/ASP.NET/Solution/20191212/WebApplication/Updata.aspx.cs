using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using Perject.BLL;
using User.Model;

namespace WebApplication
{
    public partial class Updata : System.Web.UI.Page
    {
        public UserInfo entity { set; get; }
        protected void Page_Load(object sender, EventArgs e)
        {
            UserInfoService userInfoService = new UserInfoService();
            int id;
            if (int.TryParse(Context.Request.QueryString["id"], out id))
            {
                UserInfo userInfo = userInfoService.GetEntity(id);
                entity = userInfo;
                if (!string.IsNullOrEmpty(Request.Form["IsPostBack"]))
                {
                    userInfo.UserName = Context.Request.Form["UserName"];
                    userInfo.UserPass = Context.Request.Form["UserPass"];
                    userInfo.Email = Context.Request.Form["UserEmail"];
                    userInfo.UserID = id;
                    userInfo.RegTime = DateTime.Now;
                    int num = userInfoService.UpdateUserInfo(userInfo);
                    if (num > 0)
                    {
                        Context.Response.Redirect("WebForm2.aspx");
                    }
                    else
                    {
                        Context.Response.Redirect("error.html");
                    }
                }

            }
        }
    }
}