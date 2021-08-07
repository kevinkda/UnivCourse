package com.kevinkda.web.support;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.nio.charset.StandardCharsets;

/**
 * @author Kevin KDA on 2020/5/27 20:40
 * @version 1.0.0
 * @project chatRoom-202005
 * @package com.kevinkda.web.support
 * @classname EncodingRequest
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class EncodingRequest extends HttpServletRequestWrapper {
    private HttpServletRequest req;

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
