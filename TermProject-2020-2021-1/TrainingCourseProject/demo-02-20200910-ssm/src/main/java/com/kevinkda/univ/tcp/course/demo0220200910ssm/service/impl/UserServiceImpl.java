package com.kevinkda.univ.tcp.course.demo0220200910ssm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.kevinkda.univ.tcp.course.demo0220200910ssm.mapper.UserMapper;
import com.kevinkda.univ.tcp.course.demo0220200910ssm.domain.User;
import com.kevinkda.univ.tcp.course.demo0220200910ssm.service.UserService;
/**
 *
 * @author Kevin KDA on 2020/9/15 17:35
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0220200910ssm.service.impl
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
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
