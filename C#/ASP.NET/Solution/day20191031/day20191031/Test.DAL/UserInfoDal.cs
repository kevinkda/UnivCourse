using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Test.Model;
using System.Data;
using System.Data.SqlClient;

namespace Test.DAL
{
    public class UserInfoDal
    {
        /// <summary>
        /// 查询全部
        /// </summary>
        /// <returns></returns>
        public List<UserInfo> GetEntityList() {
            string str = "select * from Table01";
            DataTable da = SqlHelper.GetTable(str, CommandType.Text);
            List<UserInfo> list = null;
            if (da.Rows.Count>0)
            {
                list = new List<UserInfo>();
                UserInfo userInfo = null;
                foreach (DataRow row in da.Rows)
                {
                    userInfo = new UserInfo();
                    LoadUser(row, userInfo);
                    list.Add(userInfo);
                }
            }
            return list;
        }

        public static void LoadUser(DataRow row,UserInfo userInfo){
            userInfo.ID = Convert.ToInt32(row["编号"]);
            userInfo.UserName = row["用户名"].ToString();
            userInfo.UserPass = row["密码"].ToString();
            userInfo.Email = row["邮箱"].ToString();
            userInfo.RegTime = Convert.ToDateTime(row["时间"]); 
        }

        /// <summary>
        /// 查询详情
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public UserInfo GetEntityList(int id) {
            string str = "select * from Table01 where 编号=@id";
            DataTable da = SqlHelper.GetTable(str, CommandType.Text, new SqlParameter("@id", id));
            UserInfo userInfo = null;
            if (da.Rows.Count>0)
            {
                userInfo = new UserInfo();
                LoadUser(da.Rows[0], userInfo);
            }
            return userInfo;
        }

        /// <summary>
        /// 删除数据
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public int DeleteUserInfo(int id) {
            string str = "delete from Table_1 where 编号=@id";
            int num = SqlHelper.GetExecuteNonQuery(str, CommandType.Text, new SqlParameter("@id", id));
            return num;
        }

        /// <summary>
        /// 添加数据
        /// </summary>
        /// <returns></returns>
        public int AddUserInfo() {
            string str = "insert into Table_1(用户名,密码,邮箱,时间) values(@userName,@pwd,@email,@regtime)";
            UserInfo userInfo = new UserInfo();
            SqlParameter[] pars= {
                                 //new SqlParameter("@userName", userInfo.UserName),  可能出现数据类型错误
                                    new SqlParameter("@userName", SqlDbType.NVarChar,32),
                                    new SqlParameter("@pwd", SqlDbType.NVarChar,32),
                                    new SqlParameter("@email", SqlDbType.NVarChar,32),
                                    new SqlParameter("@regtime", SqlDbType.DateTime),
                                 };
            pars[0].Value = userInfo.UserName;
            pars[1].Value = userInfo.UserPass;
            pars[2].Value = userInfo.Email;
            //pars[3].Value = userInfo.RegTime;
            pars[3].Value = DateTime.Now;

            int num = SqlHelper.GetExecuteNonQuery(str, CommandType.Text, pars);
            return num;
        }

        public int UpdateUserInfo(int id) {
            string str = "update Table_1 set 用户名=@userName,密码=@pwd,邮箱=@email,时间=@regtime where 编号=@id";
            UserInfo userInfo = new UserInfo();
            SqlParameter[] pars ={
                                new SqlParameter("@userName", SqlDbType.NVarChar,32),
                                 new SqlParameter("@pwd", SqlDbType.NVarChar,32),
                                 new SqlParameter("@email", SqlDbType.NVarChar,32),
                                 new SqlParameter("@regtime", SqlDbType.DateTime),
                                 new SqlParameter("@id",id),
                                };
            pars[0].Value = userInfo.UserName;
            pars[1].Value = userInfo.UserPass;
            pars[2].Value = userInfo.Email;
            //pars[3].Value = userInfo.RegTime;
            pars[3].Value = DateTime.Now;

            return SqlHelper.GetExecuteNonQuery(str, CommandType.Text, pars);
        }

    }
}
