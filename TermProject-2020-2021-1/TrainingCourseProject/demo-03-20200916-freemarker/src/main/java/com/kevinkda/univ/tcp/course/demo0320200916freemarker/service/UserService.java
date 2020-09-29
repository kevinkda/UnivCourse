package com.kevinkda.univ.tcp.course.demo0320200916freemarker.service;

import com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author Kevin KDA on 2020/9/16 14:42
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.service
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Service
public interface UserService {


    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    List<HashMap> selectAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int deleteByIds(List ids);
}
