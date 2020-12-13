package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.AmapDistrictTable;
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
public interface AmapDistrictTableMapper {
    /**
     * delete by primary key
     * @param districtId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer districtId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(AmapDistrictTable record);

    int insertOrUpdate(AmapDistrictTable record);

    int insertOrUpdateSelective(AmapDistrictTable record);

    int insertOrUpdateWithBLOBs(AmapDistrictTable record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(AmapDistrictTable record);

    /**
     * select by primary key
     * @param districtId primary key
     * @return object by primary key
     */
    AmapDistrictTable selectByPrimaryKey(Integer districtId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AmapDistrictTable record);

    int updateByPrimaryKeyWithBLOBs(AmapDistrictTable record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(AmapDistrictTable record);

    int updateBatch(List<AmapDistrictTable> list);

    int updateBatchSelective(List<AmapDistrictTable> list);

    int batchInsert(@Param("list") List<AmapDistrictTable> list);
}