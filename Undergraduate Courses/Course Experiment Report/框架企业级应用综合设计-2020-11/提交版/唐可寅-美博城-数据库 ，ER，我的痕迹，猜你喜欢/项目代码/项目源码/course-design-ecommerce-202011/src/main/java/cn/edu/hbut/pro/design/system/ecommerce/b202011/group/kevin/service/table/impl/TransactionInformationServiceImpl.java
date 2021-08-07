package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.TransactionInformation;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.TransactionInformationMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.TransactionInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl
 * @classname ${CLASS_NAME}
 * @apiNote 
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Service
public class TransactionInformationServiceImpl implements TransactionInformationService{

    @Resource
    private TransactionInformationMapper transactionInformationMapper;

    @Override
    public int deleteByPrimaryKey(Integer transactionId) {
        return transactionInformationMapper.deleteByPrimaryKey(transactionId);
    }

    @Override
    public int insert(TransactionInformation record) {
        return transactionInformationMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(TransactionInformation record) {
        return transactionInformationMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(TransactionInformation record) {
        return transactionInformationMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(TransactionInformation record) {
        return transactionInformationMapper.insertSelective(record);
    }

    @Override
    public TransactionInformation selectByPrimaryKey(Integer transactionId) {
        return transactionInformationMapper.selectByPrimaryKey(transactionId);
    }

    @Override
    public int updateByPrimaryKeySelective(TransactionInformation record) {
        return transactionInformationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TransactionInformation record) {
        return transactionInformationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<TransactionInformation> list) {
        return transactionInformationMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<TransactionInformation> list) {
        return transactionInformationMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<TransactionInformation> list) {
        return transactionInformationMapper.batchInsert(list);
    }

}
