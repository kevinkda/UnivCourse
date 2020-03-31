package com.kevin.job20200329;

import com.kevin.util.db.JdbcUtils;
import com.kevin.util.db.PageBean;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Kevin KDA on 2020/3/29 20:56
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200329
 * @classname Control
 * @description
 * @interface/enum
 */
public class Control {
    private void func1() {
        PageBean pageBean = new PageBean();
        pageBean.next();
        ResultSet resultSet = JdbcUtils.getResultSetPaging(
                "select carID,carName,carPrice from carInfo",
                pageBean
        );
        try {
            String column1;
            String column2;
            String column3;
            while (resultSet.next()) {
                column1 = resultSet.getString(1);
                column2 = resultSet.getString(2);
                column3 = resultSet.getString(3);
                System.out.println(column1 + "\t\t" + column2 + "\t\t" + column3);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Control() {
        func1();
    }
}
