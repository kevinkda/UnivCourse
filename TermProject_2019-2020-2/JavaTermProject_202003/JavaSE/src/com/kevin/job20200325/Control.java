package com.kevin.job20200325;

import com.kevin.util.db.JdbcUtils;
import com.kevin.util.number.InputNum;

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
        int choice = 3;
        do {
            System.out.println("---操作栏---");
            System.out.println("1.通过循环插入信息\n" +
                    "2.通过数据库语句插入\n" +
                    "3.删除第二行和第行列的数据\n" +
                    "0.退出");
            choice = InputNum.getInt("请选择您想使用的方法：");
            int intReturn = -1;
            switch (choice) {
                case 0:
                    break;
                case 1:
                    intReturn = task1();
                    System.out.println(intReturn + "条数据受影响");
                    break;
                case 2:
                    intReturn = task2();
                    System.out.println(intReturn + "条数据受影响");
                    break;
                case 3:
                    intReturn = task3();
                    System.out.println(intReturn + "条数据受影响");
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;
            }
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
        int count = 0;
        count += JdbcUtils.insertSingle("carInfo(carName,carPrice)", new Object[]{"大众", 200000});
        count += JdbcUtils.insertSingle("carInfo(carName,carPrice)", new Object[]{"奔驰", 300000});
        count += JdbcUtils.insertSingle("carInfo(carName,carPrice)", new Object[]{"奥迪", 400000});
        System.out.println(count + "条数据已添加。");
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
        count = JdbcUtils.updateSingle("carInfo", new String[]{"carName", "carPrice", "carID"}, new Object[]{"丰田", 450000, 2});
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
        count = JdbcUtils.delete("carInfo", "carID", "1,2,3");
        return count;
    }

    public Control() {
        func();
    }
}
