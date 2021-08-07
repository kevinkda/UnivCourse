package com.kevin.job20200331;

import com.kevin.util.db.PageBean;
import com.kevin.util.number.InputNum;

import java.util.Scanner;

/**
 * @author Kevin KDA on 2020/3/31 20:26
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200331
 * @classname Control
 */
public class Control {
    public static PageBean pageBean = new PageBean();
    Scanner input = new Scanner(System.in);
    String[] menu = {"新增数据", "修改数据", "删除数据", "查看数据(带分页)", "退出"};

    public void select() {
        //用户选择操作
        int choice = -1;
        //用户输入sql语句
        String sql = null;
        String tableName = " tableTest ";
        DatabaseDao databaseDao = new DatabaseDao();
        System.out.println("本次作业操纵表为" + tableName + "(Num1,Num2)");
        do {
            System.out.println("---菜单栏---");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ":" + menu[i]);
            }
            choice = InputNum.getInt("请输入您的数字：");
            switch (choice) {
                case 1:
                    sql = input.next();
                    System.out.print("请输入对" + tableName + "表的“新增数据”sql语句:");
                    databaseDao.add(sql);
                    break;
                case 2:
                    sql = input.next();
                    System.out.print("请输入对" + tableName + "表的“修改数据”sql语句:");
                    databaseDao.modify(sql);
                    break;
                case 3:
                    sql = input.next();
                    System.out.print("请输入对" + tableName + "表的“删除数据”sql语句:");
                    databaseDao.delete(sql);
                    break;
                case 4:
                    databaseDao.showData();
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入。\n");
                    break;
            }
        } while (choice != 5);
    }

    public Control() {
        select();
    }
}
