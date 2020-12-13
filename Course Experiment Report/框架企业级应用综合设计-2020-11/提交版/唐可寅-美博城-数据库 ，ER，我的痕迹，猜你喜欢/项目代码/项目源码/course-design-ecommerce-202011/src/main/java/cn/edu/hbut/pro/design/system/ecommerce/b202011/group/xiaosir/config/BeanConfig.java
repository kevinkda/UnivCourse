package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.config;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.service.IUserService;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kevin KDA on 2020/11/26 23:58
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.config
 * @classname BeanConfig
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Configuration
public class BeanConfig {
//    @Bean
    public IUserService getIUserService() {
        return new UserServiceImpl();
    }
}
