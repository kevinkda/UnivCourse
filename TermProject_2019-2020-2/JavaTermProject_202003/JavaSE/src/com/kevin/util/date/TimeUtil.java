/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Kevin KDA on 2020/3/17 10:18
 * @version 1.0
 * @package com.kevin.util.date
 * @classname TimeUtil
 * @description 提供计时方法
 * @interface/enum
 */
public class TimeUtil {
    private long startTime;
    private long endTime;
    private long duration;

    /**
     * @return void
     * @author Kevin KDA on 2020/3/17 14:45
     * @description TimeUtil / startTime 开始计时
     */
    public void startTime() {
        this.startTime = System.currentTimeMillis();
    }

    /**
     * @return void
     * @author Kevin KDA on 2020/3/17 14:45
     * @description TimeUtil / stopTime 结束计时
     */
    public long stopTime() {
        this.endTime = System.currentTimeMillis();
        this.duration = this.endTime - this.startTime;
        return this.duration;
    }


    /**
     * 获取时长，返回毫秒
     *
     * @return long
     * @author Kevin KDA on 2020/3/17 15:03
     * @description TimeUtil / getDurationBySecond 获取时长，返回毫秒
     */
    public long getDurationByMillisecond() {
        return duration;
    }

    /**
     * 获取时长，返回秒
     *
     * @return double
     * @author Kevin KDA on 2020/3/17 15:03
     * @description TimeUtil / getDurationBySecond 获取时长，返回秒
     */
    public double getDurationBySecond() {
        return duration / 1000.0;
    }

    /**
     * 进行毫秒到秒的转换
     *
     * @param time: 获取去转换的毫秒数
     * @return double
     * @author Kevin KDA on 2020/3/17 15:05
     * @description TimeUtil / millisecondsToSeconds 进行毫秒到秒的转换
     */
    public double millisecondsToSeconds(long time) {
        return time / 1000.0;
    }

    /**
     * 进行毫秒到分的转换
     *
     * @param time: 获取去转换的毫秒数
     * @return double
     * @author Kevin KDA on 2020/3/17 15:05
     * @description TimeUtil / millisecondsToMinute 进行毫秒到分的转换
     */
    public double millisecondsToMinute(long time) {
        return time / 1000.0 / 60.0;
    }

    public TimeUtil() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getDuration() {
        return duration;
    }

    public static String getTimeStatus() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("HH");
        String str = df.format(date);
        String str2 = null;
        int a = Integer.parseInt(str);
        if (a >= 0 && a <= 6) {
            str2 = "，现在已是深夜，智能管家提醒您注意用眼健康噢~\n";
        }
        if (a > 6 && a <= 12) {
            str2 = "，早上好~~~\n";
        }
        if (a == 13) {
            str2 = "，中午好~~~\n";
        }
        if (a > 13 && a <= 18) {
            str2 = "，下午好~~~\n";
        }
        if (a > 18 && a <= 24) {
            str2 = "，晚上好~~~\n";
        }
        return str2;
    }
}