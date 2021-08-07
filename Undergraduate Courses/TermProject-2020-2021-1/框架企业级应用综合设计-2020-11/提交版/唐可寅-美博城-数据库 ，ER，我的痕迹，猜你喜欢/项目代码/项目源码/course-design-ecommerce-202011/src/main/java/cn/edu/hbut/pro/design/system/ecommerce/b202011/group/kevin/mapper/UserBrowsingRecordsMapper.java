package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.UserBrowsingRecords;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Kevin KDA on 2020/11/26 22:09
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
public interface UserBrowsingRecordsMapper {
    /**
     * delete by primary key
     *
     * @param recordId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer recordId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(UserBrowsingRecords record);

    int insertOrUpdate(UserBrowsingRecords record);

    int insertOrUpdateSelective(UserBrowsingRecords record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(UserBrowsingRecords record);

    /**
     * select by primary key
     *
     * @param recordId primary key
     * @return object by primary key
     */
    UserBrowsingRecords selectByPrimaryKey(Integer recordId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UserBrowsingRecords record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UserBrowsingRecords record);

    int updateBatch(List<UserBrowsingRecords> list);

    int updateBatchSelective(List<UserBrowsingRecords> list);

    int batchInsert(@Param("list") List<UserBrowsingRecords> list);
}