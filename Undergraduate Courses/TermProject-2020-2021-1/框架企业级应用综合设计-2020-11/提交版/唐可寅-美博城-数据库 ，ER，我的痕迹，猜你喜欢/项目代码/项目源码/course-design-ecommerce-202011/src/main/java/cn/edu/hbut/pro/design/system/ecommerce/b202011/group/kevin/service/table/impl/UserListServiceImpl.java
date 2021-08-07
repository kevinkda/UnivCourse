package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain.UserList;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.mapper.UserListMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.UserListService;
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
public class UserListServiceImpl implements UserListService{

    @Resource
    private UserListMapper userListMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return userListMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(UserList record) {
        return userListMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(UserList record) {
        return userListMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UserList record) {
        return userListMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(UserList record) {
        return userListMapper.insertSelective(record);
    }

    @Override
    public UserList selectByPrimaryKey(Integer userId) {
        return userListMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserList record) {
        return userListMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserList record) {
        return userListMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<UserList> list) {
        return userListMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<UserList> list) {
        return userListMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<UserList> list) {
        return userListMapper.batchInsert(list);
    }

}
