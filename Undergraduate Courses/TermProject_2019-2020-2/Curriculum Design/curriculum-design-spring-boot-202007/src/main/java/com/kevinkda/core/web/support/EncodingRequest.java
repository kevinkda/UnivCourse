package com.kevinkda.core.web.support;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.nio.charset.StandardCharsets;

/**
 * 修改 {@link HttpServletRequest} 对象字符编码
 *
 * @author Kevin KDA on 2020/5/3 11:55
 * @version 1.0.0
 * @project TotalPro
 * @package com.kevinkda.core.util.web.support
 * @classname EncodingRequest
 * @apiNote <p></p>
 * @since 3.0.6
 */
public class EncodingRequest extends HttpServletRequestWrapper {
    /**
     * 修改字符编码的 Request
     */
    private HttpServletRequest req;

    /**
     * 返回UTF-8编码结果
     *
     * @param name 传入需要获取的值的Key
     * @return java.lang.String 返回UTF-8编码结果
     * @author Kevin KDA on 2020/5/3 12:02
     * @description EncodingRequest / getParameter
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 3.0.6
     */
    @Override
    public String getParameter(String name) {
        String value = this.req.getParameter(name);

        try {
            value = new String(value.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        } catch (Exception var4) {
            System.out.println(var4.getMessage());
        }

        return value;
    }

    public EncodingRequest(HttpServletRequest request) {
        super(request);
        this.req = request;
    }
}
