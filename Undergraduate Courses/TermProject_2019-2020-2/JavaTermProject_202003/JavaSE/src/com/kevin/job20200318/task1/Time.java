package com.kevin.job20200318.task1;

import java.io.Serializable;

/**
 * @author Kevin KDA on 2020/3/17 15:26
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200317
 * @classname Time
 * @description
 * @interface/enum
 */
public class Time implements Serializable {
    private static final long serialVersionUID = -8402795596948954372L;
    private String funcName;
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

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getDuration() {
        return duration;
    }

    public Time(String funcName) {
        this.funcName = funcName;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

}
