/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200225;

import com.kevin.job20200225.dao.CartDao;
import com.kevin.job20200225.entity.CartItems;

import java.util.ArrayList;

/**
 * @author Kevin KDA on 2020/2/25 13:31
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200225
 * @classname Main
 * @description TODO
 * @interface/enum
 */
public class Job0225Main {
    public static void main(String[] args) {
        CartItems items = new CartItems();
        items.setId(10);
        ArrayList<CartItems> cartItems = CartDao.getCartItemsByUserAcc("user");
        System.out.println(cartItems.get(3-1).getStrid());
        CartDao.dropCartItems("20");
        System.out.println("0");
        return;
    }

    private static void test(String[] args) {

    }
}
