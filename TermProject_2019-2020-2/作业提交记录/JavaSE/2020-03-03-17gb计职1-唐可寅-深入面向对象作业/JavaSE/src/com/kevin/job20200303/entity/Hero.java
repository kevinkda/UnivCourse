/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200303.entity;

import java.util.Random;

/**
 * @author Kevin KDA on 2020/3/3 13:34
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200303.entity
 * @classname Hero
 * @description TODO
 * @interface/enum
 */
public class Hero {
    /**
     * 怪兽等级
     */
    private int intHeroLv;
    /**
     * 怪兽血量
     */
    private int intHeroHp;
    /**
     * 怪兽经验
     */
    private int intHeroExp;
    /**
     * 英雄攻击力
     */
    private int intHeroPower;
    Random random = new Random();

    private int calculateExpByLv(int intLv) {
        return ((int) Math.pow(intLv, 3) + 5 * intLv) * 30 - 80;
    }

    private int calculateHpByLv(int intLv) {
        return intLv * 1000;
    }

    public int calculateLvByExp(int intExp) {
        int tempLv = 0;
        while (calculateExpByLv(tempLv) < intExp) {
            tempLv++;
        }
        return tempLv;
    }

    public int fight(int intMonsterHp) {
        int intHeroPower = 0;
        System.out.println("该英雄的生命值为：" + getIntHeroHp() + "\n怪兽生命值为：" + intMonsterHp);
        System.out.println("开始攻击怪兽");
        while ((intMonsterHp -= (intHeroPower = getIntHeroPower())) > 0) {
            if (intMonsterHp > 0) {
                System.out.println("本次攻击成功，Monster受到" + intHeroPower + "点伤害，当前生命值" + intMonsterHp);
            }
        }
        System.out.println("本次攻击成功，Monster受到" + intHeroPower + "点伤害，当前生命值0");
        System.out.println("\nMonster已被击杀，攻击结束");
        int intExp = random.nextInt(300);
        setIntHeroExp(9210);
        setIntHeroExp(getIntHeroExp() + intExp);
        System.out.println("攻打这只小怪兽获得" + intExp + "点经验\n当前英雄EXP：" + getIntHeroExp());

        return 0;
    }

    public Hero() {
    }

//    public Hero(int intHeroLv) {
//        this.intHeroLv = intHeroLv;
//        this.intHeroHp = calculateHpByLv(intHeroLv);
//        this.intHeroExp = calculateExpByLv(intHeroLv);
//    }

    public Hero(int intHeroExp) {
        this.intHeroExp = intHeroExp;
        int temp = intHeroExp;
        this.intHeroLv = calculateLvByExp(temp);
        temp = getIntHeroLv();
        this.intHeroHp = calculateHpByLv(temp);
    }

    public int getIntHeroLv() {
        return intHeroLv;
    }

    public void setIntHeroLv(int intHeroLv) {
        this.intHeroLv = intHeroLv;
    }

    public int getIntHeroHp() {
        intHeroExp = random.nextInt(100) * getIntHeroLv();
        return intHeroHp;
    }

    public void setIntHeroHp(int intHeroHp) {
        this.intHeroHp = intHeroHp;
    }

    public int getIntHeroExp() {
        return intHeroExp;
    }

    public void setIntHeroExp(int intHeroExp) {
        this.intHeroExp = intHeroExp;
    }

    public int getIntHeroPower() {
        return (intHeroPower = random.nextInt(150) * getIntHeroLv());
    }

    public void setIntHeroPower(int intHeroPower) {
        this.intHeroPower = intHeroPower;
    }
}
