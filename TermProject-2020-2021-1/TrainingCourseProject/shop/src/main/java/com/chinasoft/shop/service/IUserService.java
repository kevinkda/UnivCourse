package com.chinasoft.shop.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface IUserService {

    public boolean selectUserIsExist(Map<String,Object> map);

    public String insertUser(Map<String,Object> map, HttpServletRequest request);

    public String userLogin(Map<String,Object> map, HttpSession session);

    public List<Map<String,Object>> queryAddressList(Map<String,Object> map,HttpSession session);

    public int updateUserAddress(Map<String,Object> map);

    public String selectAreaList();

    public int addressInsert(String userAddressPeople,String userPhone,String userEmail,String userAddress,int userAddressStatus);
}
