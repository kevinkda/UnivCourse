package com.kevin.job20200401;

import com.kevin.util.date.TimeUtil;
import com.kevin.util.db.JdbcUtils;
import com.kevin.util.db.JdbcUtilsImpl;

import java.util.List;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/4/1 20:23
 * @version 1.0
 * @project JavaTermProject_202004
 * @package com.kevin.job20200401
 * @classname Control
 * @description
 * @interface/enum
 */
public class Control {
    void func() {
        TimeUtil timeUtil = new TimeUtil();
        timeUtil.startTime();
        JdbcUtilsImpl jdbcUtilsImpl = new JdbcUtilsImpl();
        List<Map<String, Object>> list = null;
        try {
            list = JdbcUtils.getListMap(
                    jdbcUtilsImpl.runCallableStatement("CALL NewProc(?)",
                            new Object[]{"sdhslkjgsg"})
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Map<String, Object> i :
                list) {
            System.out.println(i);
        }
        timeUtil.stopTime();
        System.out.println(timeUtil.getDurationByMillisecond());
    }

    public Control() {
        func();
    }
}
