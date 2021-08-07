package com.kevinkda.univ.course.web.test20200508.service;

import com.kevinkda.annotation.func.FuncVerification;
import com.kevinkda.annotation.func.VerifiedType;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;

/**
 * 字符串处理方法
 *
 * @author Kevin KDA on 2020/5/5 20:53
 * @version 1.0.0
 * @project java-utils
 * @package com.kevinkda.util.str
 * @classname StringProcess
 * @apiNote <p></p>
 * @since 3.1.1
 */
public class StringProcess {
    /**
     * 首字母小写的字符串
     *
     * @param str 传入原始字符串
     * @return java.lang.String 返回首字母小写的字符串
     * @author Kevin KDA on 2020/5/5 20:59
     * @description StringProcess / initialLowercase
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 3.1.1
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/5 20:59")
    public static String initialLowercase(String str) {
//        str.replaceFirst()
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    /**
     * 首字母大写的字符串
     *
     * @param str 传入原始字符串
     * @return java.lang.String 返回首字母大写的字符串
     * @author Kevin KDA on 2020/5/5 21:00
     * @description StringProcess / initialUppercase
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 3.1.1
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/5 21:00")
    public static String initialUppercase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /**
     * 用于Web请求将ISO_8859_1转换为UTF-8
     *
     * @param oldStr 传入非UTF-8字符集字符串
     * @return java.lang.String 返回UTF-8字符编码字符串
     * @author Kevin KDA on 2020/5/8 09:46
     * @description StringProcess / getUtfStringFromHtml
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/8 09:46")
    public static String getUtfStringFromHtml(String oldStr) {
        String strUtf8 = null;
        strUtf8 = new String(oldStr.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        return strUtf8;
    }

    /**
     * 用于Web请求将ISO_8859_1转换为UTF-8
     *
     * @param oldStr 传入非UTF-8字符集字符串
     * @param req    传入原有{@link HttpServletRequest}
     * @return java.lang.String[] 返回UTF-8字符编码字符串
     * @author Kevin KDA on 2020/5/8 09:44
     * @description StringProcess / getUtfStringsFromHtml
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 3.1.1
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/8 09:44")
    public static String[] getUtfStringsFromHtml(String[] oldStr, HttpServletRequest req) {
//        初始化返回数组长度
        String[] strUtf8 = new String[oldStr.length];
//        循环遍历获得request重的值
        for (int i = 0; i < strUtf8.length; i++) {
            strUtf8[i] = req.getParameter(oldStr[i]);
        }
//        循环遍历获得UTF-8编码值
        for (int i = 0; i < strUtf8.length; i++) {
            strUtf8[i] = new String(strUtf8[i].getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        }
        return strUtf8;
    }


    private StringProcess() {
    }
}
