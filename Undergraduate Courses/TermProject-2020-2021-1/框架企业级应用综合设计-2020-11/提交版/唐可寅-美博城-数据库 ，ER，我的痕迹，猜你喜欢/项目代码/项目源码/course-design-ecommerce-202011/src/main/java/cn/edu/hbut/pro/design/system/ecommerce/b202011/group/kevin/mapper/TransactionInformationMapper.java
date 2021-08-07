package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.TransactionInformation;
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
public interface TransactionInformationMapper {
    /**
     * delete by primary key
     * @param transactionId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer transactionId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TransactionInformation record);

    int insertOrUpdate(TransactionInformation record);

    int insertOrUpdateSelective(TransactionInformation record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TransactionInformation record);

    /**
     * select by primary key
     * @param transactionId primary key
     * @return object by primary key
     */
    TransactionInformation selectByPrimaryKey(Integer transactionId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TransactionInformation record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TransactionInformation record);

    int updateBatch(List<TransactionInformation> list);

    int updateBatchSelective(List<TransactionInformation> list);

    int batchInsert(@Param("list") List<TransactionInformation> list);
}