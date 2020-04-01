/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.util.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;


/**
 * 提供对于JDBC页面分页服务
 *
 * @author Kevin KDA on 2020/3/29 20:48
 * @version 1.1
 * @package com.kevin.util.db
 * @classname PageBean
 * @apiNote 为避免出现超出预期的错误，请仅在 PageBean 实例中使用同一套SQL查询
 * 此项目希望做到提供尽可能的通用方法，但某些特殊情况可能无法提供处理。
 * 此封装类已尽可能的对{@link Exception}进行{@code try}捕获。
 * 不可避免的这可能将会导致后续程序的在特定情况下产生{@link NullPointerException}。
 * 本类数据分页部分依赖{@link JdbcUtils}提供的方法实现。
 * @since 1.0
 */
public class PageBean {
    /**
     * 默认数据分页每页项目数
     */
    private static final int INT_DEFAULT_ITEMS_PER_PAGE;
    /**
     * 当前页面号
     */
    private int intPageCode;
    /**
     * 总页面数
     */
    private int intTotalPage;
    /**
     * 总记录数
     */
    private int intTotalRecord;
    /**
     * 每页记录数
     */
    private int intPageSize;
    /**
     * 数据表宽度
     */
    private int intPageColumnSize;
    private String sql;
    private Object[] conditionValue;


    /**
     * 提供获得ResultSet对象的方法
     *
     * @param sql: 需要查询SQL语句
     * @return ResultSet
     * @author Kevin KDA on 2020/3/29 22:22
     * @description PageBean / getResultSet
     * @since 1.1
     */
    public ResultSet getResultSet(String sql) {
        return getResultSet(sql, null);
    }

    /**
     * 提供获得ResultSet对象的方法
     *
     * @param sql:            需要查询SQL语句
     * @param conditionValue: 传入与需要检索条件的列名称对应的检索值
     * @return ResultSet
     * @author Kevin KDA on 2020/3/29 22:22
     * @description PageBean / getResultSet
     * @since 1.1
     */
    public ResultSet getResultSet(String sql, Object[] conditionValue) {
        this.sql = sql;
        this.conditionValue = conditionValue;
        return getResultSetImpl(sql, conditionValue);
    }

    /**
     * 提供获得ResultSet对象的方法
     *
     * @param strTable:           传入需要查询数据表名
     * @param strColumn:          传入需要查询数据列名，如是多表查询需提供包含表名完整的完成列名
     *                            参数格式：TABLE_A,TABLE_B.COLUMN_A
     * @param strConditionColumn: 传入需要检索条件的列名，若不进行条件检索请赋空
     * @param conditionValue:     传入与需要检索条件的列名称对应的检索值
     * @return ResultSet 返回ResultSet
     * @author Kevin KDA on 2020/3/24 22:01
     * @description JdbcUtils / getResultSet
     * @since 1.1
     */
    public ResultSet getResultSet(String[] strTable, String[] strColumn,
                                  String[] strConditionColumn, Object[] conditionValue) {
        StringBuilder stringBuilder = JdbcUtils.appendSqlString(strTable, strColumn, strConditionColumn);
        getResultSet(stringBuilder.toString(), conditionValue);
        return JdbcUtils.executeQuery();
    }

    /**
     * 提供获得ResultSet中详细数据的方法，返回键值对数组供后续处理
     *
     * @param sql: 需要查询SQL语句
     * @return List<Map < String, Object>> 返回键值对数组，其中键为数据表中列名，值为与列对应的值
     * @author Kevin KDA on 2020/3/25 12:11
     * @description JdbcUtils / getResultListMap
     * @since 1.1
     */
    public List<Map<String, Object>> getResultListMap(String sql) {
        return getResultListMap(sql, null);
    }

    /**
     * 提供获得ResultSet中详细数据的方法，返回键值对数组供后续处理
     *
     * @param sql:            需要查询SQL语句
     * @param conditionValue: 传入与需要检索条件的列名称对应的检索值
     * @return List<Map < String, Object>> 返回键值对数组，其中键为数据表中列名，值为与列对应的值
     * @author Kevin KDA on 2020/3/25 12:11
     * @description JdbcUtils / getResultListMap
     * @since 1.1
     */
    public List<Map<String, Object>> getResultListMap(String sql, Object[] conditionValue) {

        return JdbcUtils.getListMap(getResultSet(sql, conditionValue));
    }

    /**
     * 提供获得ResultSet中详细数据的方法，返回键值对数组供后续处理
     *
     * @param strTable:           传入需要查询数据表名
     * @param strColumn:          传入需要查询数据列名，如是多表查询需提供包含表名完整的完成列名
     *                            参数格式：TABLE_A,TABLE_B.COLUMN_A
     * @param strConditionColumn: 传入需要检索条件的列名，若不进行条件检索请赋空
     * @param conditionValue:     传入与需要检索条件的列名称对应的检索值
     * @return List<Map < String, Object>> 返回键值对数组，其中键为数据表中列名，值为与列对应的值
     * @author Kevin KDA on 2020/3/25 12:11
     * @description JdbcUtils / getResultListMap
     * @since 1.1
     */
    public List<Map<String, Object>> getResultListMap(String[] strTable, String[] strColumn,
                                                      String[] strConditionColumn, Object[] conditionValue) {
        return JdbcUtils.getListMap(getResultSet(strTable, strColumn, strConditionColumn, conditionValue));
    }

    /**
     * 提供ResultSet实现方法，获取查询得到的ResultSet
     *
     * @param sql:            需要查询SQL语句
     * @param conditionValue: 传入与需要检索条件的列名称对应的检索值
     * @return ResultSet
     * @author Kevin KDA on 2020/3/29 22:22
     * @description PageBean / getResultSet
     * @since 1.1
     */
    private ResultSet getResultSetImpl(String sql, Object[] conditionValue) {
        sql = appendPageString(new StringBuilder(sql)).toString();
        return JdbcUtils.getResultSet(sql, conditionValue);
    }

    /**
     * 提供获得ResultSet行数的方法
     * 获得数据表行数，代码样例{@code SELECT COUNT(*) FROM TABLE_A}
     *
     * @param sql: 待取值的SQL
     * @return int 返回ResultSet行数
     * @author Kevin KDA on 2020/3/24 22:01
     * @description JdbcUtils / getResultSetCountRow
     * @since 1.1
     */
    public int getResultSetCountRow(String sql) {
        return getResultSetCountRow(sql, null);
    }

    /**
     * 提供获得ResultSet行数的方法
     * 获得数据表行数，代码样例{@code SELECT COUNT(*) FROM TABLE_A}
     *
     * @param sql: 待取值的SQL
     * @return int 返回ResultSet行数
     * @author Kevin KDA on 2020/3/24 22:01
     * @description JdbcUtils / getResultSetCountRow
     * @since 1.1
     */
    public int getResultSetCountRow(String sql, Object[] conditionValue) {
        int count = 0;
        ResultSet resultSet = null;
        try {
            resultSet = getResultSet(sql, conditionValue);
            resultSet.next();
            count = resultSet.getInt(1);
            setIntTotalPage();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 提供追加分页字符串的方法
     *
     * @param stringBuilder: 传入原有SQL语句
     * @return StringBuilder
     * @author Kevin KDA on 2020/3/29 20:06
     * @description PageBean / appendPageString
     * @since 1.1
     */
    private StringBuilder appendPageString(StringBuilder stringBuilder) {
        int intStartingItemNo = (intPageCode - 1) * intPageSize;
        stringBuilder.append(" LIMIT ").append(intStartingItemNo).append(" , ").append(intPageSize);
        return stringBuilder;
    }

    /**
     * 分页数据上一页
     *
     * @return boolean 返回结果
     * @author Kevin KDA on 2020/3/29 20:46
     * @description PageBean / last
     * @apiNote 仅提供对当前分页号的修改，数据获取请令行操作
     * @since 1.0
     */
    public boolean last() {
        if (intPageCode > 1) {
            intPageCode--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * 分页数据下一页
     *
     * @return boolean 返回结果
     * @author Kevin KDA on 2020/3/29 20:46
     * @description PageBean / next
     * @apiNote 仅提供对当前分页号的修改，数据获取请令行操作
     * @since 1.0
     */
    public boolean next() {
        if (intPageCode < intTotalPage) {
            intPageCode++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * 分页数据上一页
     *
     * @return ResultSet 返回ResultSet结果集
     * @author Kevin KDA on 2020/3/29 20:46
     * @description PageBean / lastResultSet
     * @apiNote 仅提供结果集的修改，数据存储请令行操作
     * @since 1.1
     */
    public ResultSet lastResultSet() {
        if (intPageCode > 1) {
            intPageCode--;
            return getResultSetImpl(this.sql, this.conditionValue);
        } else {
            return null;
        }
    }

    /**
     * 分页数据下一页
     *
     * @return ResultSet 返回ResultSet结果集
     * @author Kevin KDA on 2020/3/29 20:46
     * @description PageBean / nextResultSet
     * @apiNote 仅提供结果集的修改，数据存储请令行操作
     * @since 1.1
     */
    public ResultSet nextResultSet() {
        if (intPageCode < intTotalPage) {
            intPageCode++;
            return getResultSetImpl(this.sql, this.conditionValue);
        } else {
            return null;
        }
    }

    /**
     * 分页数据上一页
     *
     * @return List<Map < String, Object>> 返回List结果集
     * @author Kevin KDA on 2020/3/29 20:46
     * @description PageBean / lastPage
     * @since 1.1
     */
    public List<Map<String, Object>> lastPage() {
        if (intPageCode > 1) {
            intPageCode--;
            return getResultListMap(this.sql, this.conditionValue);
        } else {
            return null;
        }
    }

    /**
     * 分页数据下一页
     *
     * @return List<Map < String, Object>> 返回List结果集
     * @author Kevin KDA on 2020/3/29 20:46
     * @description PageBean / nextPage
     * @since 1.1
     */
    public List<Map<String, Object>> nextPage() {
        if (intPageCode < intTotalPage) {
            intPageCode++;
            return getResultListMap(this.sql, this.conditionValue);
        } else {
            return null;
        }
    }


    /*
     * 获得默认的每页记录数
     * @author Kevin KDA on 2020/3/29 19:39
     * @description PageBean / static
     */
    static {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.kevin.util.resource.db.db");
        INT_DEFAULT_ITEMS_PER_PAGE = Integer.parseInt(resourceBundle.getString("jdbc.dataPaging.defaultItemsPerPage"));
    }

    /**
     * 初始化数据获得使当前分页为默认分页大小
     *
     * @author Kevin KDA on 2020/3/30 11:40
     * @description PageBean / PageBean
     * @since 1.0
     */
    public PageBean() {
        intPageCode = 1;
        intPageSize = INT_DEFAULT_ITEMS_PER_PAGE;
    }

    /**
     * 初始化时获得数据总长度
     *
     * @param sqlCount: 传入进行数据项统计的SQL，即{@code SELECT COUNT(*) FROM TABLE WHERE ?=?}
     * @author Kevin KDA on 2020/3/30 11:40
     * @description PageBean / PageBean
     * @since 1.1
     */
    public PageBean(String sqlCount) {
        intTotalRecord = getResultSetCountRow(sqlCount);
    }

    /**
     * 初始化时获得数据总长度
     *
     * @param intPageSize: 传入每分页记录数
     * @param sqlCount:    传入进行数据项统计的SQL，即{@code SELECT COUNT(*) FROM TABLE WHERE ?=?}
     * @author Kevin KDA on 2020/3/30 11:40
     * @description PageBean / PageBean
     * @since 1.1
     */
    public PageBean(int intPageSize, String sqlCount) {
        this.intPageSize = intPageSize;
        intTotalRecord = getResultSetCountRow(sqlCount);
    }

    /**
     * 初始化时获得数据总长度
     *
     * @param intPageSize:    传入每分页记录数
     * @param sqlCount:       传入进行数据项统计的SQL，即{@code SELECT COUNT(*) FROM TABLE WHERE ?=?}
     * @param conditionValue: 传入与需要检索条件的列名称对应的检索值
     * @author Kevin KDA on 2020/3/30 11:40
     * @description PageBean / PageBean
     * @since 1.1
     */
    public PageBean(int intPageSize, String sqlCount, Object[] conditionValue) {
        this.intPageSize = intPageSize;
        intTotalRecord = getResultSetCountRow(sqlCount, conditionValue);
    }

    /**
     * 初始化时获得数据总长度
     *
     * @param sqlCount:       传入进行数据项统计的SQL，即{@code SELECT COUNT(*) FROM TABLE WHERE ?=?}
     * @param conditionValue: 传入与需要检索条件的列名称对应的检索值
     * @author Kevin KDA on 2020/3/30 11:40
     * @description PageBean / PageBean
     * @since 1.1
     */
    public PageBean(String sqlCount, Object[] conditionValue) {
        intTotalRecord = getResultSetCountRow(sqlCount, conditionValue);
    }

    /**
     * 初始化时获得数据总长度
     *
     * @param intPageCode:    传入当前页面号
     * @param intTotalRecord: 传入数据表总记录数
     * @param intPageSize:    传入每分页记录数
     * @author Kevin KDA on 2020/3/30 11:40
     * @description PageBean / PageBean
     * @since 1.0
     */
    public PageBean(int intPageCode, int intTotalRecord, int intPageSize) {
        this.intPageCode = intPageCode;
        setIntTotalPage();
        this.intTotalRecord = intTotalRecord;
        this.intPageSize = intPageSize;
    }

    public static int getIntDefaultItemsPerPage() {
        return INT_DEFAULT_ITEMS_PER_PAGE;
    }

    public int getIntPageCode() {
        return intPageCode;
    }

    public void setIntPageCode(int intPageCode) {
        this.intPageCode = intPageCode;
    }

    public int getIntTotalPage() {
        return intTotalPage;
    }

    public void setIntTotalPage() {
        int temp = intTotalRecord / intPageSize;
        this.intTotalPage = intTotalRecord % intPageSize == 0 ? temp : temp + 1;
    }

    public void setIntTotalPage(int intTotalPage) {
        this.intTotalPage = intTotalPage;
    }

    public int getIntTotalRecord() {
        return intTotalRecord;
    }

    public void setIntTotalRecord(int intTotalRecord) {
        this.intTotalRecord = intTotalRecord;
    }

    public int getIntPageSize() {
        return intPageSize;
    }

    public void setIntPageSize(int intPageSize) {
        this.intPageSize = intPageSize;
    }

    public int getIntPageColumnSize() {
        return intPageColumnSize;
    }

    public void setIntPageColumnSize(int intPageColumnSize) {
        this.intPageColumnSize = intPageColumnSize;
    }
}
