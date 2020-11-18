//package com.chinasoft.shop.controller;
//
//import com.chinasoft.shop.service.IUserService;
//import org.quartz.Job;
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.HashMap;
//import java.util.Map;
//
//
//public class QuartzController implements Job {
//    @Autowired
//    private IUserService userService;
//
//    @Override
//    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        System.out.println("sing a song");
//        Map<String,Object> map = new HashMap<String,Object>();
//        map.put("userEmail","678336204@qq.com");
//        System.out.println(userService.selectUserIsExist(map));
//    }
//}