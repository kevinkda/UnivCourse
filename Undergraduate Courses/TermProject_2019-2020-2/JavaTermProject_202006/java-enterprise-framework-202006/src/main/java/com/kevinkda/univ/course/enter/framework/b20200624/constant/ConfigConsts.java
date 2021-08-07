package com.kevinkda.univ.course.enter.framework.b20200624.constant;

/**
 * @author Kevin KDA on 2020/6/21 18:07
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200623.constant
 * @classname ConfigConst
 * @apiNote <p></p>
 * @since 2020.06.21
 */
public class ConfigConsts {
    /**
     * 用户请求类型
     *
     * @since 2020.06.21
     */
    public static final String OPERATE_TYPE = "operType";
    /**
     * 用户请求类型：查询所有Blog信息
     *
     * @since 2020.06.21
     */
    public static final String QUERY_ALL_FROM_BLOG = "queryAll";
    /**
     * 用户请求类型：查询所有Author信息
     *
     * @since 2020.06.21
     */
    public static final String QUERY_ALL_FROM_AUTHOR = "queryAll";
    /**
     * 用户请求类型：根据BlogID查询Blog信息
     *
     * @since 2020.06.21
     */
    public static final String QUERY_ITEM_FROM_BLOG = "queryItem";
    /**
     * 用户请求类型：根据BlogID更新Blog信息
     *
     * @since 2020.06.21
     */
    public static final String UPDATE_ITEM_BEFORE_FROM_BLOG = "updateB";
    /**
     * 用户请求类型：根据BlogID更新Blog信息
     *
     * @since 2020.06.21
     */
    public static final String UPDATE_ITEM_AFTER_FROM_BLOG = "updateA";
    /**
     * 用户请求类型：添加Blog
     *
     * @since 2020.06.21
     */
    public static final String INSERT_ITEM_FROM_BLOG = "insertBlog";
    /**
     * 用户请求类型：添加Author
     *
     * @since 2020.06.24
     */
    public static final String INSERT_ITEM_FROM_AUTHOR = "insertAuthor";
    /**
     * 用户请求类型：根据BlogID删除Blog信息
     *
     * @since 2020.06.21
     */
    public static final String DELETE_ITEM_FROM_BLOG = "delete";

    private ConfigConsts() {
    }
}
