package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.SystemParameters;
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
public interface SystemParametersMapper {
    /**
     * delete by primary key
     * @param parameterId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer parameterId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(SystemParameters record);

    int insertOrUpdate(SystemParameters record);

    int insertOrUpdateSelective(SystemParameters record);

    int insertOrUpdateWithBLOBs(SystemParameters record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SystemParameters record);

    /**
     * select by primary key
     * @param parameterId primary key
     * @return object by primary key
     */
    SystemParameters selectByPrimaryKey(Integer parameterId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SystemParameters record);

    int updateByPrimaryKeyWithBLOBs(SystemParameters record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SystemParameters record);

    int updateBatch(List<SystemParameters> list);

    int updateBatchSelective(List<SystemParameters> list);

    int batchInsert(@Param("list") List<SystemParameters> list);
}