package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.DiscountDistributionList;

import java.util.List;
    /**
 *
 * @author Kevin KDA on 2020/11/21 21:24
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table
 * @classname ${CLASS_NAME}
 * @apiNote 
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
public interface DiscountDistributionListService{


    int deleteByPrimaryKey(Integer distributionId);

    int insert(DiscountDistributionList record);

    int insertOrUpdate(DiscountDistributionList record);

    int insertOrUpdateSelective(DiscountDistributionList record);

    int insertSelective(DiscountDistributionList record);

    DiscountDistributionList selectByPrimaryKey(Integer distributionId);

    int updateByPrimaryKeySelective(DiscountDistributionList record);

    int updateByPrimaryKey(DiscountDistributionList record);

    int updateBatch(List<DiscountDistributionList> list);

    int updateBatchSelective(List<DiscountDistributionList> list);

    int batchInsert(List<DiscountDistributionList> list);

}
