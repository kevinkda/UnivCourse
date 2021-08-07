package com.kevinkda.demo.proj.onlineretailers.springboot.b202010.util;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * 获得用户的请求的IP
 *
 * @author Kevin KDA on 2020/10/8 16:45
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.onlineretailers.springboot.b202010.util
 * @classname IPUtil
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Service
public class IPUtil {
    public static String getIP(HttpServletRequest request) {
        String ip = request.getRemoteAddr();
        // System.out.println("ip:"+ip);
        String headerIP = request.getHeader("x-real-ip");
        if (headerIP == null || "".equals(headerIP) || "null".equals(headerIP)) {
            headerIP = request.getHeader("x-forwarded-for");
        }
        //  System.out.println("headerIP:"+headerIP);
        if (headerIP != null && !"".equals(headerIP) && !"null".equals(headerIP)) {
            ip = headerIP;
        }
        return ip;
    }
}
