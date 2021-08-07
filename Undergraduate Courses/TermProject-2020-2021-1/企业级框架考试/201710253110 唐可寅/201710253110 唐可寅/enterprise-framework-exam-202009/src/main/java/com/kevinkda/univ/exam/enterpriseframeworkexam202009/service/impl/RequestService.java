package com.kevinkda.univ.exam.enterpriseframeworkexam202009.service.impl;

import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;


/**
 * @author Kevin KDA on 2020/9/23 15:06
 * @version 1.0.0
 * @project enterprise-framework-exam-202009
 * @package com.kevinkda.univ.exam.enterpriseframeworkexam202009.service.impl
 * @classname RequestService
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class RequestService {
    public List<Map<String, Object>> getParametersForText(HttpServletRequest request) {
        return new ArrayList(Arrays.asList(this.getRequestHead(request), this.getRequestBody(request)));
    }

    public Map<String, Object> getRequestHead(HttpServletRequest request) {
        Enumeration<String> requestHeaderNames = request.getHeaderNames();
        HashMap requestHead = new HashMap();

        while (requestHeaderNames.hasMoreElements()) {
            String tempKey = (String) requestHeaderNames.nextElement();
            requestHead.put(tempKey, request.getHeader(tempKey));
        }

        return requestHead;
    }

    public Map<String, Object> getRequestBody(HttpServletRequest request) {
        Enumeration<String> requestHeaderNames = request.getParameterNames();
        HashMap requestBody = new HashMap();

        while (requestHeaderNames.hasMoreElements()) {
            String paramName = (String) requestHeaderNames.nextElement();
            String[] paramValues = request.getParameterValues(paramName);
            if (paramValues.length == 1) {
                String paramValue = paramValues[0];
                if (null != paramValue && !"".equals(paramValue)) {
                    requestBody.put(paramName, paramValue);
                }
            } else if (paramValues.length > 1) {
                requestBody.put(paramName, paramValues);
            }
        }

        return requestBody;
    }

    public void printParameters(Map<String, Object> map) {
        Set<Map.Entry<String, Object>> set = map.entrySet();
        Iterator var3 = set.iterator();

        while (var3.hasNext()) {
            Map.Entry entry = (Map.Entry) var3.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    public String[] showParameters(Map<String, Object> map) {
        List<String> list = new ArrayList();
        Set<Map.Entry<String, Object>> set = map.entrySet();
        Iterator var4 = set.iterator();

        while (var4.hasNext()) {
            Map.Entry entry = (Map.Entry) var4.next();
            list.add(entry.getKey() + ":" + entry.getValue());
        }

        return (String[]) ((String[]) list.toArray());
    }

    /**
     * @deprecated
     */
    @Deprecated
    public String getPostBody(HttpServletRequest request) {
        String bodyInfo = "";

        try {
            InputStream i = request.getInputStream();
            bodyInfo = IOUtils.toString(i, StandardCharsets.UTF_8);
        } catch (IOException var4) {
            var4.printStackTrace();
        }

        return bodyInfo;
    }

    public List<Map<String, Object>> getParametersForJson(HttpServletRequest request) {
        return null;
    }

    public RequestService() {
    }
}
