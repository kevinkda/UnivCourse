package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.BrandInfo;
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
public interface BrandInfoMapper {
    /**
     * delete by primary key
     * @param brandId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer brandId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(BrandInfo record);

    int insertOrUpdate(BrandInfo record);

    int insertOrUpdateSelective(BrandInfo record);

    int insertOrUpdateWithBLOBs(BrandInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(BrandInfo record);

    /**
     * select by primary key
     * @param brandId primary key
     * @return object by primary key
     */
    BrandInfo selectByPrimaryKey(Integer brandId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(BrandInfo record);

    int updateByPrimaryKeyWithBLOBs(BrandInfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(BrandInfo record);

    int updateBatch(List<BrandInfo> list);

    int updateBatchSelective(List<BrandInfo> list);

    int batchInsert(@Param("list") List<BrandInfo> list);
}