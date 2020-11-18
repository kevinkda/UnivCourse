package com.kevinkda.demo.proj.spring.cloud.test.b20201117.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Kevin KDA on 2020/11/17 16:48
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.spring.cloud.test.b20201117.domain
 * @classname ${CLASS_NAME}
 * @apiNote 
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer userId;

    private String userName;

    private String userPass;

    private Date regTime;

    private static final long serialVersionUID = 1L;
}