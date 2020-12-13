package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.ShoppingCart;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.ShoppingCartMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.ShoppingCartService;
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
public class ShoppingCartServiceImpl implements ShoppingCartService{

    @Resource
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public int deleteByPrimaryKey(Integer itemId) {
        return shoppingCartMapper.deleteByPrimaryKey(itemId);
    }

    @Override
    public int insert(ShoppingCart record) {
        return shoppingCartMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(ShoppingCart record) {
        return shoppingCartMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(ShoppingCart record) {
        return shoppingCartMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(ShoppingCart record) {
        return shoppingCartMapper.insertSelective(record);
    }

    @Override
    public ShoppingCart selectByPrimaryKey(Integer itemId) {
        return shoppingCartMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public int updateByPrimaryKeySelective(ShoppingCart record) {
        return shoppingCartMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShoppingCart record) {
        return shoppingCartMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ShoppingCart> list) {
        return shoppingCartMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<ShoppingCart> list) {
        return shoppingCartMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<ShoppingCart> list) {
        return shoppingCartMapper.batchInsert(list);
    }

}
