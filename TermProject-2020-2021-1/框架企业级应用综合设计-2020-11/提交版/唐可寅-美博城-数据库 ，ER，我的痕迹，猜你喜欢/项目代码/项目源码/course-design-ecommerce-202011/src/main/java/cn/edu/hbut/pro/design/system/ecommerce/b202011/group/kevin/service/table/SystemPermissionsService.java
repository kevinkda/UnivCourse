package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.SystemPermissions;

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
public interface SystemPermissionsService{


    int deleteByPrimaryKey(Integer privilegeId);

    int insert(SystemPermissions record);

    int insertOrUpdate(SystemPermissions record);

    int insertOrUpdateSelective(SystemPermissions record);

    int insertSelective(SystemPermissions record);

    SystemPermissions selectByPrimaryKey(Integer privilegeId);

    int updateByPrimaryKeySelective(SystemPermissions record);

    int updateByPrimaryKey(SystemPermissions record);

    int updateBatch(List<SystemPermissions> list);

    int updateBatchSelective(List<SystemPermissions> list);

    int batchInsert(List<SystemPermissions> list);

}
