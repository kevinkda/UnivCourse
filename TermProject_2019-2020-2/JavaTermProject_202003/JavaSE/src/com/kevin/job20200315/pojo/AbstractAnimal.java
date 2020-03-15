package com.kevin.job20200315.pojo;

/**
 * @author Kevin KDA on 2020/3/15 15:25
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200315.pojo
 * @classname AbstractAnimal
 * @description
 * @interface/enum
 */
public abstract class AbstractAnimal implements IAnimal {
    private String name;
    private int legNum;

    protected AbstractAnimal(String name, int legNum) {
        this.name = name;
        this.legNum = legNum;
    }

    @Override
    public String shout() {
        return "此处有动物叫，但不知道是什么动物";
    }

    @Override
    public void climb() {
        System.out.println("此处有动物脚印，但不知道是什么动物");
    }

    @Override
    public int getAnimalLegNum() {
        return legNum;
    }

    @Override
    public String getAnimalLegNumber() {
        return "它有" + ((legNum > 0) ? (legNum + "条腿") : "没有腿哦");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegNum() {
        return legNum;
    }

    public void setLegNum(int legNum) {
        this.legNum = legNum;
    }
}
