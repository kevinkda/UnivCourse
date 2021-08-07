package com.kevin.job20200315.pojo;

/**
 * @author Kevin KDA on 2020/3/15 15:23
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200315.pojo
 * @classname Cat
 * @description
 * @interface/enum
 */
public class Cat extends AbstractAnimal {
    public Cat(String name) {
        super(name, 4);
    }

    @Override
    public String shout() {
        return (getName() + "是一只猫:喵喵喵");
    }

    @Override
    public void climb() {

    }
}
