package com.kevinkda.univ.course.mysql.job.b20200612.service.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author Kevin KDA on 2020/6/11 20:59
 * @version 1.0.0
 * @project mysql-course-202006
 * @package com.kevinkda.univ.course.mysql.job.b20200612.service.mapper
 * @classname
 * @apiNote <p></p>
 * @since 1.0.0
 */
public interface ProMapper {

    int addUser(@Param("arg1") String arg1);
}
