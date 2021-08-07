package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.controller;

import com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.constant.ConstConfig;
import com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.service.TrainInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 访问路径控制器
 *
 * @author Kevin KDA on 2020/7/6 17:55
 * @version 1.0.0
 * @project curriculum-design-spring-boot-202007
 * @package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.controller
 * @classname IndexController
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Controller
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
    /**
     * 服务层实例
     *
     * @since 1.0.0
     */
    @Autowired
    private TrainInfoService trainInfoService;


    /**
     * 项目首页访问路径，查看所有车次信息
     *
     * @param session 传入{@link HttpSession}，将程序处理得到的数据存入Session
     * @return java.lang.String 页面跳转路径
     * @author Kevin KDA on 2020/7/7 21:54
     * @description IndexController / getAll
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @RequestMapping({"/", "/index", "/getAll"})
    public String getAll(HttpSession session) {
//        用户访问地址
        LOGGER.debug("getAll.jsp");
//        获得所有火车车次信息
        List<HashMap> trainList = trainInfoService.selectAllMap();
//        向前台回传数据
        session.setAttribute(ConstConfig.FIELD_FRONT_TRAIN_LIST, trainList);
//        日志：记录数据记录
        LOGGER.info(trainList.toString());
//        跳转车次列表页
        return "getAll";
    }

    /**
     * 查看车次详细信息
     *
     * @param trainNo 传入请求的车次编号
     * @param session 传入{@link HttpSession}，将程序处理得到的数据存入Session
     * @return java.lang.String 页面跳转路径
     * @author Kevin KDA on 2020/7/7 21:56
     * @description IndexController / getTrain
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @RequestMapping({"/getTrain"})
    public String getTrain(@RequestParam(ConstConfig.FIELD_FRONT_TRAIN_NO) String trainNo,
                           HttpSession session) {
//        用户访问地址
        LOGGER.debug("getTrain.jsp");
//        获得请求的火车车次信息
        HashMap trainList = trainInfoService.selectByPrimaryKeyMap(trainNo).get(0);
//        向前台回传数据
        session.setAttribute(ConstConfig.FIELD_FRONT_TRAIN_LIST, trainList);
//        日志：记录数据记录
        LOGGER.info(trainList.toString());
//        跳转车次详细页
        return "getTrain";
    }

    /**
     * 删除车次信息
     *
     * @param request 传入{@link HttpServletRequest}，获得用户传入的请求参数组
     * @return java.lang.String 页面跳转路径
     * @author Kevin KDA on 2020/7/7 22:00
     * @description IndexController / deleteTrainItem
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @RequestMapping({"/deleteTrainItem"})
    public String deleteTrainItem(HttpServletRequest request) {
//        用户访问地址
        LOGGER.debug("deleteTrainItem API");
//        获得需要进行删除的车次编号
        String[] no = request.getParameterValues(ConstConfig.FIELD_FRONT_TRAIN_NO);
//        核验前台传入参数是否为空，为空即结束操作
        if (no != null && no.length != 0) {
            //        日志：记录删除数据
            LOGGER.info("delete trainNo: " + Arrays.toString(no));
//        循环遍历删除数据
            for (String s :
                    no) {
                trainInfoService.deleteByPrimaryKey(s);
            }
        }
//        重定向跳转至车次详细页
        return "redirect:/getAll";
    }

}
