/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevinkda.univ.course.mysql.job.b20200612.constant;

/**
 * 系统级常量
 *
 * @author Kevin KDA on 2020/5/22 17:39
 * @version 1.0.0
 * @project java-utils
 * @package com.kevinkda.univ.course.mysql.job.b20200612.constant
 * @classname ConfigConsts
 * @apiNote <p></p>
 * @since 1.0.0
 */
public final class ConfigConsts {

//    资源对象路径

    /**
     * 数据库链接资源文件地址
     *
     * @since 1.0.0
     */
    public static final String DB_UNIVERSITY = "db.university";
    /**
     * MyBatis Config for WebService202005
     *
     * @since 1.0.0
     */
    public static final String MB_CONFIG_WEB_SERVICE = "mybatis/config/mybatis-config-us.xml";

    /**
     * 查找用户
     * @since 2020.06.12
     */
    public static final String PRO_NAME_20200612_SELECT = "CALL 20200612_select_user(?)";
    /**
     * 增加用户
     * @since 2020.06.12
     */
    public static final String PRO_NAME_20200612_INSERT = "{CALL 20200612_insert_user(?)}";
    /**
     * 修改用户
     * @since 2020.06.12
     */
    public static final String PRO_NAME_20200612_MODIFY = "{CALL 20200612_modify_user(?,?)}";
    /**
     * 删除用户
     * @since 2020.06.12
     */
    public static final String PRO_NAME_20200612_DELECT = "CALL 20200612_delect_user(?)";

//    MaBatis 服务资源

    /**
     * 用户注册，向数据库插入用户
     * 服务用户类型User
     * userAccList
     *
     * @since 1.0.0
     */
    public static final String MB_MAPPER_INSERT_USER = "com.kevinkda.univ.course.mysql.job.b20200612.service.mapper.ProMapper.addUser";
    /**
     * 注册用户详细信息，向数据库插入用户
     * 服务用户类型User
     * userAccDetailList
     *
     * @since 1.0.0
     */
    public static final String MB_MAPPER_INSERT_USER_DETAIL = "com.kevinkda.web.userservice202005.mapper.user.RegiserMapper.insertUserDetail";
    /**
     * 获得用户ID，服务用户类型User
     * userAccList
     *
     * @since 1.0.0
     */
    public static final String MB_MAPPER_GET_USER_ID = "com.kevinkda.web.userservice202005.mapper.user.RegiserMapper.getUserId";
    /**
     * 记录用户活动信息，服务用户类型User
     * userActivityHistory
     *
     * @since 1.0.0
     */
    public static final String MB_MAPPER_INSERT_ACTIVITY_HIS = "com.kevinkda.web.userservice202005.mapper.user.RegiserMapper.insertActivityHis";
    /**
     * 查询用户信息 userInfo，查询结果为单条信息，Map
     * 传入用户ID userID
     *
     * @since 1.0.0
     */
    public static final String MB_MAPPER_SELECT_ONE_USER_INFO = "com.kevinkda.web.userservice202005.model.domain.view.UserInfoMapper.selectOneOfMap";
    /**
     * 查询用户信息 userInfo
     *
     * @since 1.0.0
     */
    public static final String MB_MAPPER_SELECT_ALL_USER_INFO = "com.kevinkda.web.userservice202005.model.domain.view.UserInfoMapper.selectAllOfMap";


//    Constructor、Getter、Setter

    private ConfigConsts() {
    }
}
