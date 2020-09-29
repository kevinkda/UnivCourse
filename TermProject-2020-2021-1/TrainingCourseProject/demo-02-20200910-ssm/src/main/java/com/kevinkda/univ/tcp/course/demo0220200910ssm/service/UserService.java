package com.kevinkda.univ.tcp.course.demo0220200910ssm.service;

import com.kevinkda.univ.tcp.course.demo0220200910ssm.domain.User;
    /**
 *
 * @author Kevin KDA on 2020/9/15 17:35
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0220200910ssm.service
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
public interface UserService{


    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
