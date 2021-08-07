package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.controller;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author XiaoSir on 2020/11/26 20:21
 * @version 1.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.controller
 * @classname BaseController
 * @description TODO
 * @interface/enum
 */
public class BaseController {
    //封装的目的是为了能够拿到前端的所有数据
    public Map<String,Object> getParamData(HttpServletRequest request){
        Map<String,String[]> map=request.getParameterMap();
        Map<String,Object> mapAll=new HashMap<String,Object>();//最后组装成的map
        Set<String> set=map.keySet();
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            String key=it.next();//String 类型的key
            String[] value= map.get(key);
            // System.out.println(value[0]);
            Object value1=value[0];
            mapAll.put(key,value1);
        }
        return mapAll;
    }
}
