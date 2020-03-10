package com.kevin.job20200308.bookmanager.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @author Kevin KDA on 2020/3/10 10:04
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200308.bookmanager.util
 * @classname DateTimeUtil
 * @description
 * @interface/enum
 */
public class DateTimeUtil {
    /**
     * @param date: 传入Date类型日期
     * @return String
     * @author Kevin KDA on 2020/3/10 10:33
     * @description DateTimeUtil / formatStringByDate 将日期格式化成规定合适的字符串后返回
     */
    public static String formatStringByDate(Date date) {
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(date);
    }

    /**
     * @param s: 传入字符串类型时间
     * @return Date
     * @author Kevin KDA on 2020/3/10 10:07
     * @description DateTimeUtil / stampToDate 时间戳转日期时间
     */
    public static Date stampToDate(String s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        return new Date(lt);
    }

    /**
     * @param startDate: 传入开始日期
     * @return long
     * @author Kevin KDA on 2020/3/10 10:08
     * @description DateTimeUtil / currentToEnd 计算现在到某一个日期的间隔天数
     */
    public static long currentToStart(Date startDate) {
        return Math.abs(currentToEnd(startDate));
    }

    /**
     * @param endDate: 传入结束日期
     * @return long
     * @author Kevin KDA on 2020/3/10 10:08
     * @description DateTimeUtil / currentToEnd 计算现在到某一个日期的间隔天数
     */
    public static long currentToEnd(Date endDate) {
        String[] currentStr = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).split("-");
        String[] endStr = new SimpleDateFormat("yyyy-MM-dd").format(endDate).split("-");
        Integer currentYear = Integer.parseInt(currentStr[0]);
        Integer currentMonth = Integer.parseInt(currentStr[1]);
        Integer currentDay = Integer.parseInt(currentStr[2]);
        int endYear = Integer.parseInt(endStr[0]);
        int endMonth = Integer.parseInt(endStr[1]);
        int endDay = Integer.parseInt(endStr[2]);
        LocalDate endLocalDate = LocalDate.of(endYear, endMonth, endDay);
        return LocalDate.now().until(endLocalDate, ChronoUnit.DAYS);
    }

    /**
     * @param startDate: 传入开始日期
     * @param endDate:   传入结束日期
     * @return long
     * @author Kevin KDA on 2020/3/10 10:12
     * @description DateTimeUtil / startToEnd 计算两个日期之间的间隔天数
     */
    public static long startToEnd(Date startDate, Date endDate) {
        String[] startStr = new SimpleDateFormat("yyyy-MM-dd").format(startDate).split("-");
        String[] endStr = new SimpleDateFormat("yyyy-MM-dd").format(endDate).split("-");
        int startYear = Integer.parseInt(startStr[0]);
        int startMonth = Integer.parseInt(startStr[1]);
        int startDay = Integer.parseInt(startStr[2]);
        int endYear = Integer.parseInt(endStr[0]);
        int endMonth = Integer.parseInt(endStr[1]);
        int endDay = Integer.parseInt(endStr[2]);
        LocalDate endLocalDate = LocalDate.of(endYear, endMonth, endDay);
        LocalDate startLocalDate = LocalDate.of(startYear, startMonth, startDay);
        return startLocalDate.until(endLocalDate, ChronoUnit.DAYS);
    }
}
