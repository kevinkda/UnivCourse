package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.UserPrivileges;

import java.util.List;
    /**
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table
 * @classname ${CLASS_NAME}
 * @apiNote 
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
public interface UserPrivilegesService{


    int deleteByPrimaryKey(Integer userId);

    int insert(UserPrivileges record);

    int insertOrUpdate(UserPrivileges record);

    int insertOrUpdateSelective(UserPrivileges record);

    int insertSelective(UserPrivileges record);

    UserPrivileges selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserPrivileges record);

    int updateByPrimaryKey(UserPrivileges record);

    int updateBatch(List<UserPrivileges> list);

    int updateBatchSelective(List<UserPrivileges> list);

    int batchInsert(List<UserPrivileges> list);

}
