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
public class Dolphin extends AbstractAnimal {
    public Dolphin(String name) {
        super(name, 0);
    }

    @Override
    public String shout() {
        return (getName() + "是一只海豚:～～～（听海豚在叫）");
    }

    @Override
    public void climb() {

    }
}
