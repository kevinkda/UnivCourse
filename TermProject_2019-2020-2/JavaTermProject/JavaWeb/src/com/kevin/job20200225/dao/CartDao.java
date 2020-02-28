/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200225.dao;

import com.kevin.job20200225.entity.CartItems;
import com.kevin.job20200225.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Kevin KDA on 2020/2/25 13:57
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200225.dao
 * @classname CartDao
 * @description TODO
 * @interface/enum
 */
public class CartDao {
    public static ArrayList<CartItems> getAllCartItems() {
        String sql = "" + "select carts.intSn,\n" +
                "       carts.strGoodsName,\n" +
                "       goods.strGoodsModel,\n" +
                "       goods.douGoodsPrice,\n" +
                "       carts.intItemQuantity,\n" +
                "       carts.strUserAccount\n" +
                "from university.carts,\n" +
                "     university.goods\n" +
                "where goods.strGoodsName = carts.strGoodsName;";
        return getParameters(sql);
    }

    public static ArrayList<CartItems> getCartItemsByUserAcc(String args) {
        String sql = "" + "select carts.intSn,\n" +
                "       carts.strGoodsName,\n" +
                "       goods.strGoodsModel,\n" +
                "       goods.douGoodsPrice,\n" +
                "       carts.intItemQuantity,\n" +
                "       carts.strUserAccount\n" +
                "from university.carts,\n" +
                "     university.goods\n" +
                "where goods.strGoodsName = carts.strGoodsName and carts.strUserAccount='" + args + "';";
        return getParameters(sql);
    }

    private static ArrayList<CartItems> getParameters(String sql) {
        Connection conn = DBUtil.getConnection();
        ArrayList<CartItems> cartItems = new ArrayList<>();
        CartItems items;
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                items = new CartItems();
                items.setId(rs.getInt("intSn"));
                items.setStrid(String.valueOf(rs.getInt("intSn")));
                items.setStrGoodsName(rs.getString("strGoodsName"));
                items.setStrGoodsModel(rs.getString("strGoodsModel"));
                items.setDouGoodsPrice(rs.getDouble("douGoodsPrice"));
                items.setIntItemQuantity(rs.getInt("intItemQuantity"));
                items.setStrUserAccount(rs.getString("strUserAccount"));
                cartItems.add(items);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cartItems;
    }

    public static void dropCartItems(String param) {
        String sql = "DELETE FROM carts WHERE carts.intSn = ?;";
        Connection conn = DBUtil.getConnection();
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, param);

            psmt.executeUpdate();
            psmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void dropCartItems(String account, String deleteItem) {
        String sql = "DELETE FROM carts WHERE strUserAccount = ? and strGoodsName = ? ";
        Connection conn = DBUtil.getConnection();
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, account);
            psmt.setString(2, deleteItem);

            psmt.executeUpdate();
            psmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
