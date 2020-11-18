//package com.chinasoft.shop.service.impl;
//
//import com.chinasoft.shop.dao.UserMapper;
//import org.quartz.Job;
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Service
//public class QuartzJobImpl implements Job {
//    @Autowired
//    private UserMapper mapper;
//
//    @Override
//    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        Map<String,Object> map=new HashMap<String,Object>();
//        map.put("userEmail","678336204@qq.com");
//        System.out.println(mapper.queryUserIsExist(map));
//        System.out.println("Sing a Song");
//    }
//}
