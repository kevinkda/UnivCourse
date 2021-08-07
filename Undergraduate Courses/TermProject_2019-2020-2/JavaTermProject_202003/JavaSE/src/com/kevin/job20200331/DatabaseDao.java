package com.kevin.job20200331;


import com.kevin.job20200319.bookmanager.service.DataPersistenceLayer;
import com.kevin.util.db.JdbcUtils;
import com.kevin.util.db.PageBean;
import com.kevin.util.number.InputNum;

import java.sql.ResultSet;

/**
 * @author Kevin KDA on 2020/3/30 21:57
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200331
 * @classname DatabaseDao
 */
public class DatabaseDao {
    static PageBean pageBean = new PageBean();

    /**
     * 增加数据
     *
     * @param sql: 传入SQL
     * @return void
     * @author Kevin KDA on 2020/3/31 20:52
     * @description DatabaseDao / add
     */
    public void add(String sql) {
        JdbcUtils.singleSql(sql);
    }

    /**
     * 删除数据
     *
     * @param sql: 传入SQL
     * @return void
     * @author Kevin KDA on 2020/3/31 20:52
     * @description DatabaseDao / delete
     */
    public void delete(String sql) {
        JdbcUtils.singleSql(sql);
    }

    /**
     * 修改数据
     *
     * @param sql: 传入SQL
     * @return void
     * @author Kevin KDA on 2020/3/31 20:52
     * @description DatabaseDao / modify
     */
    public void modify(String sql) {
        JdbcUtils.singleSql(sql);
    }

    /**
     * 查看分页数据
     *
     * @return void
     * @author Kevin KDA on 2020/3/31 20:52
     * @description DatabaseDao / addData
     */
    public void showData() {
        //当前页，用户选择
        int choice = -1;
        pageBean.setIntTotalRecord(100);
        pageBean.setIntTotalPage();
        ResultSet resultSet = JdbcUtils.getResultSetPaging("select Num1,Num2 from testTable", pageBean);
        System.out.println("当前表一共有" + pageBean.getIntTotalPage() + "页，" + pageBean.getIntTotalRecord() +
                "条数据\n当前是第" + pageBean.getIntPageCode() + "页。");
        pageBean.setIntPageCode(pageBean.getIntPageCode());
        try {
            String column1;
            String column2;
            System.out.println("第一列\t第二列");
            while (resultSet.next()) {
                column1 = resultSet.getString(1);
                column2 = resultSet.getString(2);
                System.out.println(column1 + "\t\t" + column2);
            }
            do {
                System.out.println("1：上一页 2:下一页 3:首页 4：尾页 5：退出");
                choice = InputNum.getInt("请输入您的选择：");
                switch (choice) {
                    case 1:
                        pageBean.last();
                        break;
                    case 2:
                        pageBean.next();
                        break;
                    case 3:
                        pageBean.setIntPageCode(1);
                        break;
                    case 4:
                        pageBean.setIntPageCode(pageBean.getIntTotalPage());
                        break;
                    case 5:
                        exit();
                        break;
                    default:
                        System.out.println("您的输入有误，请重新输入！");
                        break;
                }
                showData();
            } while (choice != -1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return void
     * @author Kevin KDA on 2020/2/17 17:37
     * @description View / exit 提供退出系统方法
     */
    private void exit() {
        System.out.println("系统正在保存数据，请稍等");
        DataPersistenceLayer.saveAccountInformation();
        DataPersistenceLayer.saveBookInformation();
        System.out.println("系统退出");
        System.exit(-1);
    }
}
