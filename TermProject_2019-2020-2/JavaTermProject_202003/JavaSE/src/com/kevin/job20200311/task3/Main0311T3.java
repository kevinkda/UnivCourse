package com.kevin.job20200311.task3;

import com.kevin.job20200311.task3.exception.DataValueException;
import com.kevin.job20200311.task3.pojo.Employee;

/**
 * @author Kevin KDA on 2020/3/11 15:55
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200311.task3
 * @classname Main0311T3
 * @description
 * @interface/enum
 */
public class Main0311T3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        try {
            e.setSal(2100);
            e.setName("王五");
            e.setSex("猫");
        } catch (DataValueException e2) {
            System.out.println(e2.getMessage());
        }
    }
}
