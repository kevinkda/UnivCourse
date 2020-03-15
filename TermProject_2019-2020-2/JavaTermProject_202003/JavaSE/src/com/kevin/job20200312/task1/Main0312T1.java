package com.kevin.job20200312.task1;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Kevin KDA on 2020/3/12 13:07
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200312.task1
 * @classname Main0312T1
 * @description
 * @interface/enum
 */
public class Main0312T1 {
    private static final Runnable blockRunner = () -> {
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("one round:" + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };
    private static final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

    public static void main(String[] args) {
        scheduledExecutorService.scheduleAtFixedRate(blockRunner, 0, 100, TimeUnit.MILLISECONDS);
    }
}
