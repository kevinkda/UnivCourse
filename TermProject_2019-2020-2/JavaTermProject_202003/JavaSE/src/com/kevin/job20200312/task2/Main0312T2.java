package com.kevin.job20200312.task2;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Kevin KDA on 2020/3/12 13:14
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200312.task2
 * @classname Main0312T2
 * @description
 * @interface/enum
 */
public class Main0312T2 {

    public static void ds01() {
        // 需要定时执行的任务
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("-----定时测试-----");
            }
        };
        // Timer定时器工具
        Timer timer = new Timer();
        // 延迟(首次执行的时间)
        long delay = 0;
        // 间隔周期(/毫秒数)
        long intevalPeriod = 5 * 1000;
        ////立即执行，并且每5秒执行一次
        timer.scheduleAtFixedRate(task, delay, intevalPeriod);

    }

    public static void ds02() {
        // 需要定时执行的任务
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("-----定时器-----");
            }
        };
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        //立即执行，并且每5秒执行一次
        ses.scheduleAtFixedRate(runnable, 0, 5000, TimeUnit.MILLISECONDS);

    }

    public static void main(String... args) {
//        ds01();
//        ds02();
        TestTimer.showTimer();
    }
}
