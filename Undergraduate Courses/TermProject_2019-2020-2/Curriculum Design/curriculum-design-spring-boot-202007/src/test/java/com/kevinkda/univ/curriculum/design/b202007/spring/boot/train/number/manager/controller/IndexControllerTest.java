package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.controller;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Kevin KDA on 2020/7/7 18:28
 * @version 1.0.0
 * @project curriculum-design-spring-boot-202007
 * @package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.controller
 * @classname com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.controller.IndexController
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Controller
public class IndexControllerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexControllerTest.class);

    @Test
    public void test() {

    }

//    @GetMapping("/showUpload")
    @RequestMapping("/showUpload")
    public String index() {
        LOGGER.info("html/index");
        return "index";
//        return "redirect:/index.html";
    }

    //    @GetMapping("/")
    @RequestMapping("/")
    public String indexA() {
        LOGGER.info("index");
        return "a";
//        return "redirect:/a.html";
    }

    //无论是@RestController还是@Controller都不影响返回页面
    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public ModelAndView loginPage(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
}