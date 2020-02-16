using System;
using System.Collections.Generic;
using System.Configuration;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;
namespace Test.DAL
{
    public class SqlHelper
    {
        private readonly static string connStr = ConfigurationManager.ConnectionStrings["connStr"].ConnectionString;

        /// <summary>
        /// 得到一张带有数据的表格
        /// </summary>
        /// <param name="str">输入的sql命令</param>
        /// <param name="type">输入执行的类型</param>
        /// <param name="pars">sql命令要替换的内容</param>
        /// <returns></returns>
        public static DataTable GetTable(string str,CommandType type,params SqlParameter[] pars) {
            using (SqlConnection conn = new SqlConnection(connStr))
            {   
                using (SqlDataAdapter apter = new SqlDataAdapter(str, conn))
                {
                    apter.SelectCommand.CommandType = type;
                    if (pars!=null)
                    {
                        apter.SelectCommand.Parameters.AddRange(pars);
                    }
                    DataTable da = new DataTable();
                    apter.Fill(da);
                    return da;
                }
            }
        }

        /// <summary>
        /// 得到受到影响的行数
        /// </summary>
        /// <param name="str">输入的sql命令</param>
        /// <param name="type">输入执行的类型</param>
        /// <param name="pars">sql命令要替换的内容</param>
        /// <returns></returns>
        public static int GetExecuteNonQuery(string str, CommandType type, params SqlParameter[] pars)
        {
            using (SqlConnection conn = new SqlConnection(connStr)) {
                using (SqlCommand cmd = new SqlCommand(str, conn))
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
