/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200303.entity;

/**
 * @author Kevin KDA on 2020/3/3 13:17
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200303.entity
 * @classname Monster
 * @description TODO
 * @interface/enum
 */
public class Monster {
    /**
     * 怪兽等级
     */
    private int intMonsterLv;
    /**
     * 怪兽血量
     */
    private int intMonsterHp;
    /**
     * 怪兽经验
     */
    private int intMonsterExp;

    private int calculateExpByLv(int intLv) {
        return ((int) Math.pow(intLv, 3) + 5 * intLv) * 30 - 80;
    }

    private int calculateHpByLv(int intLv) {
        return intLv * 1000;
    }

    public Monster() {
    }

    public Monster(int intMonsterLv) {
        this.intMonsterLv = intMonsterLv;
        this.intMonsterHp = calculateHpByLv(intMonsterLv);
        this.intMonsterExp = calculateExpByLv(intMonsterLv);
    }

    public int getIntMonsterLv() {
        return intMonsterLv;
    }

    public void setIntMonsterLv(int intMonsterLv) {
        this.intMonsterLv = intMonsterLv;
    }

    public int getIntMonsterHp() {
        return intMonsterHp;
    }

    public void setIntMonsterHp(int intMonsterHp) {
        this.intMonsterHp = intMonsterHp;
    }

    public int getIntMonsterExp() {
        return intMonsterExp;
    }

    public void setIntMonsterExp(int intMonsterExp) {
        this.intMonsterExp = intMonsterExp;
    }
}
