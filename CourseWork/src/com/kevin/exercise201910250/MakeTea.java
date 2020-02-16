/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.exercise201910250;

/**
 * @author Kevin KDA on 2019/10/25 9:05
 * @version 1.0
 * @project Java_Course_Assignments
 * @package exercise201910251
 * @classname MakeTea
 * @description TODO
 * @interface/enum
 */
public class MakeTea {
    public static void main(String[] args) {
        //启动烧水线程
        new BoilThread().start();
        //启动洗茶杯线程
        new WashThread().start();
    }
}
