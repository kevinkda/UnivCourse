package com.kevin.util.db;

import com.kevin.util.number.Section;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @author Kevin KDA on 2020/4/1 09:19
 * @version 1.1
 * @project JavaUtils
 * @package com.kevin.util.db
 * @classname JdbcUtilsImpl
 * @description
 * @interface/enum
 */
public class JdbcUtilsImpl implements AutoCloseable {
    /**
     * 当前使用的数据库
     */
    private static final int DATABASE_CURRENTLY_IN_USE;
    /**
     * 批处理最大接收数值
     */
    private static final int BATCH_MAX;
    /**
     * 批处理当前接收数值
     */
    private int intBatchCount;
    /**
     * 数据库类型MySQL
     */
    private static final int MYSQL = 1;
    /**
     * 数据库类型Oracle
     */
    private static final int ORACLE = 2;
    /**
     * 数据库类型SQL Server
     */
    private static final int SQL_SERVER = 3;
    /**
     * 数据库驱动名称
     */
    private static final String DRIVER;
    /**
     * 数据库链接地址
     */
    private static final String URL;
    /**
     * 数据库用户名
     */
    private static final String USER;
    /**
     * 数据库用户密码
     */
    private static final String PASSWORD;
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

//    初始化对象

    /*
     * 根据配置文件选择使用指定数据库
     * 提供获取数据库链接字段 DRIVER、URL、USER、PASSWORD 的方法
     * @author Kevin KDA on 2020/3/25 12:18
     * @description JdbcUtils / static
     */
    static {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.kevin.util.resource.db.db");
        DATABASE_CURRENTLY_IN_USE = Integer.parseInt(resourceBundle.getString("db.DatabaseCurrentlyInUse"));
        BATCH_MAX = Integer.parseInt(resourceBundle.getString("db.BatchMax"));
        switch (DATABASE_CURRENTLY_IN_USE) {
            case ORACLE:
                DRIVER = resourceBundle.getString("jdbc.oracle.driver");
                URL = resourceBundle.getString("jdbc.oracle.url");
                USER = resourceBundle.getString("jdbc.oracle.user");
                PASSWORD = resourceBundle.getString("jdbc.oracle.password");
                break;
            case SQL_SERVER:
                DRIVER = resourceBundle.getString("jdbc.sqlserver.driver");
                URL = resourceBundle.getString("jdbc.sqlserver.url");
                USER = resourceBundle.getString("jdbc.sqlserver.user");
                PASSWORD = resourceBundle.getString("jdbc.sqlserver.password");
                break;
            case MYSQL:
            default:
                DRIVER = resourceBundle.getString("jdbc.mysql.driver");
                URL = resourceBundle.getString("jdbc.mysql.url");
                USER = resourceBundle.getString("jdbc.mysql.user");
                PASSWORD = resourceBundle.getString("jdbc.mysql.password");
                break;
        }
    }

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
            count = preparedStatement.executeBatch();
            preparedStatement.clearBatch();
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
        Section section = null;
        int tempLeft = 0;
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

    public int getIntBatchCount() {
        return intBatchCount;
    }

    public void setIntBatchCount(int intBatchCount) {
        this.intBatchCount = intBatchCount;
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

    public Statement getStatement() {
        return statement;
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
