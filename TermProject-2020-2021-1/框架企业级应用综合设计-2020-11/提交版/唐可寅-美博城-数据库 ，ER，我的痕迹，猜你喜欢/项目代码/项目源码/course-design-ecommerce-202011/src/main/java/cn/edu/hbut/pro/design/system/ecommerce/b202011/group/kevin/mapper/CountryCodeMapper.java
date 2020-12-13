package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.CountryCode;
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
public interface CountryCodeMapper {
    /**
     * delete by primary key
     * @param countryId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer countryId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(CountryCode record);

    int insertOrUpdate(CountryCode record);

    int insertOrUpdateSelective(CountryCode record);

    int insertOrUpdateWithBLOBs(CountryCode record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CountryCode record);

    /**
     * select by primary key
     * @param countryId primary key
     * @return object by primary key
     */
    CountryCode selectByPrimaryKey(Integer countryId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CountryCode record);

    int updateByPrimaryKeyWithBLOBs(CountryCode record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CountryCode record);

    int updateBatch(List<CountryCode> list);

    int updateBatchSelective(List<CountryCode> list);

    int batchInsert(@Param("list") List<CountryCode> list);
}