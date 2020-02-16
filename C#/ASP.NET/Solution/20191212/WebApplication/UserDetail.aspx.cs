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
    public partial class UserDetail : System.Web.UI.Page
    {
        public UserInfo entity { set; get; }
        protected void Page_Load(object sender, EventArgs e)
        {
            UserInfoService userInfoService = new UserInfoService();
            int id;
            List<UserInfo> list = userInfoService.GetEntityList();
            if (int.TryParse(Context.Request.QueryString["编号"], out id))
            {
                entity = userInfoService.GetEntity(id);
            }
        }
    }
}