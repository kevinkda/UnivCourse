package com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.service;

import com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.constant.ConstConfig;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/27 17:18
 * @version 1.0.0
 * @project chat-room-202005
 * @package com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.service
 * @classname WordAndTimeUtil
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class WordAndTimeUtil {
    public static List<String> msgList = new ArrayList<String>();

    /**
     * 返回格式化日期
     *
     * @return java.lang.String
     * @author Kevin KDA on 2020/7/6 15:46
     * @description WordAndTimeUtil / getNowTime
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    public static String getNowTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ConstConfig.FORMAT_DATE);
        return simpleDateFormat.format(new Date());
    }

    /**
     * 不文明用语屏蔽
     *
     * @param request 传入{@link HttpServletRequest}对象
     * @return java.lang.String
     * @author Kevin KDA on 2020/7/6 15:48
     * @description WordAndTimeUtil / rightWord
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    public static String rightWord(HttpServletRequest request) {
        String msg = request.getParameter(ConstConfig.FIELD_REQUEST_MESSAGE);
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
