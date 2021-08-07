package com.kevinkda.univ.exam.javase.term20192.service;

import com.kevinkda.annotation.func.FuncVerification;
import com.kevinkda.annotation.func.VerifiedType;

/**
 * @author Kevin KDA on 2020/5/22 09:06
 * @version 1.0.0
 * @project exam-java-2019-term-2
 * @package com.kevinkda.univ.exam.javase.term20192.service
 * @classname IManagerService
 * @apiNote <p></p>
 * @since 1.0.0
 */
public interface IManagerService {
    /**
     * 提供程序入口，服务方法
     *
     * @return void
     * @author Kevin KDA on 2020/5/22 09:17
     * @description IManagerService / service
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/22 09:17")
    void service();

}