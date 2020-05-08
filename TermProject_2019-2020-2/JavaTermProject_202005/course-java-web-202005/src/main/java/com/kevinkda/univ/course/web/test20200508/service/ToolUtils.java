package com.kevinkda.univ.course.web.test20200508.service;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @author Kevin KDA on 2020/5/8 09:10
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.test20200508.service
 * @classname
 * @apiNote <p></p>
 * @since 2020.05.08
 */
public class ToolUtils {
    public static String getNewString(String str) {
        String strUtf8 = null;
        strUtf8 = new String(str.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        return strUtf8;
    }

    public static String[] getNewStrings(String[] str, HttpServletRequest request) {
        String[] strUtf8 = new String[str.length];
        for (int i = 0; i < strUtf8.length; i++) {
            strUtf8[i] = request.getParameter(str[i]);
        }
        for (int i = 0; i < strUtf8.length; i++) {
            strUtf8[i] = new String(strUtf8[i].getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        }
        return strUtf8;
    }
}
