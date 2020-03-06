/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200217.manager;

import com.kevin.job20200217.entity.Vitae;

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
//    static ArrayList<Vitae> arrayList = new ArrayList<>();

    protected void addInformation() {
    }

    protected void getInformation() {
//        Vitae vitae = arrayList.get(0);
        try {
            Vitae vitae = new Vitae(
                    "唐可寅",
                    "男",
                    165,
                    new SimpleDateFormat("yyyy-MM-dd").parse("1999-01-17"),
                    "+86 17607130921",
                    "804341013",
                    "p804341013",
                    "kevin_kda@yahoo.com.au",
                    "大学本科",
                    "无",
                    "计算机科学与技术 (Computer Science and Technology)"
            );

            System.out.println("\n\n=========================================个人简历=========================================");
            System.out.println(" 姓  名\t" + vitae.getStrName());
            System.out.println(" 年  龄\t" + vitae.getIntAgeByBirth() + "岁");
            System.out.println(" 性  别\t" + vitae.getStringSex());
            System.out.println(" 电  话\t" + vitae.getStrPhone());
            System.out.println("   QQ\t" + vitae.getStrQq());
            System.out.println(" 微  信\t" + vitae.getStrWeChat());
            System.out.println(" 邮  箱\t" + vitae.getStrEmail());
            System.out.println("主修课程\t" + vitae.getStrMajor());
            System.out.println("学习经历\t" + vitae.getStrLearnExp());
            System.out.println("项目经验\t" + vitae.getStrProjExp());

        } catch (Exception e) {

        }

        /**
         * 日期输入方法
         */
        //输入想要添加的生日
//        String string ="1999-05-22";
        //设置日期格式  yyyy-MM-dd-HH-mm-ss这个是完整的
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //将字符串转换成date类型数据
//        date = dateFormat.parse(string);
        //存入到user中即可
//        user.setBirthday(date);
    }
}
