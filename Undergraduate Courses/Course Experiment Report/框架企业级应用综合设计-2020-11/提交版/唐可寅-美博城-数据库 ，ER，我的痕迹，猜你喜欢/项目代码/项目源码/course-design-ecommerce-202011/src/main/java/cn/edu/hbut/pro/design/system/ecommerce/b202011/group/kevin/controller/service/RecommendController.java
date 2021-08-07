package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.controller.service;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.service.table.CommodityInformationService;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品推荐
 *
 * @author Kevin KDA on 2020/11/21 15:39
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.controller.service
 * @classname RecommendController
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Slf4j
@RestController
@RequestMapping({"/recommend"})
public class RecommendController {
    //    @Autowired
//    private UserBrowsingRecordsService userBrowsingRecordsService;
    @Autowired
    private CommodityInformationService commodityInformationService;

//    @RequestMapping({"/"})
//    public String index() {
//        return "";
//    }

    @RequestMapping({"/list", "/getList"})
    public String getRecommendList() {
        String s = JSONObject.toJSONString(commodityInformationService.selectRecommendList());
        log.info(s);
        return s;
    }

    @RequestMapping({"/list/{userId}", "/getList/{userId}"})
    public String getRecommendList(@PathVariable("userId") Integer userId) {
        String s = JSONObject.toJSONString(commodityInformationService.selectRecommendListByUserId(userId));
        log.info(s);
        return s;
    }
}
