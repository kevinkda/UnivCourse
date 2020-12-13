package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.PasswordTable;
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
public interface PasswordTableMapper {
    /**
     * delete by primary key
     * @param passId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer passId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(PasswordTable record);

    int insertOrUpdate(PasswordTable record);

    int insertOrUpdateSelective(PasswordTable record);

    int insertOrUpdateWithBLOBs(PasswordTable record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(PasswordTable record);

    /**
     * select by primary key
     * @param passId primary key
     * @return object by primary key
     */
    PasswordTable selectByPrimaryKey(Integer passId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PasswordTable record);

    int updateByPrimaryKeyWithBLOBs(PasswordTable record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PasswordTable record);

    int updateBatch(List<PasswordTable> list);

    int updateBatchSelective(List<PasswordTable> list);

    int batchInsert(@Param("list") List<PasswordTable> list);
}