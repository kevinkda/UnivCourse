package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.DiscountInfo;

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
public interface DiscountInfoService{


    int deleteByPrimaryKey(Integer discountId);

    int insert(DiscountInfo record);

    int insertOrUpdate(DiscountInfo record);

    int insertOrUpdateSelective(DiscountInfo record);

    int insertSelective(DiscountInfo record);

    DiscountInfo selectByPrimaryKey(Integer discountId);

    int updateByPrimaryKeySelective(DiscountInfo record);

    int updateByPrimaryKey(DiscountInfo record);

    int updateBatch(List<DiscountInfo> list);

    int updateBatchSelective(List<DiscountInfo> list);

    int batchInsert(List<DiscountInfo> list);

}
