package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.mapper;

import java.util.List;
import java.util.Map;

/**
 * @author XiaoSir on 2020/11/26 20:28
 * @version 1.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.mapper
 * @classname UserMapper
 * @description TODO
 * @interface/enum
 */
public interface UserMapper {
    //判断用户是否存在的方法
    public Map<String, Object> queryUserIsExist(Map<String, Object> map);

    //用户注册的方法
    public int insertUser(Map<String, Object> map);

    //修改用户的方法
    public int updateUser(Map<String, Object> map);

    public Map<String, Object> userLogin(Map<String, Object> map);

    public List<Map<String, Object>> queryUserShopCartList(Map<String, Object> map);

    public List<Map<String, Object>> queryProductList(Map<String, Object> map);
}
