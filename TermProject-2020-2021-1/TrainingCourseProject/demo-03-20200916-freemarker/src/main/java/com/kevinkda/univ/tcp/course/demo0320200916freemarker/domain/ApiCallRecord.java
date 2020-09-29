package com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author Kevin KDA on 2020/9/16 17:11
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.domain
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
/**
    * Aliyun ECS控制请求审计
    */
@Data
public class ApiCallRecord {
    /**
    * 请求ID
    */
    private Integer id;

    /**
    * 执行请求的用户ID
    */
    private Integer userid;

    /**
    * 请求类型
    */
    private String apitype;

    /**
    * 请求参数
    */
    private String callparameters;

    /**
    * 地区ID
    */
    private String regionId;

    /**
    * 实例ID
    */
    private String instanceId;

    /**
    * 请求调用返回值
    */
    private String apireturn;

    /**
    * 请求时间
    */
    private Date date;
}