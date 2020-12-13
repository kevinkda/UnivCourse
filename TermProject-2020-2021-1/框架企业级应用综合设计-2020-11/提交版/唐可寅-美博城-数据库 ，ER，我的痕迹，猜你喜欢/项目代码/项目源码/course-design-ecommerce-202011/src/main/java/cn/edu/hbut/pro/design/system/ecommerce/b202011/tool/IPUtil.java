package cn.edu.hbut.pro.design.system.ecommerce.b202011.tool;

import javax.servlet.http.HttpServletRequest;

/**
 * @author XiaoSir on 2020/11/22 20:16
 * @version 1.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.tool
 * @classname IPUtil
 * @description TODO
 * @interface/enum
 */

//获得用户的请求的IP是多少
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
