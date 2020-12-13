package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.UserInfo;

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
public interface UserInfoService{


    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo record);

    int insertOrUpdate(UserInfo record);

    int insertOrUpdateSelective(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    int updateBatch(List<UserInfo> list);

    int updateBatchSelective(List<UserInfo> list);

    int batchInsert(List<UserInfo> list);

}
