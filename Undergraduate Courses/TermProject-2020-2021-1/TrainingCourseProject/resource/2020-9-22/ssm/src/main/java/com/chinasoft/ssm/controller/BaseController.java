package com.chinasoft.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

public class BaseController {
    //2,3
    public List<String> getDelData(String ids){
        List<String> list=new ArrayList<String>();
        StringBuffer buff=new StringBuffer(ids);
        buff.delete(ids.length()-1,ids.length());
        //System.out.println(buff.toString());
        String temp[]=ids.split(",");
        for (int i=0;i<temp.length;i++){
            list.add(temp[i]);
        }
        return list;
    }

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

//    public static void main(String[] args) {
//        System.out.println(new BaseController().getDelData("2,3,").toString());
//    }
}
