package com.kevin.job20200402;

import com.kevin.util.date.TimeUtil;
import com.kevin.util.db.JdbcUtilsImpl;

/**
 * @author Kevin KDA on 2020/4/1 20:23
 * @version 1.0
 * @project JavaTermProject_202004
 * @package com.kevin.job20200402
 * @classname Control
 * @description
 * @interface/enum
 */
public class Control {
    void func() {
        TimeUtil timeUtil = new TimeUtil();
        timeUtil.startTime();

        JdbcUtilsImpl jdbcUtilsImpl = new JdbcUtilsImpl();
        jdbcUtilsImpl.getStatement();
        jdbcUtilsImpl.changeAutoCommit();
        for (int i = 0; i < 1000; i++) {
            jdbcUtilsImpl.addBatch("insert into table_name (column_2, column_3) values (" + i + ", " + i * 921 + ")");
        }
        jdbcUtilsImpl.executeBatch();

//        System.out.println(Arrays.toString(jdbcUtilsImpl.executeBatch()));

        timeUtil.stopTime();
        System.out.println(timeUtil.getDurationByMillisecond());
    }

    public Control() {
        func();
    }
}
