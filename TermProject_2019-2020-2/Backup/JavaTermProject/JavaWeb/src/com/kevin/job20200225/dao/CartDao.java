/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200225.dao;

import com.kevin.job20200225.entity.CartItems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Kevin KDA on 2020/2/24 20:21
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200225.dao
 * @classname CartDao
 * @description TODO
 * @interface/enum
 */
public class CartDao {
    public static void addCartItem() {

    }

    public static void dropCartItems(String param) {
        String sql = "DELETE FROM carts WHERE carts.intUid = ?";
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

    public static ArrayList<CartItems> getAllCartItems() {
        String sql = "" + "select * from allUserCart";
        return getParameters(sql);
    }

    public static ArrayList<CartItems> getCartItemsByUserAcc(String args) {
        String sql = "" + "select * from allUserCart where strUserAccount='" + args + "';";
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
                items.setId(rs.getString("intSn"));
                items.setStrGoodsName(rs.getString("strGoodsName"));
                items.setStrGoodsModel(rs.getString("strGoodsModel"));
                items.setDouGoodsPrice(rs.getDouble("douGoodsPrice"));
                items.setStrUserAccount(rs.getString("strUserAccount"));
                items.setIntItemQuantity(rs.getInt("intItemQuantity"));
                cartItems.add(items);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cartItems;
    }
}
