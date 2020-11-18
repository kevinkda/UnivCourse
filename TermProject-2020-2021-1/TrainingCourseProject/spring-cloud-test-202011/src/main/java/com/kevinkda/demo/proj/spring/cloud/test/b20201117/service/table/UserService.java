package com.kevinkda.demo.proj.spring.cloud.test.b20201117.service.table;

import com.kevinkda.demo.proj.spring.cloud.test.b20201117.domain.User;
    /**
 *
 * @author Kevin KDA on 2020/11/17 16:48
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.spring.cloud.test.b20201117.service.table
 * @classname ${CLASS_NAME}
 * @apiNote 
 * @implSpec
 * @implNote
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
