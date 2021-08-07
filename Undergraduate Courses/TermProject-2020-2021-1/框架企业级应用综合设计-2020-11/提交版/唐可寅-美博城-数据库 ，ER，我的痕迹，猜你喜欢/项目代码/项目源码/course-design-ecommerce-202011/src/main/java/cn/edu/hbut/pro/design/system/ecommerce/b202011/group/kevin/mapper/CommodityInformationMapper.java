package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.CommodityInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Kevin KDA on 2020/11/26 21:30
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
public interface CommodityInformationMapper {
    /**
     * delete by primary key
     *
     * @param commodityId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer commodityId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(CommodityInformation record);

    int insertOrUpdate(CommodityInformation record);

    int insertOrUpdateSelective(CommodityInformation record);

    int insertOrUpdateWithBLOBs(CommodityInformation record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(CommodityInformation record);

    List<CommodityInformation> selectAll();

    /**
     * select by primary key
     *
     * @param commodityId primary key
     * @return object by primary key
     */
    CommodityInformation selectByPrimaryKey(Integer commodityId);

    List<CommodityInformation> selectRecommendList();

    List<CommodityInformation> selectRecommendListByUserId(int userId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CommodityInformation record);

    int updateByPrimaryKeyWithBLOBs(CommodityInformation record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CommodityInformation record);

    int updateBatch(List<CommodityInformation> list);

    int updateBatchSelective(List<CommodityInformation> list);

    int batchInsert(@Param("list") List<CommodityInformation> list);

}