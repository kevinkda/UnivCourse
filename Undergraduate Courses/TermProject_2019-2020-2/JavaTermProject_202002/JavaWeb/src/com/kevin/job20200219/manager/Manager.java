/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200219.manager;

import com.kevin.job20200219.entity.Vitae;

import java.text.SimpleDateFormat;

/**
 * @author Kevin KDA on 2020/2/17 15:18
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200217.manager
 * @classname Manager
 * @description TODO
 * @interface/enum
 */
public class Manager {
    public static Vitae getInformation() {
        try {
            return new Vitae(
                    "唐可寅",
                    "男",
                    165,
                    new SimpleDateFormat("yyyy-MM-dd").parse("1999-01-17"),
                    57.5,
                    "420107200009210921",
                    "+86 17607130921",
                    "804341013",
                    "p804341013",
                    "kevin_kda@yahoo.com.au",
                    "大学本科",
                    "无",
                    "计算机科学与技术 (Computer Science and Technology)",
                    "湖北省武汉市洪山区欢乐谷"
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
