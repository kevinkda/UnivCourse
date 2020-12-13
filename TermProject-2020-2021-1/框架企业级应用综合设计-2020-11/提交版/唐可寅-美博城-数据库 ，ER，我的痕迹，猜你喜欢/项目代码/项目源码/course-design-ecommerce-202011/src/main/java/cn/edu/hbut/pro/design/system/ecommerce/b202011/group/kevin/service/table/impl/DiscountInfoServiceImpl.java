package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.DiscountInfo;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.DiscountInfoMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.DiscountInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 *
 * @author Kevin KDA on 2020/11/21 21:24
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
public class DiscountInfoServiceImpl implements DiscountInfoService{

    @Resource
    private DiscountInfoMapper discountInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer discountId) {
        return discountInfoMapper.deleteByPrimaryKey(discountId);
    }

    @Override
    public int insert(DiscountInfo record) {
        return discountInfoMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(DiscountInfo record) {
        return discountInfoMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(DiscountInfo record) {
        return discountInfoMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(DiscountInfo record) {
        return discountInfoMapper.insertSelective(record);
    }

    @Override
    public DiscountInfo selectByPrimaryKey(Integer discountId) {
        return discountInfoMapper.selectByPrimaryKey(discountId);
    }

    @Override
    public int updateByPrimaryKeySelective(DiscountInfo record) {
        return discountInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DiscountInfo record) {
        return discountInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<DiscountInfo> list) {
        return discountInfoMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<DiscountInfo> list) {
        return discountInfoMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<DiscountInfo> list) {
        return discountInfoMapper.batchInsert(list);
    }

}
