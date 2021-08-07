using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestModel
{
    public class UserInfo
    {
        public int SN { set; get; }
        public string UserName { set; get; }
        public string UserPass { set; get; }
        public string Email { set; get; }
        public DateTime RegTime { set; get; }

        //public UserInfo()
        //{
        //}

        //public UserInfo(string userName, string userPass, string email)
        //{
        //    UserName = userName;
        //    UserPass = userPass;
        //    Email = email;
        //}
    }
}