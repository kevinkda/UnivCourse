package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.DiscountDistributionList;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.DiscountDistributionListMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.DiscountDistributionListService;
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
public class DiscountDistributionListServiceImpl implements DiscountDistributionListService{

    @Resource
    private DiscountDistributionListMapper discountDistributionListMapper;

    @Override
    public int deleteByPrimaryKey(Integer distributionId) {
        return discountDistributionListMapper.deleteByPrimaryKey(distributionId);
    }

    @Override
    public int insert(DiscountDistributionList record) {
        return discountDistributionListMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(DiscountDistributionList record) {
        return discountDistributionListMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(DiscountDistributionList record) {
        return discountDistributionListMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(DiscountDistributionList record) {
        return discountDistributionListMapper.insertSelective(record);
    }

    @Override
    public DiscountDistributionList selectByPrimaryKey(Integer distributionId) {
        return discountDistributionListMapper.selectByPrimaryKey(distributionId);
    }

    @Override
    public int updateByPrimaryKeySelective(DiscountDistributionList record) {
        return discountDistributionListMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DiscountDistributionList record) {
        return discountDistributionListMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<DiscountDistributionList> list) {
        return discountDistributionListMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<DiscountDistributionList> list) {
        return discountDistributionListMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<DiscountDistributionList> list) {
        return discountDistributionListMapper.batchInsert(list);
    }

}
