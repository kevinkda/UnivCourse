package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.DiscountInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author Kevin KDA on 2020/11/21 21:24
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
public interface DiscountInfoMapper {
    /**
     * delete by primary key
     * @param discountId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer discountId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(DiscountInfo record);

    int insertOrUpdate(DiscountInfo record);

    int insertOrUpdateSelective(DiscountInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(DiscountInfo record);

    /**
     * select by primary key
     * @param discountId primary key
     * @return object by primary key
     */
    DiscountInfo selectByPrimaryKey(Integer discountId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(DiscountInfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(DiscountInfo record);

    int updateBatch(List<DiscountInfo> list);

    int updateBatchSelective(List<DiscountInfo> list);

    int batchInsert(@Param("list") List<DiscountInfo> list);
}