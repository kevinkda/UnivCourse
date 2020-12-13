package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.UserPrivileges;
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
public interface UserPrivilegesMapper {
    /**
     * delete by primary key
     * @param userId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(UserPrivileges record);

    int insertOrUpdate(UserPrivileges record);

    int insertOrUpdateSelective(UserPrivileges record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UserPrivileges record);

    /**
     * select by primary key
     * @param userId primary key
     * @return object by primary key
     */
    UserPrivileges selectByPrimaryKey(Integer userId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UserPrivileges record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UserPrivileges record);

    int updateBatch(List<UserPrivileges> list);

    int updateBatchSelective(List<UserPrivileges> list);

    int batchInsert(@Param("list") List<UserPrivileges> list);
}