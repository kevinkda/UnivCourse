package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.ShoppingCart;
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
public interface ShoppingCartMapper {
    /**
     * delete by primary key
     * @param itemId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer itemId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(ShoppingCart record);

    int insertOrUpdate(ShoppingCart record);

    int insertOrUpdateSelective(ShoppingCart record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(ShoppingCart record);

    /**
     * select by primary key
     * @param itemId primary key
     * @return object by primary key
     */
    ShoppingCart selectByPrimaryKey(Integer itemId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(ShoppingCart record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(ShoppingCart record);

    int updateBatch(List<ShoppingCart> list);

    int updateBatchSelective(List<ShoppingCart> list);

    int batchInsert(@Param("list") List<ShoppingCart> list);
}