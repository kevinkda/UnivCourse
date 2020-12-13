package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.DiscountDistributionList;
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
public interface DiscountDistributionListMapper {
    /**
     * delete by primary key
     * @param distributionId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer distributionId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(DiscountDistributionList record);

    int insertOrUpdate(DiscountDistributionList record);

    int insertOrUpdateSelective(DiscountDistributionList record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(DiscountDistributionList record);

    /**
     * select by primary key
     * @param distributionId primary key
     * @return object by primary key
     */
    DiscountDistributionList selectByPrimaryKey(Integer distributionId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(DiscountDistributionList record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(DiscountDistributionList record);

    int updateBatch(List<DiscountDistributionList> list);

    int updateBatchSelective(List<DiscountDistributionList> list);

    int batchInsert(@Param("list") List<DiscountDistributionList> list);
}