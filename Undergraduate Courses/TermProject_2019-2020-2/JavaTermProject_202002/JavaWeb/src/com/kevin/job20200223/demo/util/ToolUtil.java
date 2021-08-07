/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200223.demo.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Kevin KDA on 2020/2/20 21:16
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200223.demo.util
 * @classname ToolUtil
 * @description TODO
 * @interface/enum
 */
public class ToolUtil {
    public static String[] getParameter(HttpServletRequest request, String[] args) {
        String[] s = new String[args.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = request.getParameter(args[i]);
        }
        return s;
    }

    public static String[] getParameters(HttpServletRequest request, String[] args) {
        String[] s = request.getParameterValues(String.valueOf(args));
        return s;
    }
}
