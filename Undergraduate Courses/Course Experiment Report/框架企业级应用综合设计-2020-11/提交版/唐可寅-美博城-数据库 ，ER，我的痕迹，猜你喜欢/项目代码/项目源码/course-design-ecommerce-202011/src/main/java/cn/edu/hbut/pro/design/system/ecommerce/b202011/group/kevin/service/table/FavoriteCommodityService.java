package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.FavoriteCommodity;

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
public interface FavoriteCommodityService{


    int deleteByPrimaryKey(Integer collectionId);

    int insert(FavoriteCommodity record);

    int insertOrUpdate(FavoriteCommodity record);

    int insertOrUpdateSelective(FavoriteCommodity record);

    int insertSelective(FavoriteCommodity record);

    FavoriteCommodity selectByPrimaryKey(Integer collectionId);

    int updateByPrimaryKeySelective(FavoriteCommodity record);

    int updateByPrimaryKey(FavoriteCommodity record);

    int updateBatch(List<FavoriteCommodity> list);

    int updateBatchSelective(List<FavoriteCommodity> list);

    int batchInsert(List<FavoriteCommodity> list);

}
