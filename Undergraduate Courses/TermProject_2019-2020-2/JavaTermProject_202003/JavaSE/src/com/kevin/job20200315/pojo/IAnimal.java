package com.kevin.job20200315.pojo;

/**
 * @author Kevin KDA on 2020/3/15 15:22
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200315.pojo
 * @classname IAnimal
 * @description
 * @interface/enum
 */
public interface IAnimal {
    /**
     * 获取动物的叫声
     *
     * @return String
     * @author Kevin KDA on 2020/3/15 15:54
     * @description IAnimal / shout 获取动物的叫声
     */
    String shout();

    /**
     * 获取动物的爬行
     *
     * @return String
     * @author Kevin KDA on 2020/3/15 15:54
     * @description IAnimal / climb 获取动物的爬行
     */
    void climb();

    /**
     * 获取动物腿的数目
     *
     * @return String
     * @author Kevin KDA on 2020/3/15 15:54
     * @description IAnimal / getAnimalLegNum 获取动物腿的数目
     */
    int getAnimalLegNum();

    /**
     * 获取动物腿的数目
     *
     * @return String
     * @author Kevin KDA on 2020/3/15 15:54
     * @description IAnimal / getAnimalLegNum 获取动物腿的数目
     */
    String getAnimalLegNumber();
}
