package com.kevinkda.univ.tcp.course.demo0320200916freemarker.service.impl;

import com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain.User;
import com.kevinkda.univ.tcp.course.demo0320200916freemarker.mapper.UserMapper;
import com.kevinkda.univ.tcp.course.demo0320200916freemarker.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @author Kevin KDA on 2020/9/16 14:42
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.service.impl
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

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
    public List<HashMap> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByIds(List ids) {
        return userMapper.deleteByIds(ids);
    }

}
