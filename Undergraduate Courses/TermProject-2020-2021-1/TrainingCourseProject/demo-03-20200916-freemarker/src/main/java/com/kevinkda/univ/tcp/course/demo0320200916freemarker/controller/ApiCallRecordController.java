package com.kevinkda.univ.tcp.course.demo0320200916freemarker.controller;

import com.kevinkda.univ.tcp.course.demo0320200916freemarker.service.ApiCallRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/9/16 17:14
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.controller
 * @classname ApiCallRecordController
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Controller
@RequestMapping({"/api"})
public class ApiCallRecordController {
    @Autowired
    private ApiCallRecordService apiCallRecordService;

    @RequestMapping({"list"})
    public ModelAndView list() {
        Map<String, Object> map = new HashMap<>();
        map.put("list", apiCallRecordService.selectAll());
        return new ModelAndView("apiList", map);
    }

}
