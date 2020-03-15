package com.kevin.job20200312.task2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Kevin KDA on 2020/3/12 13:26
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200312.task2
 * @classname TestTimer
 * @description
 * @interface/enum
 */
public class TestTimer {
    static int count = 0;

    public static void showTimer() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                ++count;
                System.out.println("时间=" + new Date() + " 执行了" + count + "次"); // 1次
            }
        };

//设置执行时间
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        //每天
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int w = calendar.get(Calendar.WEEK_OF_MONTH);
//定制每天的21:09:00执行，
        calendar.set(year, month, day, 21, 9, 00);
        Date date = calendar.getTime();
        Timer timer = new Timer();
        System.out.println(date);

        int period = 2 * 1000;
//每天的date时刻执行task，每隔2秒重复执行
        timer.schedule(task, date, period);
//每天的date时刻执行task, 仅执行一次
//timer.schedule(task, date);
    }
}
