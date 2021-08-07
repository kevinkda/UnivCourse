package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.controller.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/11/26 22:06
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.controller.service
 * @classname IndexController
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Slf4j
@Controller
@RequestMapping({"/"})
public class IndexController {
    @RequestMapping({"/"})
    public ModelAndView index() {
        return new ModelAndView("pages/index");
    }

    @RequestMapping({"/{path}"})
    public ModelAndView index(@PathVariable("path") String path) {
        log.info(path);
        return new ModelAndView("pages/" + path);
    }

    @RequestMapping({"/backup"})
    public ModelAndView jumpPath() {
//        return new ModelAndView("pages/" + path);
        Map<String, String> map = new HashMap<>();
        map.put("path", "index");
        return new ModelAndView("service/jumpHtml", map);
    }

    @RequestMapping({"/backup/{path}"})
    public ModelAndView jumpPath(@PathVariable("path") String path) {
        log.info(path);
//        return new ModelAndView("pages/" + path);
        Map<String, String> map = new HashMap<>();
        map.put("path", path);
        return new ModelAndView("service/jumpHtml", map);
    }

}
