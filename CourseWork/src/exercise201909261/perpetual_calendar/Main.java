/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Exercise_20190926.perpetual_calendar;

import java.util.Scanner;

/**
 * @Project CourseWork
 * @Package Exercise_20190926.perpetual_calendar
 * @Author Kevin KDA
 * @Description TODO PerpetualCalendar
 * @Date 2019/9/26 9:27
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scaSca = new Scanner(System.in);
        PerpetualCalendar perpetualCalendar = new PerpetualCalendar();
        perpetualCalendar.PerpetualCalendar(scaSca);
    }
}
