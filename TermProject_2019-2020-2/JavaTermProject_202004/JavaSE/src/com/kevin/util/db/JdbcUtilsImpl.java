package com.kevin.util.db;

import com.kevin.util.number.Section;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2020/4/1 09:19
 * @version 1.2
 * @project JavaTermProject_202004
 * @package com.kevin.util.db
 * @classname JdbcUtilsImpl
 * @interface/enum AutoCloseable
 * @apiNote <p>此项目希望做到提供尽可能的通用方法，但某些特殊情况可能无法提供处理。</p>
 * <p>此封装类已实现对{@link AutoCloseable}的支持，调用方可以获取它的资源直到结束，这将自动调用{@code close}。</p>
 * <p>此封装类已尽可能的对{@link Exception}进行{@code try}捕获，
 * 不可避免的这可能将会导致后续程序的在特定情况下产生{@link NullPointerException}。</p>
 * <p>此封装类依赖{@link PageBean}、{@link JdbcUtils}，数据分页部分依赖{@link PageBean}，
 * 自1.5版本开始本类方法提供的数据分页将被标记为{@link Deprecated}</p>
 * @since 1.0 (JDK 1.7)
 */
public class JdbcUtilsImpl extends AbstractJdbc implements AutoCloseable {
    /**
     * Connection
     */
    private Connection connection = null;
    /**
     * Statement
     */
    private Statement statement = null;
    /**
     * PreparedStatement
     */
    private PreparedStatement preparedStatement = null;
    /**
     * CallableStatement
     */
    private CallableStatement callableStatement = null;
    /**
     * ResultSet
     */
    private ResultSet resultSet = null;


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
     * @since 1.0
     */
    public Connection getConnection() {
        if (connection == null) {
            try {
//            1.加载驱动程序
                Class.forName(DRIVER);
//            2.获得数据库的连接
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    /**
     * 提供获得Statement对象的方法
     *
     * @return Statement 返回Statement
     * @author Kevin KDA on 2020/3/31 18:45
     * @description JdbcUtils / getStatement
     * @apiNote <p>此方法需要实例化，对于批处理方式请按照如下方式执行：</p>
     * <ol><li>实例化对象获得{@link Connection}连接</li>
     * <li>使用{@link Connection}连接获得{@link Statement}对象</li>
     * <li>使用{@code addBatch()}向{@link Statement}追加参数</li>
     * <li>使用{@code executeBatch()}提交批处理</li>
     * <li>清楚批处理缓存</li></ol>
     * @since 1.1
     */
    public Statement getStatement() {
        try {
            getConnection();
            if (statement == null) {
                statement = connection.createStatement();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return statement;
    }

    /**
     * 提供获得PreparedStatement对象的方法
     *
     * @param sql: 提供创建PreparedStatement的SQL语句
     * @return PreparedStatement 返回PreparedStatement
     * @author Kevin KDA on 2020/3/31 18:45
     * @description JdbcUtils / getPreparedStatement
     * @apiNote <p>此方法需要实例化，对于批处理方式请按照如下方式执行：</p>
     * <ol><li>实例化对象获得{@link Connection}连接</li>
     * <li>使用{@link Connection}连接获得{@link PreparedStatement}对象</li>
     * <li>使用{@code addBatch()}向{@link PreparedStatement}追加参数</li>
     * <li>使用{@code executeBatch()}提交批处理</li>
     * <li>清楚批处理缓存</li></ol>
     * @since 1.0
     */
    public PreparedStatement getPreparedStatement(String sql) {
        try {
            if (preparedStatement == null) {
                preparedStatement = connection.prepareStatement(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return preparedStatement;
    }

//    存储过程

    /**
     * 调用存储过程，返回执行结果集
     *
     * @param proc: 传入完整SQL语句
     *              参数形式{@code CALL procedure(?...)}
     * @param args: 传入存储过程参数组
     * @return ResultSet 返回结果集
     * @author Kevin KDA on 2020/4/1 19:15
     * @description JdbcUtilsImpl / runCallableStatement
     * @apiNote 在使用存储过程前，请了解需要调用的存储过程所需传入的参数和返回结果
     * @since 1.1
     */
    public ResultSet runCallableStatement(String proc, Object[] args) {
        try {
            callableStatement = getConnection().prepareCall(proc);
            for (int i = 0; i < args.length; i++) {
                callableStatement.setObject(i + 1, args[i]);
            }
            resultSet = callableStatement.executeQuery();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

//    批处理提交方法

    /**
     * 设置自动提交关闭
     *
     * @return boolean 返回设置结果
     * @author Kevin KDA on 2020/4/2 13:30
     * @description JdbcUtilsImpl / changeAutoCommit
     */
    public boolean changeAutoCommit() {
        try {
            connection.setAutoCommit(false);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 提供插入、更新、删除单行数据的方法
     * 提供向Statement添加参数的方法
     *
     * @param sql: 传入标准SQL语句
     * @return int 返回添加成功行数
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
    public int addBatch(String sql) {
        try {
            statement.addBatch(sql);
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
     * @param args: 传入需提交的参数
     * @return int 返回添加成功行数
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
     * @since 1.0
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
            if (statement != null) {
                count = statement.executeBatch();
                statement.clearBatch();
            }
            if (preparedStatement != null) {
                count = preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            }
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
     * @since 1.0
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
     * @since 1.0
     */
    public boolean beginTransaction() {
        if (connection != null) {
            return false;
        }
        try {
            getConnection();
            connection.setAutoCommit(false);
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
     * @since 1.0
     */
    public boolean commitTransaction() {
        if (connection == null) {
            return false;
        }
        try {
            getConnection();
            connection.commit();
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
     * @since 1.0
     */
    public boolean rollbackTransaction() {
        if (connection == null) {
            return false;
        }
        try {
            getConnection();
            connection.rollback();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

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
        if (resultSet != null) {
            resultSet.close();
        }
        if (callableStatement != null) {
            callableStatement.close();
        }
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }


//    Constructor、Getter、Setter


    public JdbcUtilsImpl() {
        this.intBatchCount = 0;
    }

    public static int getDatabaseCurrentlyInUse() {
        return DATABASE_CURRENTLY_IN_USE;
    }

    public static int getBatchMax() {
        return BATCH_MAX;
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

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public void setPreparedStatement(PreparedStatement preparedStatement) {
        this.preparedStatement = preparedStatement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public CallableStatement getCallableStatement() {
        return callableStatement;
    }

    public void setCallableStatement(CallableStatement callableStatement) {
        this.callableStatement = callableStatement;
    }
}
