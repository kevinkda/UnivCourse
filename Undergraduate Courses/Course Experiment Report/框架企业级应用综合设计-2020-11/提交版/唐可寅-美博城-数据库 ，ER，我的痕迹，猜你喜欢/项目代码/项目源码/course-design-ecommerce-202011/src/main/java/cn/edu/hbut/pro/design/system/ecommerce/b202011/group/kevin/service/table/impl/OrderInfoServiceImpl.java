package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.OrderInfo;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.OrderInfoMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.OrderInfoService;
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
public class OrderInfoServiceImpl implements OrderInfoService{

    @Resource
    private OrderInfoMapper orderInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer orderId) {
        return orderInfoMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public int insert(OrderInfo record) {
        return orderInfoMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(OrderInfo record) {
        return orderInfoMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OrderInfo record) {
        return orderInfoMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(OrderInfo record) {
        return orderInfoMapper.insertSelective(record);
    }

    @Override
    public OrderInfo selectByPrimaryKey(Integer orderId) {
        return orderInfoMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderInfo record) {
        return orderInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderInfo record) {
        return orderInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<OrderInfo> list) {
        return orderInfoMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<OrderInfo> list) {
        return orderInfoMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<OrderInfo> list) {
        return orderInfoMapper.batchInsert(list);
    }

}
