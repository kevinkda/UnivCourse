package com.kevinkda.demo.proj.onlineretailers.springboot.b202010.controller.version;

import com.kevinkda.demo.proj.onlineretailers.springboot.b202010.config.consts.ConstsConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/10/6 17:19
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.onlineretailers.springboot.b202010.controller.version
 * @classname VersionController
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Controller
@RequestMapping({"/version"})
public class VersionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(VersionController.class);
    @Value("${version.name}")
    private String name;
    @Value("${version.main}")
    private String main;
    @Value("${version.sub}")
    private String sub;
    @Value("${version.pom}")
    private String pom;
    private static final String DATE = new Date().toString();


    @RequestMapping({"/"})
    public ModelAndView version() {
        Map<String, Object> version = new HashMap<>(5);
        version.put(ConstsConfig.FIELD_VERSION_PROJECT_NAME, name);
        version.put(ConstsConfig.FIELD_VERSION_MAIN, main);
        version.put(ConstsConfig.FIELD_VERSION_SUB, sub);
        version.put(ConstsConfig.FIELD_VERSION_POM, pom);
        version.put(ConstsConfig.FIELD_VERSION_RESTART_DATE, DATE);
        LOGGER.info(version.toString());
        return new ModelAndView("version", version);
    }
}
