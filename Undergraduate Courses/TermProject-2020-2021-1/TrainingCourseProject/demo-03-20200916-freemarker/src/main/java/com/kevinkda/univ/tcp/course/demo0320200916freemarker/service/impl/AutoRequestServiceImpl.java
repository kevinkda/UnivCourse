package com.kevinkda.univ.tcp.course.demo0320200916freemarker.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.kevinkda.univ.tcp.course.demo0320200916freemarker.mapper.AutoRequestMapper;
import com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain.AutoRequest;
import com.kevinkda.univ.tcp.course.demo0320200916freemarker.service.AutoRequestService;
/**
 *
 * @author Kevin KDA on 2020/9/17 15:27
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.service.impl
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Service
public class AutoRequestServiceImpl implements AutoRequestService{

    @Resource
    private AutoRequestMapper autoRequestMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return autoRequestMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AutoRequest record) {
        return autoRequestMapper.insert(record);
    }

    @Override
    public int insertSelective(AutoRequest record) {
        return autoRequestMapper.insertSelective(record);
    }

    @Override
    public AutoRequest selectByPrimaryKey(Integer id) {
        return autoRequestMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AutoRequest record) {
        return autoRequestMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AutoRequest record) {
        return autoRequestMapper.updateByPrimaryKey(record);
    }

}
