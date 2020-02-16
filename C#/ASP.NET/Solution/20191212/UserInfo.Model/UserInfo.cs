using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace User.Model
{
    public class UserInfo
    {
        public int UserID { set; get; }
        public string UserName { set; get; }
        public string UserPass { set; get; }
        public string Email { set; get; }
        public DateTime RegTime { set; get; }
    }
}
