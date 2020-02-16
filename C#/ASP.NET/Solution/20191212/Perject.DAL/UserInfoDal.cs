using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using User.Model;
using System.Data;
using System.Data.SqlClient;
namespace Perject.DAL
{
    public class UserInfoDal
    {
        /// <summary>
        /// 查询全部信息
        /// </summary>
        /// <returns></returns>
        public List<UserInfo> GetUserInfoList()
        {
            string str = "select * from Table_1";
            DataTable da= SqlHelper.GetTable(str,CommandType.Text);
            List<UserInfo> list = null;
            if (da.Rows.Count>0)
            {
                list = new List<UserInfo>();
                UserInfo userInfo = null;
                foreach (DataRow datarow in da.Rows)
                {
                    userInfo = new UserInfo();
                    LoadUserInfo(datarow, userInfo);
                    list.Add(userInfo);
                }
            }
            return list;
        }

        public static void LoadUserInfo(DataRow datarow, UserInfo userInfo)
        {
            userInfo.UserID= Convert.ToInt32(datarow["编号"]);
            //userInfo.UserName = datarow["用户名"].ToString();
            userInfo.UserName = datarow["用户名"] != null ? datarow["用户名"].ToString() : string.Empty;
            userInfo.UserPass = datarow["密码"] != null ? datarow["密码"].ToString() : string.Empty;
            userInfo.Email = datarow["邮箱"] != null ? datarow["邮箱"].ToString() : string.Empty;
            userInfo.RegTime = Convert.ToDateTime(datarow["时间"]);
        }

        /// <summary>
        /// 查询一个人的详情
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public UserInfo GetEntity(int id) {
            string str = "select * from Table_1 where 编号=@id";
            DataTable da = SqlHelper.GetTable(str, CommandType.Text,new SqlParameter("@id",id));
            UserInfo userInfo = null;
            if (da.Rows.Count>0)
            {
                userInfo = new UserInfo();
                LoadUserInfo(da.Rows[0], userInfo);
            }
            return userInfo;
        }

        /// <summary>
        /// 删除一条数据
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public int DeleteEntity(int id) {
            string str = "delete from Table_1 where 编号=@id ";
            int num = SqlHelper.GetExecuteNonQuery(str, CommandType.Text, new SqlParameter("@id", id));
            return num;
        }


        /// <summary>
        /// 添加一条数据
        /// </summary>
        /// <param name="userInfo"></param>
        /// <returns></returns>
        public int AddUserInfo(UserInfo userInfo) {
            string str = "insert into Table_1(用户名,密码,时间,邮箱) values(@name,@pwd,@regtime,@email)";

            SqlParameter[] pars={
                                //new SqlParameter("@name", userInfo.UserName),
                                  new SqlParameter("@name",SqlDbType.NVarChar,30),
                                  new SqlParameter("@pwd",SqlDbType.NVarChar,30),
                                  new SqlParameter("@regtime",SqlDbType.DateTime),
                                  new SqlParameter("@email",SqlDbType.NVarChar,30),
                                };
            pars[0].Value=userInfo.UserName;
            pars[1].Value=userInfo.UserPass;
            pars[2].Value=userInfo.RegTime;
            pars[3].Value=userInfo.Email;

            return SqlHelper.GetExecuteNonQuery(str, CommandType.Text, pars);
            
        }

        public int UpdateUserInfo(UserInfo userInfo)
        {
            //string str = "update Table_1 set 用户名=@userName,密码=@userPass,时间=@regtime,邮箱=@userEmail where 编号=@id ";
            string str = "update Table_1 set 用户名=@userName,密码=@userPass,邮箱=@userEmail where 编号=@id ";
            SqlParameter[] pars ={
                                //new SqlParameter("@name", userInfo.UserName),
                                  new SqlParameter("@userName",SqlDbType.NVarChar,30),
                                  new SqlParameter("@userPass",SqlDbType.NVarChar,30),
                                  //new SqlParameter("@regtime",SqlDbType.DateTime),
                                  new SqlParameter("@userEmail",SqlDbType.NVarChar,30),
                                  new SqlParameter("@id",SqlDbType.Int,4),
                                };
            pars[0].Value = userInfo.UserName;
            pars[1].Value = userInfo.UserPass;
            //pars[2].Value = userInfo.RegTime;
            //pars[3].Value = userInfo.Email;
            //pars[4].Value = userInfo.UserID;
            pars[2].Value = userInfo.Email;
            pars[3].Value = userInfo.UserID;
            return SqlHelper.GetExecuteNonQuery(str, CommandType.Text, pars);
        }

    }
}
