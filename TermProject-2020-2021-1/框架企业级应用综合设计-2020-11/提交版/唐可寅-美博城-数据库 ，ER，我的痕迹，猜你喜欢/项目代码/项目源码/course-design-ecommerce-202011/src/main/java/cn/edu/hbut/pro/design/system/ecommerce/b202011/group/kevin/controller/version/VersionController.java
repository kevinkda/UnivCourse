package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.controller.version;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.config.ConstsConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 项目版本页控制器
 *
 * @author Kevin KDA on 2020/11/4 17:27
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.controller.version
 * @classname VersionController
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Controller
@RequestMapping({"/system"})
public class VersionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(VersionController.class);
    private static final String DATE = new Date().toString();
    @Value("${version.main}")
    private String main;
    @Value("${version.sub}")
    private String sub;
    @Value("${version.pom}")
    private String pom;

    @RequestMapping({"/", "index", "version"})
    public ModelAndView index() {
        Map<String, Object> map = new HashMap<>();
        map.put(ConstsConfig.FIELD_VERSION_MAIN, main);
        map.put(ConstsConfig.FIELD_VERSION_SUB, sub);
        map.put(ConstsConfig.FIELD_VERSION_POM, pom);
        map.put(
                ConstsConfig.FIELD_VERSION_RESTART_DATE,
                DATE
        );
        LOGGER.info(map.toString());
        return new ModelAndView("system/version", map);
//        return new ModelAndView("version", map);
    }

    //    @RequestMapping({"/", "index", "version"})
    public ModelAndView index(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put(ConstsConfig.FIELD_VERSION_MAIN, main);
        map.put(ConstsConfig.FIELD_VERSION_SUB, sub);
        map.put(ConstsConfig.FIELD_VERSION_POM, pom);
        map.put(
                ConstsConfig.FIELD_VERSION_RESTART_DATE,
                request.getServletContext().getAttribute(ConstsConfig.FIELD_VERSION_RESTART_DATE)
        );
        LOGGER.info(map.toString());
        return new ModelAndView("system/version", map);
    }


}