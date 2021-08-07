using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System;
using System.Linq;
using System.Web.Mvc;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    public class AccessController : Controller
    {
        /// <summary>
        /// 首页访问路径
        /// </summary>
        /// <returns></returns>
        public ActionResult Index()
        {
            return View("Login");
        }

        /// <summary>
        /// 返回用户请求数据结果
        /// </summary>
        /// <returns></returns>
        public ActionResult AdminLogin()
        {
            //[1]获取用户输入数据
            User user = new User()
            {
                userAccount = Request.Params["loginAccount"],
                userPwd = Request.Params["loginPwd"]
            };
            //[2]调用模型与Model交互
            user = new AccessService().AdminLogin(user);
            if (user != null)
            {
                // [3]返回登录视图
                ViewData["loginAccount"] = user.userAccount;
                return View("SuccessForLogin");
            }
            else
            {
                // [4]返回登录视图
                ViewData["errLoginInfo"] = "账号与密码不匹配！";
                return View("SuccessForLogin");
            }

        }

        /// <summary>
        /// 返回用户请求数据结果
        /// </summary>
        /// <returns></returns>
        public ActionResult AdminReg()
        {
            // [1]获取用户输入数据
            User user = new User()
            {
                userAccount = Request.Params["regAccount"],
                userPwd = Request.Params["regPwd"]
            };
            // [2]调用模型与Model交互
            bool flag = new AccessService().addUser(user);
            if (flag)
            {
                // [3]返回注册视图
                return View("SuccessForRegister");
            }
            else
            {
                // [4]返回注册视图
                ViewData["errRegInfo"] = "该账号已被注册！";
                return View("Register");
            }


        }
    }
}