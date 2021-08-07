package com.kevinkda.univ.tcp.course.demo0220200910ssm.domain;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author Kevin KDA on 2020/9/15 17:35
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0220200910ssm.domain
 * @classname ${CLASS_NAME}
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