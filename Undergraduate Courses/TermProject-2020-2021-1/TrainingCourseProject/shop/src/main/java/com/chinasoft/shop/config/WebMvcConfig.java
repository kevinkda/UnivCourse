package com.chinasoft.shop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.nio.charset.StandardCharsets;
import java.util.List;


@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //   registry.addResourceHandler("/images/**")//这个将应用到url中
        //             .addResourceLocations("file:/usr/local/uploadImage/");//这里填的是图片的绝对父路径
//        super.addResourceHandlers(registry);
        //registry.addResourceHandler("/img/**")//这个将应用到url中
        //       .addResourceLocations("d:\\img");//这里填的是图片的绝对父路径
        // registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        //registry.addResourceHandler("/img/**").addResourceLocations("file:/usr/local/uploadImage/");
        registry.addResourceHandler("/img/**").addResourceLocations("file:/d:/img/");
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        //System.out.println("url"+ResourceUtils.CLASSPATH_URL_PREFIX);
        // registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
        super.addResourceHandlers(registry);




    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        // 解决controller返回字符串中文乱码问题
        for (HttpMessageConverter<?> converter : converters) {
            if (converter instanceof StringHttpMessageConverter) {
                ((StringHttpMessageConverter)converter).setDefaultCharset(StandardCharsets.UTF_8);
            }
        }
    }


}
