package com.kevinkda.univ.tcp.course.demo0320200916freemarker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.io.File;

/**
 * @author Kevin KDA on 2020/9/30 14:45
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.config
 * @classname WebMvcConfig
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/images/**")//这个将应用到url中
//                .addResourceLocations("file:/usr/local/uploadImage/");//这里填的是图片的绝对父路径
//        super.addResourceHandlers(registry);
//        registry.addResourceHandler("/img/**")//这个将应用到url中
//                .addResourceLocations("d:\\img");//这里填的是图片的绝对父路径
        // registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        //registry.addResourceHandler("/img/**").addResourceLocations("file:/usr/local/uploadImage/");

        registry.addResourceHandler(File.separator + "img" + File.separator + "**")
                .addResourceLocations("file:" + File.separator + "d:" + File.separator + "img" + File.separator);
        //System.out.println("url"+ResourceUtils.CLASSPATH_URL_PREFIX);

        registry.addResourceHandler(File.separator + "static" + File.separator + "**")
                .addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + File.separator + "static" + File.separator);
        super.addResourceHandlers(registry);
    }
}
