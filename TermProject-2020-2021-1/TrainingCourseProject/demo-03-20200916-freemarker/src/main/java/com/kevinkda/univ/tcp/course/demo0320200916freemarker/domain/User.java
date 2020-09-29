package com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain;

import java.util.Date;
import lombok.Data;

/**
 * @author Kevin KDA on 2020/9/16 14:42
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain
 * @classname User
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Data
public class User {
    private Integer userId;

    private String userName;

    private String userPass;

    private Date regTime;
}