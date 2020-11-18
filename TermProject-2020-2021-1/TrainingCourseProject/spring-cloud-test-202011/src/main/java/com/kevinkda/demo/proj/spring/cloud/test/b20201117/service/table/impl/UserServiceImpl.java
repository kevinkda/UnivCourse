package com.kevinkda.demo.proj.spring.cloud.test.b20201117.service.table.impl;

import javax.annotation.Resource;
import com.kevinkda.demo.proj.spring.cloud.test.b20201117.mapper.UserMapper;
import com.kevinkda.demo.proj.spring.cloud.test.b20201117.domain.User;
import com.kevinkda.demo.proj.spring.cloud.test.b20201117.service.table.UserService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin KDA on 2020/11/17 16:48
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.spring.cloud.test.b20201117.service.table.impl
 * @classname ${CLASS_NAME}
 * @apiNote 
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

}
