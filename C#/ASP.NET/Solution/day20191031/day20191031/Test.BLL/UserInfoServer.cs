using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Test.DAL;
using Test.Model;

namespace Test.BLL
{
    public class UserInfoServer
    {
        UserInfoDal userInfoDal = new UserInfoDal();
        public List<UserInfo> GetEntityList() {
            return userInfoDal.GetEntityList();
        }

        public UserInfo GetEntityList(int id) {
            return userInfoDal.GetEntityList(id);
        }


    }
}
