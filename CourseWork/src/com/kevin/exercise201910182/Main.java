/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package e201910182;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Project E2017
 * @Package e20191018
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/10/18 11:20
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        getWeekOfYear("2019-10-18");
    }

    public static int getWeekOfYear(String date) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            // 设置每周的第一天为星期一
            cal.setFirstDayOfWeek(Calendar.MONDAY);
            cal.setMinimalDaysInFirstWeek(1); // 设置每周最少为1天
            cal.setTime(df.parse(date));
            return cal.get(Calendar.WEEK_OF_YEAR);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}
