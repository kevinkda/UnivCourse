using Perject.DAL;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using User.Model;

namespace Perject.BLL
{
    public class UserInfoService
    {
        UserInfoDal userInfoDal = new UserInfoDal();
        public List<UserInfo> GetEntityList() {
            return userInfoDal.GetUserInfoList();
        }

        public UserInfo GetEntity(int id)
        {
            return userInfoDal.GetEntity(id);
        }

        public int DeleteEntity(int id) {
            return userInfoDal.DeleteEntity(id);
        }
        public int AddUserInfo(UserInfo userInfo) {
            return userInfoDal.AddUserInfo(userInfo);
        }
        public int UpdateUserInfo(UserInfo userInfo)
        {
            return userInfoDal.UpdateUserInfo(userInfo);
        }
    }
}
