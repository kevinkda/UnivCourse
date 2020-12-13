package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.TransactionInformation;

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
public interface TransactionInformationService{


    int deleteByPrimaryKey(Integer transactionId);

    int insert(TransactionInformation record);

    int insertOrUpdate(TransactionInformation record);

    int insertOrUpdateSelective(TransactionInformation record);

    int insertSelective(TransactionInformation record);

    TransactionInformation selectByPrimaryKey(Integer transactionId);

    int updateByPrimaryKeySelective(TransactionInformation record);

    int updateByPrimaryKey(TransactionInformation record);

    int updateBatch(List<TransactionInformation> list);

    int updateBatchSelective(List<TransactionInformation> list);

    int batchInsert(List<TransactionInformation> list);

}
