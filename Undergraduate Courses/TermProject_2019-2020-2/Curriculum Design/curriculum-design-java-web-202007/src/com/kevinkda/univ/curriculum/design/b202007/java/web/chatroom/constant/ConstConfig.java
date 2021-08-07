package com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.constant;

/**
 * 项目级常量配置类
 *
 * @author Kevin KDA on 2020/7/3 22:13
 * @version 1.0.0
 * @project curriculum-design-java-web-202007
 * @package com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.constant
 * @classname ConstConfig
 * @apiNote <p></p>
 * @since 1.0.0
 */
public final class ConstConfig {
    /**
     * 字段：用户请求类型
     *
     * @since 1.0.0
     */
    public static final String FIELD_REQUEST_OPERATION_TYPE = "num";
    /**
     * 字段：用于请求用户昵称
     *
     * @since 1.0.0
     */
    public static final String FIELD_REQUEST_USER_NICK = "nickName";
    /**
     * 字段：用于请求用户性别
     *
     * @since 1.0.0
     */
    public static final String FIELD_REQUEST_USER_SEX = "sex";
    /**
     * 字段：用于请求消息
     *
     * @since 1.0.0
     */
    public static final String FIELD_REQUEST_MESSAGE = "msg";
    /**
     * 字段：用于请求信息
     *
     * @since 1.0.0
     */
    public static final String FIELD_REQUEST_INFO = "info";
    /**
     * 字段：用于请求登录用户列表
     *
     * @since 1.0.0
     */
    public static final String FIELD_REQUEST_LOGIN_USER_LIST = "userLoginList";
    /**
     * 字段：用于请求登录用户计数
     *
     * @since 1.0.0
     */
    public static final String FIELD_REQUEST_LOGIN_USER_COUNT = "userCount";

    /**
     * 字段：用于获得当前用户信息
     *
     * @since 1.0.0
     */
    public static final String FIELD_GET_CURRENT_USER_INFORMATION = "user";

    /**
     * 响应消息：用于登录后三分钟未操作的自动退出提示
     *
     * @since 1.0.0
     */
    public static final String FIELD_RESPONSE_LOGIN_TIMEOUT = "登录超时3分钟";
    /**
     * 响应消息：用于未登录用户的返回信息
     *
     * @since 1.0.0
     */
    public static final String FIELD_RESPONSE_BLOCK_ACCESS_TO_ECHO_MESSAGES = "尚未登录，无权限访问";
    /**
     * 响应消息：Session获取失败
     *
     * @since 1.0.0
     */
    public static final String FIELD_RESPONSE_SESSION_FAIL = "sessionFail";

    /**
     * 响应路径：用于登录后三分钟未操作的自动退出提示
     *
     * @since 1.0.0
     */
    public static final String FIELD_RESPONSE_NON_PERMISSION_ACCESS_JUMP_PATH = "../login.jsp";
    /**
     * 响应路径：用于登录后跳转至项目首页
     *
     * @since 1.0.0
     */
    public static final String FIELD_RESPONSE_JUMP_PATH_AFTER_LOGIN = "../admin/index.jsp";

    /**
     * 操作类型字段：校验用户请求操作类型
     * 用户登录
     *
     * @since 1.0.0
     */
    public static final String FIELD_ACTION_TYPE_USER_LOGIN = "0";
    /**
     * 操作类型字段：校验用户请求操作类型
     * 用户注册
     *
     * @since 1.0.0
     */
    public static final String FIELD_ACTION_TYPE_USER_REGISTER = "1";
    /**
     * 操作类型字段：校验用户请求操作类型
     * 获得在线用户列表
     *
     * @since 1.0.0
     */
    public static final String FIELD_ACTION_TYPE_GET_A_LIST_OF_ONLINE_USERS = "2";
    /**
     * 操作类型字段：校验用户请求操作类型
     * 获得消息列表
     *
     * @since 1.0.0
     */
    public static final String FIELD_ACTION_TYPE_GET_MESSAGE_LIST = "3";
    /**
     * 操作类型字段：校验用户请求操作类型
     * 用户发送消息
     *
     * @since 1.0.0
     */
    public static final String FIELD_ACTION_TYPE_SEND_MESSAGE = "4";
    /**
     * 操作类型字段：校验用户请求操作类型
     * 登录超时检查
     *
     * @since 1.0.0
     */
    public static final String FIELD_ACTION_TYPE_LOGIN_TIMEOUT_VERIFICATION = "5";

    /**
     * 格式：消息日期格式
     */
    public static final String FORMAT_DATE = "yyyy-MM-dd HH:mm:ss";


    private ConstConfig() {
    }
}
