package com.kevinkda.univ.exam.javase.term20192;

import com.kevinkda.univ.exam.javase.term20192.service.IManagerService;
import com.kevinkda.univ.exam.javase.term20192.service.impl.ManagerServiceImpl;

/**
 * 程序入口类
 * 本次考试内容：DVD租赁系统
 *
 * @author Kevin KDA on 2020/5/22 08:56
 * @version 1.0.0
 * @project exam-java-2019-term-2
 * @package com.kevinkda.univ.exam.javase.term20192
 * @classname Main
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {
//        实例化服务层
        IManagerService service = new ManagerServiceImpl();
//        开启服务
        service.service();
    }
}
