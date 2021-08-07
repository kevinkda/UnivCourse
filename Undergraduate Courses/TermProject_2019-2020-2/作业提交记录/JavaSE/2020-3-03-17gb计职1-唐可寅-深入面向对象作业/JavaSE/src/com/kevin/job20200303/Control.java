/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200303;

import com.kevin.job20200303.entity.Hero;
import com.kevin.job20200303.entity.Monster;

import java.util.Scanner;

/**
 * @author Kevin KDA on 2020/2/27 15:25
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200301
 * @classname Control
 * @description TODO
 * @interface/enum
 */
public class Control {
    private Scanner scaScan = new Scanner(System.in);

    int task1() {
        Monster monster = new Monster(30);
        Hero hero = new Hero(9210);
        System.out.println("\n按任意键开始打怪兽\n按 x 键退出本程序");
        if ("x".equals(scaScan.next())) {
            return 1;
        } else {
            System.out.println("英雄当前Lv\t"+hero.getIntHeroLv());
            System.out.println("英雄当前EXP\t"+hero.getIntHeroExp());
            System.out.println("英雄当前HP\t"+hero.getIntHeroHp());
            System.out.println("怪兽当前Lv\t"+monster.getIntMonsterLv());
            System.out.println("怪兽当前EXP\t"+monster.getIntMonsterExp());
            System.out.println("怪兽当前HP\t"+monster.getIntMonsterHp());
            hero.fight(monster.getIntMonsterHp());

        }
        return 0;
    }

    void task2() {
        System.out.println("本次任务无此任务编号，请输入其他代码");
    }

    void task3() {
        System.out.println("本次任务无此任务编号，请输入其他代码");
    }

    void task4() {
        System.out.println("本次任务无此任务编号，请输入其他代码");
    }

    void task5() {
        System.out.println("本次任务无此任务编号，请输入其他代码");
    }
}
