using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data;
using System.Data.SqlClient;
using Microsoft.Win32;

namespace WebApplication1.Models
{
    public class AccessService
    {
        /// <summary>
        /// 根据用户名和密码查询
        /// </summary>
        /// <returns>User</returns>
        public User AdminLogin(User user)
        {
            string sql = string.Format("select userAccount from userInfo where userAccount={0} and userPwd={1}", user.userAccount, user.userPwd);
            SqlDataReader objReader = SQLHelp.GetReader(sql);
            if (objReader.Read())
            {
                user.userAccount = objReader["userAccount"].ToString();
            }
            else
            {
                //如果用户名和密码不正确时则清空当前对象
                user = null;
            }
            //关闭连接
            objReader.Close();
            return user;
        }

        /// <summary>
        /// 添加用户的账号密码（账号不得重复）
        /// </summary>
        /// <returns>User</returns>
        public bool addUser(User user)
        {
            bool flag = true;
            string sql = string.Format("select userAccount from userInfo where userAccount={0} and userPwd={1}", user.userAccount, user.userPwd);
            SqlDataReader objReader = SQLHelp.GetReader(sql);
            if (objReader.Read())
            {
                //判断用户输入的账号是否与已存在的账号相同
                if (objReader["userAccount"].ToString().Equals(user.userAccount))
                {
                    //若相同则返回false
                    flag = false;
                }
                else
                {
                    //若不相同则插入数据进数据库
                    string sql2 = string.Format("insert into userInfo values({0},{1})", user.userAccount, user.userPwd);
                    SqlDataReader objReader2 = SQLHelp.GetReader(sql2);
                    objReader2.Read();
                    //相同则返回true
                    flag = true;
                }
            }
            //关闭连接
            objReader.Close();
            return flag;
        }
    }
}