package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.OrderInfo;
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
public interface OrderInfoMapper {
    /**
     * delete by primary key
     * @param orderId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer orderId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(OrderInfo record);

    int insertOrUpdate(OrderInfo record);

    int insertOrUpdateSelective(OrderInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(OrderInfo record);

    /**
     * select by primary key
     * @param orderId primary key
     * @return object by primary key
     */
    OrderInfo selectByPrimaryKey(Integer orderId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(OrderInfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(OrderInfo record);

    int updateBatch(List<OrderInfo> list);

    int updateBatchSelective(List<OrderInfo> list);

    int batchInsert(@Param("list") List<OrderInfo> list);
}