package com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author Kevin KDA on 2020/9/17 15:27
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
/**
    * GitHub WebHooks自动化请求控制Aliyun ECS审计
    */
@Data
public class AutoRequest implements Serializable {
    /**
    * 请求序号ID
    */
    private Integer id;

    /**
    * 自动化请求时间
    */
    private Integer authentication;

    /**
    * 请求日时
    */
    private Date date;

    private String requesthead;

    /**
    * 自动化请求鉴权结果
    */
    private String requestdata;

    private String backresult;

    private static final long serialVersionUID = 1L;
}