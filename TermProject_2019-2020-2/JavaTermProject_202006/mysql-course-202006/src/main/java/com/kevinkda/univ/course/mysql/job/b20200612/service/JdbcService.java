/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevinkda.univ.course.mysql.job.b20200612.service;

import com.kevinkda.annotation.func.FuncVerification;
import com.kevinkda.annotation.func.VerifiedType;
import com.kevinkda.univ.course.mysql.job.b20200612.constant.ConfigConsts;
import com.kevinkda.util.db.JdbcImpl;
import com.kevinkda.util.db.mybatis.MyBatisImpl;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * 获得数据库服务对象
 *
 * @author Kevin KDA on 2020/5/12 10:42
 * @version 1.0.0
 * @project java-utils
 * @package com.kevinkda.web.userservice202005.service
 * @classname JdbcService
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class JdbcService extends JdbcImpl {
    /**
     * 获得MyBatis服务对象
     *
     * @return org.apache.ibatis.session.SqlSession 返回{@link SqlSession}的实例化对象
     * @throws IOException {@link SqlSession}创建异常
     * @author Kevin KDA on 2020/5/23 01:27
     * @description JdbcService / getUsSession
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/23 01:27")
    public static SqlSession getUsSession() throws IOException {
        return MyBatisImpl.getSession(ConfigConsts.MB_CONFIG_WEB_SERVICE);
    }


//    Constructor、Getter、Setter

    public JdbcService() {
        super(ConfigConsts.DB_UNIVERSITY);
    }
}
