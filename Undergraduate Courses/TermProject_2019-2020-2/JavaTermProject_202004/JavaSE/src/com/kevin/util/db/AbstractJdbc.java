package com.kevin.util.db;

import java.util.ResourceBundle;

/**
 * @author Kevin KDA on 2020/4/1 21:08
 * @version 1.0
 * @package com.kevin.util.db
 * @classname AbstractJdbc
 * @description
 * @interface/enum
 */
public abstract class AbstractJdbc {
    /**
     * 资源文件包路径
     */
    private static final String RESOURCE_PATH = "com.kevin.util.resource.db.db";
    /**
     * 当前使用的数据库
     */
    static int DATABASE_CURRENTLY_IN_USE = 0;
    /**
     * 批处理最大接收数值
     */
    static int BATCH_MAX = 0;
    /**
     * 批处理当前接收数值
     */
    int intBatchCount = 0;
    /**
     * 数据库类型MySQL
     */
    static final int MYSQL = 1;
    /**
     * 数据库类型Oracle
     */
    static final int ORACLE = 2;
    /**
     * 数据库类型SQL Server
     */
    static final int SQL_SERVER = 3;
    /**
     * 数据库驱动名称
     */
    static String DRIVER = null;
    /**
     * 数据库链接地址
     */
    static String URL = null;
    /**
     * 数据库用户名
     */
    static String USER = null;
    /**
     * 数据库用户密码
     */
    static String PASSWORD = null;

//    初始化对象

    /**
     * 设置当前使用的数据库
     *
     * @param choose: 选择数据库类型，请根据本类提供的final修饰字段选择
     * @return boolean 返回获取结果
     * @author Kevin KDA on 2020/4/1 21:17
     * @description AbstractJdbc / chooseDbType
     * @apiNote <p>若选择错误本类将使用MySQL作为默认数据库</p>
     * <p>程序提供的数据库如下:</p>
     * <ol><li>MySQL</li>
     * <li>Oracle</li>
     * <li>SQL Server</li></ol>
     * @since 1.0
     */
    protected boolean chooseDbType(int choose) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(RESOURCE_PATH);
        BATCH_MAX = Integer.parseInt(resourceBundle.getString("db.BatchMax"));
        switch (DATABASE_CURRENTLY_IN_USE) {
            case ORACLE:
                DRIVER = resourceBundle.getString("jdbc.oracle.driver");
                URL = resourceBundle.getString("jdbc.oracle.url");
                USER = resourceBundle.getString("jdbc.oracle.user");
                PASSWORD = resourceBundle.getString("jdbc.oracle.password");
                return true;
            case SQL_SERVER:
                DRIVER = resourceBundle.getString("jdbc.sqlserver.driver");
                URL = resourceBundle.getString("jdbc.sqlserver.url");
                USER = resourceBundle.getString("jdbc.sqlserver.user");
                PASSWORD = resourceBundle.getString("jdbc.sqlserver.password");
                return true;
            case MYSQL:
            default:
                DRIVER = resourceBundle.getString("jdbc.mysql.driver");
                URL = resourceBundle.getString("jdbc.mysql.url");
                USER = resourceBundle.getString("jdbc.mysql.user");
                PASSWORD = resourceBundle.getString("jdbc.mysql.password");
                return true;
        }
    }

//    Constructor、Getter、Setter

    AbstractJdbc() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(RESOURCE_PATH);
        DATABASE_CURRENTLY_IN_USE = Integer.parseInt(resourceBundle.getString("db.DatabaseCurrentlyInUse"));
        chooseDbType(DATABASE_CURRENTLY_IN_USE);
    }

    public static String getResourcePath() {
        return RESOURCE_PATH;
    }

    public static int getDatabaseCurrentlyInUse() {
        return DATABASE_CURRENTLY_IN_USE;
    }

    public static void setDatabaseCurrentlyInUse(int databaseCurrentlyInUse) {
        DATABASE_CURRENTLY_IN_USE = databaseCurrentlyInUse;
    }

    public static int getBatchMax() {
        return BATCH_MAX;
    }

    public static void setBatchMax(int batchMax) {
        BATCH_MAX = batchMax;
    }

    public int getIntBatchCount() {
        return intBatchCount;
    }

    public void setIntBatchCount(int intBatchCount) {
        this.intBatchCount = intBatchCount;
    }

    public static int getMYSQL() {
        return MYSQL;
    }

    public static int getORACLE() {
        return ORACLE;
    }

    public static int getSqlServer() {
        return SQL_SERVER;
    }

    public static String getDRIVER() {
        return DRIVER;
    }

    public static void setDRIVER(String DRIVER) {
        AbstractJdbc.DRIVER = DRIVER;
    }

    public static String getURL() {
        return URL;
    }

    public static void setURL(String URL) {
        AbstractJdbc.URL = URL;
    }

    public static String getUSER() {
        return USER;
    }

    public static void setUSER(String USER) {
        AbstractJdbc.USER = USER;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        AbstractJdbc.PASSWORD = PASSWORD;
    }
}
