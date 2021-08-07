/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.util.db;

import com.kevin.util.number.Section;

import java.sql.*;
import java.util.*;

/**
 * 提供对于JDBC的操纵服务
 *
 * @author Kevin KDA on 2020/3/23 09:14
 * @version 1.6
 * @package com.kevin.util.db
 * @classname JdbcUtils
 * @description 提供对于JDBC的操纵服务
 * @interface/enum {@link java.lang.AutoCloseable} 实现自动关闭
 * @apiNote <p>此项目希望做到提供尽可能的通用方法，但某些特殊情况可能无法提供处理。</p>
 * <p>此封装类已实现对{@link java.lang.AutoCloseable}的支持，调用方可以获取它的资源直到结束，这将自动调用{@code close}。</p>
 * <p>此封装类已尽可能的对{@link java.lang.Exception}进行{@code try}捕获，
 * 不可避免的这可能将会导致后续程序的在特定情况下产生{@link java.lang.NullPointerException}。</p>
 * <p>数据分页部分依赖{@link com.kevin.util.db.PageBean}，自1.5版本开始本类方法提供的数据分页将被标记为{@link Deprecated}</p>
 * @since 1.0 (JDK 1.7)
 */
public class JdbcUtils extends AbstractJdbc implements AutoCloseable {
    /**
     * Connection
     */
    private Connection connection = null;
    /**
     * Connection
     */
    private static Connection connectionStatic = null;
    /**
     * PreparedStatement
     */
    private PreparedStatement preparedStatement = null;
    /**
     * PreparedStatement
     */
    static PreparedStatement preparedStatementStatic = null;
    /**
     * ResultSet
     */
    private static ResultSet resultSet = null;

//    获得连接

    /**
     * 对外提供一个方法来获取数据库连接
     *
     * @return Connection 返回Connection
     * @author Kevin KDA on 2020/3/31 18:45
     * @description JdbcUtils / getConnection
     * @apiNote <p>此方法需要实例化，对于批处理方式请按照如下方式执行：</p>
     * <ol><li>实例化对象获得{@link Connection}连接</li>
     * <li>使用{@link Connection}连接获得{@link PreparedStatement}对象</li>
     * <li>使用{@code addBatch()}向{@link PreparedStatement}追加参数</li>
     * <li>使用{@code executeBatch()}提交批处理</li>
     * <li>清楚批处理缓存</li></ol>
     * @since 1.5
     */
    public Connection getConn() {
        return getConn(true);
    }

    /**
     * 对外提供一个方法来获取数据库连接
     *
     * @param flag: 设置setAutoCommit事务自动提交
     * @return Connection 返回Connection
     * @author Kevin KDA on 2020/3/31 18:45
     * @description JdbcUtils / getConnection
     * @apiNote <p>此方法需要实例化，对于批处理方式请按照如下方式执行：</p>
     * <ol><li>实例化对象获得{@link Connection}连接</li>
     * <li>使用{@link Connection}连接获得{@link PreparedStatement}对象</li>
     * <li>使用{@code addBatch()}向{@link PreparedStatement}追加参数</li>
     * <li>使用{@code executeBatch()}提交批处理</li>
     * <li>清楚批处理缓存</li></ol>
     * @since 1.5
     */
    public Connection getConn(boolean flag) {
        if (connection == null) {
            try {
//            1.加载驱动程序
                Class.forName(DRIVER);
//            2.获得数据库的连接
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                connection.setAutoCommit(flag);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    /**
     * 对外提供一个方法来获取数据库连接
     *
     * @return Connection
     * @author Kevin KDA on 2019/10/31 21:53
     * @description JdbcUtils / getConnection
     * @apiNote 此方法为静态方法并发访问可能产生未知错误
     * @since 1.0
     */
    public static Connection getConnection() {
        if (connectionStatic == null) {
            try {
//            1.加载驱动程序
                Class.forName(DRIVER);
//            2.获得数据库的连接
                connectionStatic = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connectionStatic;
    }

    /**
     * 提供获得PreparedStatement对象的方法
     *
     * @param sql: 提供创建PreparedStatement的SQL语句
     * @return PreparedStatement 返回PreparedStatement
     * @author Kevin KDA on 2020/3/31 18:45
     * @description JdbcUtils / getConnection
     * @apiNote <p>此方法需要实例化，对于批处理方式请按照如下方式执行：</p>
     * <ol><li>实例化对象获得{@link Connection}连接</li>
     * <li>使用{@link Connection}连接获得{@link PreparedStatement}对象</li>
     * <li>使用{@code addBatch()}向{@link PreparedStatement}追加参数</li>
     * <li>使用{@code executeBatch()}提交批处理</li>
     * <li>清楚批处理缓存</li></ol>
     * @since 1.5
     */
    public PreparedStatement getPrStatment(String sql) {
        return getPrStatment(sql, true);
    }

    /**
     * 提供获得PreparedStatement对象的方法
     *
     * @param sql:  提供创建PreparedStatement的SQL语句
     * @param flag: 设置setAutoCommit事务自动提交
     * @return PreparedStatement 返回PreparedStatement
     * @author Kevin KDA on 2020/3/31 18:45
     * @description JdbcUtils / getConnection
     * @apiNote <p>此方法需要实例化，对于批处理方式请按照如下方式执行：</p>
     * <ol><li>实例化对象获得{@link Connection}连接</li>
     * <li>使用{@link Connection}连接获得{@link PreparedStatement}对象</li>
     * <li>使用{@code addBatch()}向{@link PreparedStatement}追加参数</li>
     * <li>使用{@code executeBatch()}提交批处理</li>
     * <li>清楚批处理缓存</li></ol>
     * @since 1.5
     */
    public PreparedStatement getPrStatment(String sql, boolean flag) {
        try {
            if (preparedStatement == null) {
                getConn(flag);
                preparedStatement = connection.prepareStatement(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return preparedStatement;
    }

    /**
     * 提供获得PreparedStatement对象的方法
     *
     * @param sql: 提供创建PreparedStatement的SQL语句
     * @return PreparedStatement 返回PreparedStatement
     * @author Kevin KDA on 2020/3/24 22:01
     * @description JdbcUtils / getConnection
     * @apiNote 此方法为静态方法并发访问可能产生未知错误
     * @since 1.0
     */
    public static PreparedStatement getPreparedStatement(String sql) {
        try {
            getConnection();
            preparedStatementStatic = connectionStatic.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatementStatic;
    }

//    查询操作获得ResultSet结果集

    /**
     * 提供获得ResultSet对象的方法
     *
     * @param sql: 需要查询SQL语句
     * @return ResultSet 返回ResultSet
     * @author Kevin KDA on 2020/3/24 22:01
     * @description JdbcUtils / getResultSet
     * @since 1.2
     */
    public static ResultSet getResultSet(String sql) {
        return getResultSet(sql, null);
    }

    /**
     * 提供获得ResultSet对象的方法
     *
     * @param sql:            需要查询SQL语句
     * @param conditionValue: 传入与需要检索条件的列名称对应的检索值
     * @return ResultSet 返回ResultSet
     * @author Kevin KDA on 2020/3/24 22:01
     * @description JdbcUtils / getResultSet
     * @since 1.2
     */
    public static ResultSet getResultSet(String sql, Object[] conditionValue) {
        getPreparedStatement(sql);
        append(conditionValue);
        return executeQuery();
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
     * @since 1.2
     */
    public static ResultSet getResultSet(String[] strTable, String[] strColumn,
                                         String[] strConditionColumn, Object[] conditionValue) {
        StringBuilder stringBuilder = appendSqlString(strTable, strColumn, strConditionColumn);
        getResultSet(stringBuilder.toString(), conditionValue);
        return executeQuery();
    }

//    查询操作获得ResultSet分页结果集

    /**
     * 提供获得ResultSet对象的方法
     *
     * @param sql: 需要查询SQL语句
     * @return ResultSet 返回ResultSet
     * @author Kevin KDA on 2020/3/24 22:01
     * @description JdbcUtils / getResultSet
     * @since 1.4
     * @deprecated 1.5
     */
    @Deprecated
    public static ResultSet getResultSetPaging(String sql, PageBean pageBean) {
        return getResultSetPaging(sql, null, pageBean);
    }

    /**
     * 提供获得ResultSet对象的方法
     *
     * @param sql:            需要查询SQL语句
     * @param conditionValue: 传入与需要检索条件的列名称对应的检索值
     * @param pageBean:       传入数据分页的参数信息
     * @return ResultSet 返回ResultSet
     * @author Kevin KDA on 2020/3/24 22:01
     * @description JdbcUtils / getResultSet
     * @since 1.4
     * @deprecated 1.5
     */
    @Deprecated
    public static ResultSet getResultSetPaging(String sql, Object[] conditionValue, PageBean pageBean) {
        sql = addDataPaging(new StringBuilder(sql), pageBean).toString();
        getPreparedStatement(sql);
        append(conditionValue);
        return executeQuery();
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
     * @since 1.4
     * @deprecated 1.5
     */
    @Deprecated
    public static ResultSet getResultSetPaging(String[] strTable, String[] strColumn,
                                               String[] strConditionColumn, Object[] conditionValue,
                                               PageBean pageBean) {
        StringBuilder stringBuilder = appendSqlString(strTable, strColumn, strConditionColumn);
        String sql = addDataPaging(stringBuilder, pageBean).toString();
        getResultSet(sql, conditionValue);
        return executeQuery();
    }

//    查询操作获得List<Map<String, Object>>结果集

    /**
     * 提供获得ResultSet中详细数据的方法，返回键值对数组供后续处理
     *
     * @param sql: 需要查询SQL语句
     * @return List<Map < String, Object>> 返回键值对数组，其中键为数据表中列名，值为与列对应的值
     * @author Kevin KDA on 2020/3/25 12:11
     * @description JdbcUtils / getResultListMap
     * @since 1.1
     */
    public static List<Map<String, Object>> getResultListMap(String sql) {
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
    public static List<Map<String, Object>> getResultListMap(String sql, Object[] conditionValue) {
        return getListMap(getResultSet(sql, conditionValue));
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
    public static List<Map<String, Object>> getResultListMap(String[] strTable, String[] strColumn,
                                                             String[] strConditionColumn, Object[] conditionValue) {
        return getListMap(getResultSet(strTable, strColumn, strConditionColumn, conditionValue));
    }

    /**
     * 提供统一向数据库提交查询的SQL请求
     *
     * @return int 返回ResultSet结果集 即表
     * @author Kevin KDA on 2020/3/24 22:11
     * @description JdbcUtils / executeQuery
     * @since 1.0
     */
    public static ResultSet executeQuery() {
        try {
            resultSet = preparedStatementStatic.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    /**
     * 提供统一向数据库提交查询的SQL请求
     *
     * @param sql: 需要查询SQL语句
     * @return int 返回ResultSet结果集 即表
     * @author Kevin KDA on 2020/3/24 22:11
     * @description JdbcUtils / executeQuery
     * @since 1.0
     */
    public static ResultSet executeQuery(String sql) {
        try {
            getConnection();
            getPreparedStatement(sql);
            resultSet = preparedStatementStatic.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

//    获得结果集行数、列数

    /**
     * 提供获得ResultSet行数的方法
     *
     * @param resultSet: 传入带操作的结果集
     * @return int 返回ResultSet行数
     * @author Kevin KDA on 2020/3/24 22:01
     * @description JdbcUtils / getResultSetCountRow
     * @since 1.3
     */
    public static int getResultSetCountRow(ResultSet resultSet) {
        int count = 0;
        try {
            resultSet.last();
            count = resultSet.getRow();
            resultSet.beforeFirst();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 提供获得ResultSet列数的方法
     *
     * @param resultSet: 传入带操作的结果集
     * @return int 返回ResultSet列数
     * @author Kevin KDA on 2020/3/24 22:01
     * @description JdbcUtils / getResultSetCountColumn
     * @since 1.3
     */
    public static int getResultSetCountColumn(ResultSet resultSet) {
        int count = 0;
        try {
            resultSet.last();
            count = resultSet.getMetaData().getColumnCount();
            resultSet.beforeFirst();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

//    Utils 获得List<Map<String, Object>>集合

    /**
     * 提供提取ResultSet中详细数据的方法，返回键值对数组供后续处理
     * 私有公用方法
     *
     * @return List<Map < String, Object>> 返回键值对数组，其中键为数据表中列名，值为与列对应的值
     * @author Kevin KDA on 2020/3/25 12:29
     * @description JdbcUtils / getListMap
     * @since 1.1
     */
    public static List<Map<String, Object>> getListMap(ResultSet resultSet) {
        int countColumn = getResultSetCountColumn(resultSet);
        List<Map<String, Object>> list = new ArrayList<>();
        try {
            int tempColumn;
            Map<String, Object> temp;
            while (resultSet.next()) {
                temp = new HashMap<>(countColumn);
                for (int i = 1; i < countColumn + 1; i++) {
                    String key = resultSet.getMetaData().getColumnName(i);
                    Object value = resultSet.getObject(i);
                    temp.put(key, value);
                }
                list.add(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

//    Utils 字符串拼接

    /**
     * 提供追加分页字符串的方法
     *
     * @param stringBuilder: 传入原有SQL语句
     * @param pageBean:      传入分页数据
     * @return StringBuilder
     * @author Kevin KDA on 2020/3/29 20:06
     * @description JdbcUtils / addDataPaging
     * @since 1.4
     * @deprecated 1.5
     */
    @Deprecated
    private static StringBuilder addDataPaging(StringBuilder stringBuilder, PageBean pageBean) {
        int intStartingItemNo = (pageBean.getIntPageCode() - 1) * pageBean.getIntPageSize();
        stringBuilder.append(" LIMIT ").append(intStartingItemNo).append(" , ").append(pageBean.getIntPageSize());
        return stringBuilder;
    }

    /**
     * 提供根据条件进行SQL语句的拼接方法
     *
     * @param strTable:           传入需要查询数据表名
     * @param strColumn:          传入需要查询数据列名，如是多表查询需提供包含表名完整的完成列名
     *                            参数格式：TABLE_A,TABLE_B.COLUMN_A
     * @param strConditionColumn: 传入需要检索条件的列名，若不进行条件检索请赋空
     * @return ResultSet 返回ResultSet
     * @author Kevin KDA on 2020/3/24 22:01
     * @description JdbcUtils / getResultSet
     * @since 1.2
     */
    public static StringBuilder appendSqlString(String[] strTable, String[] strColumn, String[]
            strConditionColumn) {
        StringBuilder stringBuilder = new StringBuilder("SELECT ");
        strSplicing(stringBuilder, strColumn);
        stringBuilder.append(" FROM ");
        strSplicing(stringBuilder, strTable);
        if (strConditionColumn != null && strConditionColumn.length != 0) {
            stringBuilder.append(" WHERE ");
            if (strConditionColumn.length > 1) {
                for (String s : strConditionColumn) {
                    stringBuilder.append(s).append("=? AND ");
                }
                stringBuilder.delete(stringBuilder.length() - 5, stringBuilder.length());
            } else if ("".equals(strConditionColumn[0]) || " ".equals(strConditionColumn[0])) {
                stringBuilder.append("1=1");
            } else {
                stringBuilder.append(strConditionColumn[0]).append("=?");
            }
        }
        return stringBuilder;
    }

    /**
     * 提供对数据表查询的字符串拼接
     *
     * @param stringBuilder: 传入原有StringBuilder对象
     * @param args:          传入待拼接的字符串数组
     * @return StringBuilder 返回拼接完成的字符串
     * @author Kevin KDA on 2020/3/25 12:29
     * @description JdbcUtils / strSplicing
     * @since 1.0
     */
    protected static StringBuilder strSplicing(StringBuilder stringBuilder, String[] args) {
        for (String s :
                args) {
            stringBuilder.append(s).append(",");
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder;
    }

    /**
     * 提供对数据表插入、更新、删除的字符串拼接
     *
     * @param stringBuilder: 传入原有StringBuilder对象
     * @param args:          传入
     * @return StringBuilder 返回拼接完成的字符串
     * @author Kevin KDA on 2020/3/25 12:33
     * @description JdbcUtils / strSplicing
     * @since 1.0
     */
    private static StringBuilder strSplicing(StringBuilder stringBuilder, Object[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            stringBuilder.append("?,");
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder;
    }

//    数据库更新

    /**
     * 提供插入、更新、删除单行数据的方法
     *
     * @param sql: 传入标准SQL语句
     * @return int 返回受影响行数
     * @author Kevin KDA on 2020/3/24 22:02
     * @description JdbcUtils / singleSql
     * @since 1.5
     */
    public static int singleSql(String sql) {
        return singleSql(sql, null);
    }

    /**
     * 提供插入、更新、删除单行数据的方法
     *
     * @param sql:  传入标准SQL语句
     * @param args: 传入将要插入的值
     * @return int 返回受影响行数
     * @author Kevin KDA on 2020/3/24 22:02
     * @description JdbcUtils / singleSql
     * @since 1.5
     */
    public static int singleSql(String sql, Object[] args) {
        getPreparedStatement(sql);
        append(args);
        return executeUpdate();
    }

//    单一功能的插入、更新、删除

    /**
     * 提供插入单个数据的方法
     *
     * @param strTableName: 传入需要操纵的数据库表名
     *                      参数格式：TABLE_A(COLUMN_A,COLUMN_B,COLUMN_C)
     * @param args:         传入将要插入的值
     * @return int 返回受影响行数
     * @author Kevin KDA on 2020/3/24 22:02
     * @description JdbcUtils / insertSingle
     * @since 1.0
     */
    public static int insertSingle(String strTableName, Object[] args) {
        StringBuilder stringBuilder = new StringBuilder("insert into " + strTableName + " values (");
        for (int i = 0; i < args.length; i++) {
            stringBuilder.append("?,");
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        stringBuilder.append(")");
        getPreparedStatement(stringBuilder.toString());
        append(args);
        return executeUpdate();
    }

    /**
     * 提供更新单个数据的方法
     *
     * @param strTable:      传入需要操纵的数据库表名
     * @param strColumnName: 传入需要操纵的数据表列名称，最后一项为条件列，即表主键
     *                       参数格式：TABLE_A,TABLE_B,TABLE_C
     * @param args:          传入将要更新后的值
     * @return int 返回受影响行数
     * @author Kevin KDA on 2020/3/24 22:02
     * @description JdbcUtils / updateSingle
     * @since 1.0
     */
    public static int updateSingle(String strTable, String[] strColumnName, Object[] args) {
        StringBuilder stringBuilder = new StringBuilder("UPDATE " + strTable + " SET ");
        for (int i = 0; i < strColumnName.length - 1; i++) {
            stringBuilder.append(strColumnName[i]).append("=?,");
        }
//        去除末尾多余的空格
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        stringBuilder.append(" WHERE ").append(strColumnName[strColumnName.length - 1]).append("=?");
        getPreparedStatement(stringBuilder.toString());
        append(args);
        return executeUpdate();
    }

    /**
     * 提供删除一系列数据的方法
     *
     * @param strTable:      传入需要操纵的数据库表名
     * @param strColumnName: 传入条件列名称，即表主键名
     * @param strIds:        传入索引值 参数格式：1,2,3
     * @return int 返回受影响行数
     * @author Kevin KDA on 2020/3/24 22:02
     * @description JdbcUtils / delete
     * @since 1.0
     */
    public static int delete(String strTable, String strColumnName, String strIds) {
        String sql = "DELETE FROM " + strTable + " WHERE " + strColumnName + " IN(" + strIds + ")";
        getPreparedStatement(sql);
        return executeUpdate();
    }

//    非批处理提交方法

    /**
     * 提供向PreparedStatement添加参数的方法
     *
     * @param args: 传入需提交的参数
     * @return boolean 返回参数是否添加成功
     * @author Kevin KDA on 2020/3/24 22:10
     * @description JdbcUtils / append
     * @since 1.0
     */
    public static boolean append(Object[] args) {
        try {
            if (args != null) {
                for (int i = 0; i < args.length; i++) {
                    preparedStatementStatic.setObject(i + 1, args[i]);
                }
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 提供逐行向数据库提交的方法 非批处理
     *
     * @return int 返回受影响行数
     * @author Kevin KDA on 2020/3/24 22:11
     * @description JdbcUtils / executeUpdate
     * @since 1.0
     */
    public static int executeUpdate() {
        int count = -1;
        try {
            count = preparedStatementStatic.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

//    批处理提交方法

    /**
     * 提供插入、更新、删除单行数据的方法
     * 提供向PreparedStatement添加参数的方法
     *
     * @param args: 传入需提交的参数
     * @return boolean 返回参数是否添加成功
     * @author Kevin KDA on 2020/3/24 22:10
     * @description JdbcUtils / addBatch
     * @apiNote <p>本方法执行完成后系统将不会提交本次批处理</p>
     * <ol><li>实例化对象获得{@link Connection}连接</li>
     * <li>使用{@link Connection}连接获得{@link PreparedStatement}对象</li>
     * <li>使用{@code addBatch()}向{@link PreparedStatement}追加参数</li>
     * <li>使用{@code executeBatch()}提交批处理</li>
     * <li>清楚批处理缓存</li></ol>
     * @since 1.0
     */
    public int addBatch(Object[] args) {
        try {
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i + 1, args[i]);
            }
            preparedStatement.addBatch();
            intBatchCount++;
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 提供插入、更新、删除单行数据的方法
     * 提供向PreparedStatement添加参数的方法
     *
     * @param args: 传入将要插入的值
     * @return int 返回添加成功数据行数
     * @author Kevin KDA on 2020/3/24 22:02
     * @description JdbcUtils / addBatch
     * @apiNote <p>本方法执行完成后系统将会提交本次批处理</p>
     * <p>批处理单次操作量受 {@code BATCH_MAX} 限制，若超出上线系统将自动提交</p>
     * <p>请确保传入的PreparedStatement对象与开启链接的是同一对象，否则可能会出现未知异常</p>
     * <ol><li>实例化对象获得{@link Connection}连接</li>
     * <li>使用{@link Connection}连接获得{@link PreparedStatement}对象</li>
     * <li>使用{@code addBatch()}向{@link PreparedStatement}追加参数</li>
     * <li>使用{@code executeBatch()}提交批处理</li>
     * <li>清楚批处理缓存</li></ol>
     * @since 1.5
     */
    public int addBatch(List<Object[]> args) {
        int count = 0;
        if ((args.size() + intBatchCount) > BATCH_MAX) {
            List<Section> list = calcSection(args.size());
            for (Section i :
                    list) {
                for (int j = i.getLeft(); j <= i.getRight(); j++) {
                    count += addBatch(args);
                }
                executeBatch();
            }
        } else {
            for (Object[] objects :
                    args) {
                addBatch(objects);
            }
            executeBatch();
        }
        return count;
    }

    /**
     * 提供插入、更新、删除单行数据的方法
     * 提供向PreparedStatement添加参数的方法
     *
     * @param preparedStatement: 传入PreparedStatementd对象
     * @param args:              传入将要插入的值
     * @return int 返回添加成功数据行数
     * @author Kevin KDA on 2020/3/24 22:02
     * @description JdbcUtils / addBatch
     * @apiNote <p>请确保传入的PreparedStatement对象与开启链接的是同一对象，否则可能会出现未知异常</p>
     * <ol><li>实例化对象获得{@link Connection}连接</li>
     * <li>使用{@link Connection}连接获得{@link PreparedStatement}对象</li>
     * <li>使用{@code addBatch()}向{@link PreparedStatement}追加参数</li>
     * <li>使用{@code executeBatch()}提交批处理</li>
     * <li>清楚批处理缓存</li></ol>
     * @since 1.5
     */
    public static int addBatch(PreparedStatement preparedStatement, Object[] args) {
        try {
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i + 1, args[i]);
            }
            preparedStatement.addBatch();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 提供插入、更新、删除单行数据的方法
     * 提供向PreparedStatement添加参数的方法
     *
     * @param preparedStatement: 传入PreparedStatementd对象
     * @param args:              传入将要插入的值
     * @return int 返回添加成功数据行数
     * @author Kevin KDA on 2020/3/24 22:02
     * @description JdbcUtils / addBatch
     * @apiNote <p>请确保传入的PreparedStatement对象与开启链接的是同一对象，否则可能会出现未知异常</p>
     * <ol><li>实例化对象获得{@link Connection}连接</li>
     * <li>使用{@link Connection}连接获得{@link PreparedStatement}对象</li>
     * <li>使用{@code addBatch()}向{@link PreparedStatement}追加参数</li>
     * <li>使用{@code executeBatch()}提交批处理</li>
     * <li>清楚批处理缓存</li></ol>
     * @since 1.5
     */
    public static int addBatch(PreparedStatement preparedStatement, List<Object[]> args) {
        int count = 0;
        try {
            for (Object[] objects :
                    args) {
                for (int i = 0; i < objects.length; i++) {
                    preparedStatement.setObject(i + 1, objects[i]);
                }
                preparedStatement.addBatch();
                count++;
            }
            return count;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 提供统一向数据库提交的方法 批处理
     *
     * @return int 返回受影响行数
     * @author Kevin KDA on 2020/3/24 22:11
     * @description JdbcUtils / executeBatch
     * @apiNote <ol><li>实例化对象获得{@link Connection}连接</li>
     * <li>使用{@link Connection}连接获得{@link PreparedStatement}对象</li>
     * <li>使用{@code addBatch()}向{@link PreparedStatement}追加参数</li>
     * <li>使用{@code executeBatch()}提交批处理</li>
     * <li>清楚批处理缓存</li></ol>
     * @since 1.0
     */
    public int[] executeBatch() {
        int[] count = new int[0];
        try {
            count = preparedStatement.executeBatch();
            preparedStatement.clearBatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 提供统一向数据库提交的方法 批处理
     *
     * @return int 返回受影响行数
     * @author Kevin KDA on 2020/3/24 22:11
     * @description JdbcUtils / executeBatch
     * @apiNote <ol><li>实例化对象获得{@link Connection}连接</li>
     * <li>使用{@link Connection}连接获得{@link PreparedStatement}对象</li>
     * <li>使用{@code addBatch()}向{@link PreparedStatement}追加参数</li>
     * <li>使用{@code executeBatch()}提交批处理</li>
     * <li>清楚批处理缓存</li></ol>
     * @since 1.0
     */
    public static int[] executeBatchS() {
        int[] count = new int[0];
        try {
            count = preparedStatementStatic.executeBatch();
            preparedStatementStatic.clearBatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

//    批处理Utils

    /**
     * 计算批处理单次上载区间
     *
     * @param count: 传入待上传的数据量
     * @return List<Section> 返回区间数组
     * @author Kevin KDA on 2020/3/31 22:00
     * @description JdbcUtils / calcSection
     * @apiNote <p>批处理单次操作量受 {@code BATCH_MAX} 限制</p>
     * <p>返回结果为数组下标，请不要进行减1操作</p>
     * @since 1.5
     */
    private List<Section> calcSection(int count) {
        List<Section> sectionList = new ArrayList<>();
        Section section;
        int tempLeft;
        int tempRight = 0;
        while (tempRight < count) {
            tempLeft = tempRight;
            if (tempRight == 0) {
                tempRight = BATCH_MAX - intBatchCount;
            } else if (tempRight + BATCH_MAX > count) {
                tempRight = count;
            } else {
                tempRight += BATCH_MAX;
            }
            section = new Section(tempLeft, tempRight - 1);
            sectionList.add(section);
        }
        return sectionList;
    }

//    事务处理

    /**
     * 开启事务，设置事务自动提交为false
     *
     * @return boolean 返回是否成功
     * @author Kevin KDA on 2020/3/26 22:14
     * @description JdbcUtils / beginTransaction
     * @since 1.3
     */
    public static boolean beginTransaction() {
        if (connectionStatic != null) {
            return false;
        }
        try {
            getConnection();
            connectionStatic.setAutoCommit(false);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 提交事务
     *
     * @return boolean 返回是否成功
     * @author Kevin KDA on 2020/3/26 22:14
     * @description JdbcUtils / commitTransaction
     * @since 1.3
     */
    public static boolean commitTransaction() {
        if (connectionStatic == null) {
            return false;
        }
        try {
            getConnection();
            connectionStatic.commit();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 回滚事务
     *
     * @return boolean 返回是否成功
     * @author Kevin KDA on 2020/3/26 22:14
     * @description JdbcUtils / rollbackTransaction
     * @since 1.3
     */
    public static boolean rollbackTransaction() {
        if (connectionStatic == null) {
            return false;
        }
        try {
            getConnection();
            connectionStatic.rollback();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

//    覆写父接口、父类方法

    /**
     * 实现AutoCloseable接口 关闭数据库连接
     *
     * @return void
     * @author Kevin KDA on 2019/10/31 21:53
     * @description JdbcUtils / getConnection
     * @since 1.0
     */
    @Override
    public void close() throws Exception {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatementStatic != null) {
                preparedStatementStatic.close();
            }
            if (connectionStatic != null) {
                connectionStatic.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    Constructor、Getter、Setter

    public JdbcUtils() {
        this.intBatchCount = 0;
    }

    public static int getDatabaseCurrentlyInUse() {
        return DATABASE_CURRENTLY_IN_USE;
    }

    public static int getMySql() {
        return MYSQL;
    }

    public static int getOracle() {
        return ORACLE;
    }

    public static int getSqlServer() {
        return SQL_SERVER;
    }

    public static String getDriver() {
        return DRIVER;
    }

    public static String getUrl() {
        return URL;
    }

    public static String getUser() {
        return USER;
    }

    public static String getPassword() {
        return PASSWORD;
    }

    public static int getBatchMax() {
        return BATCH_MAX;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public void setPreparedStatement(PreparedStatement preparedStatement) {
        this.preparedStatement = preparedStatement;
    }
}
