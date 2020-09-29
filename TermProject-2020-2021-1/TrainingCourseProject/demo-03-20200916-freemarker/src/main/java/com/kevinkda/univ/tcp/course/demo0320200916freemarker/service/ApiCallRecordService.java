package com.kevinkda.univ.tcp.course.demo0320200916freemarker.service;

import com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain.ApiCallRecord;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author Kevin KDA on 2020/9/16 17:11
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.service
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Service
public interface ApiCallRecordService {


    int deleteByPrimaryKey(Integer id);

    int insert(ApiCallRecord record);

    int insertSelective(ApiCallRecord record);

    ApiCallRecord selectByPrimaryKey(Integer id);

    List<HashMap> selectAll();

    int updateByPrimaryKeySelective(ApiCallRecord record);

    int updateByPrimaryKey(ApiCallRecord record);

}
