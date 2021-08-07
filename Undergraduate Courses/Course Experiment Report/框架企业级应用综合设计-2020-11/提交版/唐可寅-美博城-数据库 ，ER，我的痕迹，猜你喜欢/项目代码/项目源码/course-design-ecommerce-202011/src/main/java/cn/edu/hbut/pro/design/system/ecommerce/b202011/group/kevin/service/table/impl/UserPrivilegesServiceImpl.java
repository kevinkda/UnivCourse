package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.UserPrivileges;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.UserPrivilegesMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.UserPrivilegesService;
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
public class UserPrivilegesServiceImpl implements UserPrivilegesService{

    @Resource
    private UserPrivilegesMapper userPrivilegesMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return userPrivilegesMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(UserPrivileges record) {
        return userPrivilegesMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UserPrivileges record) {
        return userPrivilegesMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UserPrivileges record) {
        return userPrivilegesMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UserPrivileges record) {
        return userPrivilegesMapper.insertSelective(record);
    }

    @Override
    public UserPrivileges selectByPrimaryKey(Integer userId) {
        return userPrivilegesMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserPrivileges record) {
        return userPrivilegesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserPrivileges record) {
        return userPrivilegesMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UserPrivileges> list) {
        return userPrivilegesMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<UserPrivileges> list) {
        return userPrivilegesMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<UserPrivileges> list) {
        return userPrivilegesMapper.batchInsert(list);
    }

}
