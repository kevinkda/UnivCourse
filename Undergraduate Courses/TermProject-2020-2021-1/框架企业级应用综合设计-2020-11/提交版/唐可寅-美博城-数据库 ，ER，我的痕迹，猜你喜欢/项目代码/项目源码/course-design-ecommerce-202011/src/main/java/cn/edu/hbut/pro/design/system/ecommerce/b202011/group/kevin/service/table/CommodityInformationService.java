package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.CommodityInformation;

import java.util.List;

/**
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
public interface CommodityInformationService {


    int deleteByPrimaryKey(Integer commodityId);

    int insert(CommodityInformation record);

    int insertOrUpdate(CommodityInformation record);

    int insertOrUpdateSelective(CommodityInformation record);

    int insertOrUpdateWithBLOBs(CommodityInformation record);

    int insertSelective(CommodityInformation record);

    List<CommodityInformation> selectAll();

    CommodityInformation selectByPrimaryKey(Integer commodityId);

    List<CommodityInformation> selectRecommendList();

    List<CommodityInformation> selectRecommendListByUserId(int userId);

    int updateByPrimaryKeySelective(CommodityInformation record);

    int updateByPrimaryKeyWithBLOBs(CommodityInformation record);

    int updateByPrimaryKey(CommodityInformation record);

    int updateBatch(List<CommodityInformation> list);

    int updateBatchSelective(List<CommodityInformation> list);

    int batchInsert(List<CommodityInformation> list);

}



