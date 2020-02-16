using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TestModel;

namespace TestDAL
{
    public class UserInfoDal
    {
        /// <summary>
        /// 查询全部
        /// </summary>
        /// <returns></returns>
        public List<UserInfo> GetEntityList()
        {
            string str = "select * from Table_1";
            DataTable da = SqlHelper.GetTable(str, CommandType.Text);
            List<UserInfo> list = null;
            if (da.Rows.Count > 0)
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

        private void LoadUser(DataRow row, UserInfo userInfo)
        {
            userInfo.SN = Convert.ToInt32(row["SN"]);
//            userInfo.UserName = row["UserName"] != DBNull.Value ? row["UserName"].ToString() : string.Empty;
            userInfo.UserName = row["UserName"].ToString();
//            userInfo.UserPass = row["UserPass"] != DBNull.Value ? row["UserPass"].ToString() : string.Empty;
            userInfo.UserPass = row["UserPass"].ToString();
//            userInfo.Email = row["Email"] != DBNull.Value ? row["Email"].ToString() : string.Empty;
            userInfo.Email = row["Email"].ToString();
            userInfo.RegTime = Convert.ToDateTime(row["RegTime"]);
        }

        /// <summary>
        /// 返回一条记录
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public UserInfo GetEntityList(int id)
        {
            string sql = "select * from Table_1 where SN=@id";
            DataTable da = SqlHelper.GetTable(sql, CommandType.Text, new SqlParameter("@id", id));
            UserInfo userInfo = null;
            if (da.Rows.Count > 0)
            {
                userInfo = new UserInfo();
                LoadUser(da.Rows[0], userInfo);
            }

            return userInfo;
        }

        /// <summary>
        /// 返回一条记录
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public UserInfo GetEntityModel(int id)
        {
            string sql = "select * from Table_1 where SN=@SN";
            DataTable da = SqlHelper.GetTable(sql, CommandType.Text, new SqlParameter("@SN", id));
            UserInfo userInfo = null;
            if (da.Rows.Count > 0)
            {
                userInfo = new UserInfo();
                LoadUser(da.Rows[0], userInfo);
            }

            return userInfo;
        }

        /// <summary>
        /// 删除一条记录
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public int DeleteUserInfo(int id)
        {
            string sql = "delete from Table_1 where SN=@SN";
            int num = SqlHelper.GetExecuteNonQuery(sql, CommandType.Text, new SqlParameter("@SN", id));
            return num;
        }

        /// <summary>
        /// 删除一条记录
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public int DeleteEntityModel(int id)
        {
            string sql = "delete from UserInfo where SN=@SN";
            return SqlHelper.GetExecuteNonQuery(sql, CommandType.Text, new
                SqlParameter("@SN", id));
        }
        /// <summary>
        /// 插入一条记录
        /// </summary>
        /// <param name="userInfo"></param>
        /// <returns></returns>
        public int AddUserInfo(UserInfo userInfo)
        {
            string sql = "insert into Table_1(UserName,UserPass,Email,RegTime) values(@UserName,@UserPass,@Email,@RegTime)";
            SqlParameter[] pars =
            {
                new SqlParameter("@UserName", SqlDbType.NVarChar, 32),
                new SqlParameter("@UserPass", SqlDbType.NVarChar, 32),
                new SqlParameter("@Email", SqlDbType.NVarChar, 32),
                new SqlParameter("@RegTime", SqlDbType.DateTime)
            };
            pars[0].Value = userInfo.UserName;
            pars[1].Value = userInfo.UserPass;
            pars[2].Value = userInfo.Email;
            pars[3].Value = DateTime.Now;
            int num = SqlHelper.GetExecuteNonQuery(sql, CommandType.Text, pars);
            return num;

        }

        /// <summary>
        /// 插入一条记录
        /// </summary>
        /// <param name="userInfo"></param>
        /// <returns></returns>
        public int InsertEntityModel(UserInfo userInfo)
        {
            string sql =
                "insert into UserInfo(UserName,UserPass,Email,RegTime) values(@UserName,@UserPass,@Email,@RegTime)";
            SqlParameter[] pars =
            {
                new SqlParameter("@UserName", SqlDbType.NVarChar, 32),
                new SqlParameter("@UserPass", SqlDbType.NVarChar, 32),
                new SqlParameter("@Email", SqlDbType.NVarChar, 32), 
                new SqlParameter("@RegTime", SqlDbType.DateTime)
            };
            pars[0].Value = userInfo.UserName;
            pars[1].Value = userInfo.UserPass;
            pars[2].Value = userInfo.Email;
            pars[3].Value = userInfo.RegTime;
            return SqlHelper.GetExecuteNonQuery(sql, CommandType.Text, pars);
        }

        /// <summary>
        /// 更新一条记录
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public int UpdataUserInfo(int id)
        {
            string sql = "update Table_1 set UserName=@UserName,UserPass=@UserPass,Email=@Email,RegTime=@RegTime where SN=@SN";
            UserInfo userInfo = new UserInfo();
            SqlParameter[] pars =
            {
                new SqlParameter("@UserName", SqlDbType.NVarChar, 32),
                new SqlParameter("@UserPass", SqlDbType.NVarChar, 32),
                new SqlParameter("@Email", SqlDbType.NVarChar, 32), 
                new SqlParameter("@RegTime", SqlDbType.DateTime),
                new SqlParameter("@SN", SqlDbType.Int, 4)
            };
            pars[0].Value = userInfo.UserName;
            pars[1].Value = userInfo.UserPass;
            pars[2].Value = userInfo.Email;
            pars[3].Value = DateTime.Now;
            pars[4].Value = id;
            //pars[4].Value = userInfo.SN;
            int num = SqlHelper.GetExecuteNonQuery(sql, CommandType.Text, pars);
            return num;
        }
        /// <summary>
        /// 更新一条记录
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public int UpdataUserInfo(UserInfo userInfo,int id)
        {
            string sql = "update Table_1 set UserName=@UserName,UserPass=@UserPass,Email=@Email,RegTime=@RegTime where SN=@SN";

            SqlParameter[] pars =
            {
                new SqlParameter("@UserName", SqlDbType.NVarChar, 32),
                new SqlParameter("@UserPass", SqlDbType.NVarChar, 32),
                new SqlParameter("@Email", SqlDbType.NVarChar, 32), 
                new SqlParameter("@RegTime", SqlDbType.DateTime),
                new SqlParameter("@SN", SqlDbType.Int, 4)
            };
            pars[0].Value = userInfo.UserName;
            pars[1].Value = userInfo.UserPass;
            pars[2].Value = userInfo.Email;
            pars[3].Value = DateTime.Now;
            pars[4].Value = userInfo.SN;
            int num = SqlHelper.GetExecuteNonQuery(sql, CommandType.Text, pars);
            return num;
        }


        /// <summary>
        /// 更新一条记录
        /// </summary>
        /// <param name="userInfo"></param>
        /// <returns></returns>
        public int UpdateEntityModel(UserInfo userInfo)
        {
            string sql =
                "update UserInfo set UserName=@UserName,UserPass=@UserPass,Email=@Email,RegTime=@RegTime where ID=@ID";
            SqlParameter[] pars =
            {
                new SqlParameter("@UserName", SqlDbType.NVarChar, 32),
                new SqlParameter("@UserPass", SqlDbType.NVarChar, 32),
                new SqlParameter("@Email", SqlDbType.NVarChar, 32), new SqlParameter("@RegTime", SqlDbType.DateTime),
                new SqlParameter("@SN", SqlDbType.Int, 4)
            };
            pars[0].Value = userInfo.UserName;
            pars[1].Value = userInfo.UserPass;
            pars[2].Value = userInfo.Email;
            pars[3].Value = userInfo.RegTime;
            pars[4].Value = userInfo.SN;
            return SqlHelper.GetExecuteNonQuery(sql, CommandType.Text, pars);
        }

    }
}