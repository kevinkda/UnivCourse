package com.kevinkda.univ.course.chat.room.b202005.service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/27 17:18
 * @version 1.0.0
 * @project chat-room-202005
 * @package com.kevinkda.univ.course.chat.room.b202005.service
 * @classname ToolUtil
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class ToolUtil {
    public static List<String> msgList = new ArrayList<String>();

    public static String getNowTime() {
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simp.format(new Date());
    }

    public static String rightWord(HttpServletRequest request) {
        String msg = request.getParameter("msg");
//        String msg = "去你大爷的，有屁快放";
        List<String> list = new ArrayList<String>();
        list.add("你大爷");
        list.add("屁");
        String str1 = "";
        for (String s : list) {
            if (msg.contains(s)) {
                int count = s.length();
                StringBuilder star = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    star.append("*");
                }
                msg = msg.replace(s, star.toString());
            }
        }
        return msg;
    }
}
