package com.kevinkda.univ.course.enter.framework.b20200629.common;

import com.kevinkda.annotation.func.FuncVerification;
import com.kevinkda.annotation.func.VerifiedType;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/6/29 22:19
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200629.common
 * @classname Utils
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class Utils {
    /**
     * 分页的方法pageIndex,pageSize
     *
     * @param request
     * @param totalCount
     * @param map
     * @return java.util.Map<java.lang.String, java.lang.Object>
     * @throws
     * @author Kevin KDA on 2020/6/29 22:20
     * @description Utils / getPageBean
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/6/29 22:20")
    public static Map<String, Object> getPageBean(HttpServletRequest request, int totalCount, Map<String, Object> map) {
        int pageIndex = Integer.parseInt(map.get("pageIndex").toString());
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
        int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        // 得到起始索引号
        int start = (pageIndex - 1) * pageSize;
        // 总的页数
        map.put("totalPage", totalPage);
        // 总的数量
        map.put("totalCount", totalCount);
        // 起始位置
        map.put("start", start);
        // 重新放一次int类型，否则报错
        map.put("pageSize", pageSize);
        return map;
    }
}
