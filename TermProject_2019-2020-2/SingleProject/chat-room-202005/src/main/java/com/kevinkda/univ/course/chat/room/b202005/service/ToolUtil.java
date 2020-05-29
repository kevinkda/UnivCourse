package com.kevinkda.univ.course.chat.room.b202005.service;

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
    public static List<String> msgList=new ArrayList<String>();

    public static String getNowTime(){
        SimpleDateFormat simp=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simp.format(new Date());
    }
}
