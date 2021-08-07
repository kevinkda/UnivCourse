package com.kevin.job20200221.entity.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Kevin KDA on 2020/2/20 21:16
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200221.entity.util
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
