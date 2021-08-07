package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author XiaoSir on 2020/11/26 20:29
 * @version 1.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.service
 * @classname IUserService
 * @description TODO
 * @interface/enum
 */
public interface IUserService {
    public boolean selectUserIsExist(Map<String, Object> map);

    public String insertUser(Map<String, Object> map, HttpServletRequest request);

    //登录的方法
    public String userLogin(Map<String, Object> map, HttpSession session, HttpServletRequest request);

    public List<Map<String, Object>> queryProductList(Map<String, Object> map);

    //进入该用户的购物车环节
    public String selectUserShopCartList(HttpServletRequest request);
}
