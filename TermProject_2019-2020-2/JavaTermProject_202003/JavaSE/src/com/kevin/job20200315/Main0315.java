package com.kevin.job20200315;

import com.kevin.job20200315.pojo.Cat;
import com.kevin.job20200315.pojo.Dolphin;
import com.kevin.job20200315.pojo.Duck;
import com.kevin.job20200315.pojo.IAnimal;

/**
 * @author Kevin KDA on 2020/3/15 15:20
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200315
 * @classname Main0315
 * @description
 * @interface/enum
 */
public class Main0315 {
    public static void main(String[] args) {
        IAnimal cat = new Cat("Kai");
        IAnimal duck = new Duck("Ga");
        IAnimal dolphin = new Dolphin("Do");

        System.out.println(cat.shout());
        System.out.println(cat.getAnimalLegNumber());

        System.out.println(duck.shout());
        System.out.println(duck.getAnimalLegNumber());

        System.out.println(dolphin.shout());
        System.out.println(dolphin.getAnimalLegNumber());
    }
}
