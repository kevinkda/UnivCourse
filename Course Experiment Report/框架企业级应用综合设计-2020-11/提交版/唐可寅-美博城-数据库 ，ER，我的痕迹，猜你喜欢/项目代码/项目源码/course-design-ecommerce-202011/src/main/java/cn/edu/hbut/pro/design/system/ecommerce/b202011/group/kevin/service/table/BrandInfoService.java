package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.BrandInfo;

import java.util.List;
    /**
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table
 * @classname ${CLASS_NAME}
 * @apiNote 
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
public interface BrandInfoService{


    int deleteByPrimaryKey(Integer brandId);

    int insert(BrandInfo record);

    int insertOrUpdate(BrandInfo record);

    int insertOrUpdateSelective(BrandInfo record);

    int insertOrUpdateWithBLOBs(BrandInfo record);

    int insertSelective(BrandInfo record);

    BrandInfo selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(BrandInfo record);

    int updateByPrimaryKeyWithBLOBs(BrandInfo record);

    int updateByPrimaryKey(BrandInfo record);

    int updateBatch(List<BrandInfo> list);

    int updateBatchSelective(List<BrandInfo> list);

    int batchInsert(List<BrandInfo> list);

}
