/*
 * Copyright (c) Kevin KDA 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.homeproject.dao;

import com.kevin.homeproject.dbm.DBManage;
import com.kevin.homeproject.entity.ShoppingCart;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2019/12/5 23:48
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package com.kevin.homeproject.dao
 * @classname ShoppingCartDao
 * @description TODO
 * @interface/enum
 */
public class ShoppingCartDao {
    public static List<ShoppingCart> selectAll() {
        List<ShoppingCart> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ShoppingCart";
            ResultSet resultSet = DBManage.getResultSet(sql);
            while (resultSet.next()) {
                ShoppingCart shoppingCart;
//                shoppingCart = new ShoppingCart(
//                        resultSet.getString("tradeName"),
//                        resultSet.getInt("checked"),
//                        resultSet.getDouble("price"),
//                        resultSet.getInt("amount")
//                );
                shoppingCart = new ShoppingCart(
                        resultSet.getString("tradeName"),
                        resultSet.getInt("checked"),
                        resultSet.getString("model"),
                        resultSet.getDouble("price"),
                        resultSet.getInt("amount"),
//                        resultSet.getString("photo"),
                        null,
                        resultSet.getString("GUID"),
                        resultSet.getString("commodityUrl"),
                        resultSet.getString("photoUrl")
                );
                list.add(shoppingCart);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
