package com.chinasoft.shop.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface UserMapper {

    public Map<String,Object> queryUserIsExist(Map<String,Object> map);

    public int insertUser(Map<String,Object> map);

    public Map<String,Object> userLogin(Map<String,Object> map);

    public int updateUser(Map<String,Object> map);
    //查询地址数据
    public List<Map<String,Object>> queryAddressList(Map<String,Object> map);

    public int updateUserAddressOne(Map<String,Object> map);

    public int updateUserAddressTwo(Map<String,Object> map);

    public List<Map<String,Object>> selectAreaList();

    public int addressInsert(String userAddressPeople,String userPhone,String userEmail,String userAddress,int userAddressStatus);
}
