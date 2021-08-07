package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.UserAddress;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.UserAddressMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.UserAddressService;
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
public class UserAddressServiceImpl implements UserAddressService{

    @Resource
    private UserAddressMapper userAddressMapper;

    @Override
    public int deleteByPrimaryKey(Integer addressId) {
        return userAddressMapper.deleteByPrimaryKey(addressId);
    }

    @Override
    public int insert(UserAddress record) {
        return userAddressMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UserAddress record) {
        return userAddressMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UserAddress record) {
        return userAddressMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UserAddress record) {
        return userAddressMapper.insertSelective(record);
    }

    @Override
    public UserAddress selectByPrimaryKey(Integer addressId) {
        return userAddressMapper.selectByPrimaryKey(addressId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserAddress record) {
        return userAddressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserAddress record) {
        return userAddressMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UserAddress> list) {
        return userAddressMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<UserAddress> list) {
        return userAddressMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<UserAddress> list) {
        return userAddressMapper.batchInsert(list);
    }

}
