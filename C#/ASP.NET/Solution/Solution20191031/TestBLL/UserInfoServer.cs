using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TestModel;
using TestDAL;

namespace TestBLL
{
    public class UserInfoServer
    {
        UserInfoDal userInfoDal = new UserInfoDal();
        public List<UserInfo> GetEntityList()
        {
            return userInfoDal.GetEntityList();
        }

        public UserInfo GetEntityList(int id)
        {
            return userInfoDal.GetEntityList(id);
        }

        public int DeleteEntityList(int id)
        {
            int num = userInfoDal.DeleteUserInfo(id);
            return num;
        }
        public int AddEntityList(UserInfo userInfo)
        {
            return userInfoDal.AddUserInfo(userInfo);
        }
        public int UpdataEntityList(int id)
        {
            return userInfoDal.UpdataUserInfo(id);
        }
        public int UpdataEntityList(UserInfo userInfo, int id)
        {
            return userInfoDal.UpdataUserInfo(id);
        }
    }
}
