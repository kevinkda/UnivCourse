using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;
namespace Perject.DAL
{
    /// <summary>
    /// 工具类，帮助做数据库的增删改查
    /// </summary>
    public class SqlHelper
    {
       private static readonly string connStr = ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;
       /// <summary>
       /// 得到一张带有数据的表
       /// </summary>
       /// <param name="str">sql命令</param>
       /// <param name="type">规定执行的类型</param>
       /// <param name="pars">可以替换的参数</param>
       /// <returns></returns>
        public static DataTable GetTable(string str,CommandType type,params SqlParameter[] pars) {
            using (SqlConnection conn = new SqlConnection(connStr)) {
                using (SqlDataAdapter apter = new SqlDataAdapter(str, conn)) {
                    apter.SelectCommand.CommandType = type;
                    if (pars!=null)
                    {
                        apter.SelectCommand.Parameters.AddRange(pars);
                    }
                    conn.Open();
                    DataTable da = new DataTable();
                    apter.Fill(da);
                    return da;
                }  
            } 
        }

        public static int GetExecuteNonQuery(string str, CommandType type, params SqlParameter[] pars)
        {
            using (SqlConnection conn = new SqlConnection(connStr)) {
                using (SqlCommand cmd = new SqlCommand(str,conn))
                {
                    cmd.CommandType = type;
                    if (pars!=null)
                    {
                        cmd.Parameters.AddRange(pars);
                    }
                    conn.Open();
                    return cmd.ExecuteNonQuery();
                }
            }
        }

    }
}
