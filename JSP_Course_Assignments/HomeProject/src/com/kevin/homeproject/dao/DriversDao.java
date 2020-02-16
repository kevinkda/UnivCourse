/*
 * Copyright (c) Kevin KDA 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.homeproject.dao;

import com.kevin.homeproject.dbm.DBManage;
import com.kevin.homeproject.entity.Drivers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2019/12/5 23:47
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package com.kevin.homeproject.dao
 * @classname DriversDao
 * @description TODO
 * @interface/enum
 */
public class DriversDao {
    public static List<Drivers> selectAll() {
        List<Drivers> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM drivers";
            ResultSet resultSet = DBManage.getResultSet(sql);
            while (resultSet.next()) {
                Drivers drivers;
                drivers = new Drivers(
                        resultSet.getInt("DriversId"),
                        resultSet.getString("DriversName"),
                        resultSet.getDouble("UnitPrice")
                );
                list.add(drivers);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
