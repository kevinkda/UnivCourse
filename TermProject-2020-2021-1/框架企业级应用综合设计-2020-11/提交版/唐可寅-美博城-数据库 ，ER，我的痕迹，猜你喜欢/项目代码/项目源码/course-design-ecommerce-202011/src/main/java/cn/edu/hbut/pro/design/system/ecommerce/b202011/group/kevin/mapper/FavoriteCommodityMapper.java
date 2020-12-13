package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.FavoriteCommodity;
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
public interface FavoriteCommodityMapper {
    /**
     * delete by primary key
     * @param collectionId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer collectionId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(FavoriteCommodity record);

    int insertOrUpdate(FavoriteCommodity record);

    int insertOrUpdateSelective(FavoriteCommodity record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(FavoriteCommodity record);

    /**
     * select by primary key
     * @param collectionId primary key
     * @return object by primary key
     */
    FavoriteCommodity selectByPrimaryKey(Integer collectionId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(FavoriteCommodity record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(FavoriteCommodity record);

    int updateBatch(List<FavoriteCommodity> list);

    int updateBatchSelective(List<FavoriteCommodity> list);

    int batchInsert(@Param("list") List<FavoriteCommodity> list);
}