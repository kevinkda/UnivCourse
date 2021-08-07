package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.SystemPermissions;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper
 * @classname ${CLASS_NAME}
 * @apiNote 
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Mapper
public interface SystemPermissionsMapper {
    /**
     * delete by primary key
     * @param privilegeId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer privilegeId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(SystemPermissions record);

    int insertOrUpdate(SystemPermissions record);

    int insertOrUpdateSelective(SystemPermissions record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SystemPermissions record);

    /**
     * select by primary key
     * @param privilegeId primary key
     * @return object by primary key
     */
    SystemPermissions selectByPrimaryKey(Integer privilegeId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SystemPermissions record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SystemPermissions record);

    int updateBatch(List<SystemPermissions> list);

    int updateBatchSelective(List<SystemPermissions> list);

    int batchInsert(@Param("list") List<SystemPermissions> list);
}