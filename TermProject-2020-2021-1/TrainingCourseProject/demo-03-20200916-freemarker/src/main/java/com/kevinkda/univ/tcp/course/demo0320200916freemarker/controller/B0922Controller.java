package com.kevinkda.univ.tcp.course.demo0320200916freemarker.controller;

import com.kevinkda.univ.tcp.course.demo0320200916freemarker.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/9/22 14:32
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.controller
 * @classname B0922Controller
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Controller
@RequestMapping({"/b0922"})
public class B0922Controller {
    @Autowired
    private UserService userService;
    private static final Logger LOGGER = LoggerFactory.getLogger(B0922Controller.class);

    @RequestMapping({"/index"})
    public ModelAndView index() {
        Map<String, Object> map = new HashMap<>();
        map.put("list", userService.selectAll());
        LOGGER.info(map.toString());
        return new ModelAndView("b0922-index", map);
    }

    @RequestMapping({"/del"})
    public String del(@RequestParam("ids") String ids) {
//        userService.deleteByPrimaryKey(ids);

        Map<String, Object> map = new HashMap<>();
        map.put("list", userService.selectAll());
        LOGGER.info(map.toString());
        return "redirect:/index";
    }

    @RequestMapping({"/delA"})
    public ModelAndView delA(@RequestParam("ids") String ids) {
        Map<String, Object> map = new HashMap<>();
        map.put("list", userService.selectAll());
        LOGGER.info(map.toString());
        return new ModelAndView("b0922-index", map);
    }

    public List<String> getDelData(String ids) {
        return null;
    }

}
