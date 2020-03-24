package com.kevin.job20200324;

import com.kevin.job20200324.pojo.Car;
import com.kevin.util.db.JdbcUtils;
import com.kevin.util.number.InputNum;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author Kevin KDA on 2020/3/24 14:21
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200324
 * @classname Control
 * @description
 */
public class Control {
    public void func() {
//        System.out.println(JdbcUtils.getConnection() + "连接成功！");
        int choice = 3;
        do {
            System.out.println("---操作栏---");
            System.out.println("1.通过循环插入信息\n2.通过数据库语句插入\n3.删除第二行和第行列的数据\n0.退出");
            choice = InputNum.getInt("请选择您想使用的方法：");
            int intReturn = -1;
            switch (choice) {
                case 1:
                    intReturn = task1();
                    break;
                case 2:
                    intReturn = task2();
                    break;
                case 3:
                    intReturn = task3();
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;
            }
            System.out.println(intReturn + "条信息插入成功。");
        } while (choice != 0);
    }

    /**
     * 用循环方法插入信息
     *
     * @return int 返回受影响行数
     * @author Kevin KDA on 2020/3/24 14:25
     * @description Control / task1
     */
    private int task1() {
        Car[] cars = {new Car("大众", 230000), new Car("奔驰", 440000),
                new Car("奥迪", 250000)};
        int count = 0;
        Connection connection = JdbcUtils.getConnection();
        for (Car car : cars) {
            try {
                Statement statement = connection.createStatement();
                count = statement.executeUpdate("insert into carInfo(carName, carPrice) values('" + car.getCarName() + "','" + car.getCarPrice() + "')");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return count;
    }

    /**
     * 直接用insert语句插入
     *
     * @return int 返回受影响行数
     * @author Kevin KDA on 2020/3/24 14:25
     * @description Control / task2
     */
    private int task2() {
        int count = 0;
        Connection connection = JdbcUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("insert into carInfo(carName, carPrice) values('大众','230000'),('奔驰',440000),('奥迪',250000)");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 删除信息方法
     *
     * @return int 返回受影响行数
     * @author Kevin KDA on 2020/3/24 14:25
     * @description Control / task3
     */
    private int task3() {
        int count = 0;
        Connection connection = JdbcUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("delete from carInfo where carID = 2");
            count = statement.executeUpdate("delete from carInfo where carID = 3");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public Control() {
        func();
    }
}
