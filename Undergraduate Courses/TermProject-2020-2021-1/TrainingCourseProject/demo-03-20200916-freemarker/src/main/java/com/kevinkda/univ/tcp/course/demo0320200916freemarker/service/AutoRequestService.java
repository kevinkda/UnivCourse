package com.kevinkda.univ.tcp.course.demo0320200916freemarker.service;

import com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain.AutoRequest;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin KDA on 2020/9/17 15:27
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.service
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Service
public interface AutoRequestService{


    int deleteByPrimaryKey(Integer id);

    int insert(AutoRequest record);

    int insertSelective(AutoRequest record);

    AutoRequest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AutoRequest record);

    int updateByPrimaryKey(AutoRequest record);

}
