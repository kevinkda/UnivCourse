package com.kevinkda.univ.tcp.course.demo0320200916freemarker.service.impl;

import com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain.ApiCallRecord;
import com.kevinkda.univ.tcp.course.demo0320200916freemarker.mapper.ApiCallRecordMapper;
import com.kevinkda.univ.tcp.course.demo0320200916freemarker.service.ApiCallRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @author Kevin KDA on 2020/9/16 17:11
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.service.impl
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Service
public class ApiCallRecordServiceImpl implements ApiCallRecordService {

    @Resource
    private ApiCallRecordMapper apiCallRecordMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return apiCallRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ApiCallRecord record) {
        return apiCallRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(ApiCallRecord record) {
        return apiCallRecordMapper.insertSelective(record);
    }

    @Override
    public ApiCallRecord selectByPrimaryKey(Integer id) {
        return apiCallRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HashMap> selectAll() {
        return apiCallRecordMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKeySelective(ApiCallRecord record) {
        return apiCallRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ApiCallRecord record) {
        return apiCallRecordMapper.updateByPrimaryKey(record);
    }

}
