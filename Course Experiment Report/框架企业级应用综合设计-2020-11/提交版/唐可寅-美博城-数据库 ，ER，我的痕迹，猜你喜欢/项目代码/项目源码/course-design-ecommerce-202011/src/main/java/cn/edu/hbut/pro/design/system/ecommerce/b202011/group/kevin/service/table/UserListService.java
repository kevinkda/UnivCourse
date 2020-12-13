package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.UserList;

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
public interface UserListService{


    int deleteByPrimaryKey(Integer userId);

    int insert(UserList record);

    int insertOrUpdate(UserList record);

    int insertOrUpdateSelective(UserList record);

    int insertSelective(UserList record);

    UserList selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserList record);

    int updateByPrimaryKey(UserList record);

    int updateBatch(List<UserList> list);

    int updateBatchSelective(List<UserList> list);

    int batchInsert(List<UserList> list);

}
