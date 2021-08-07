package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Kevin KDA on 2020/11/26 22:09
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain
 * @classname ${CLASS_NAME}
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */

/**
 * 用户浏览记录
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBrowsingRecords implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 记录ID
     */
    private Integer recordId;
    /**
     * 商品ID
     */
    private Integer commodityId;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 访问地区ID
     */
    private Integer districtId;
    /**
     * 商品参数JSON
     */
    private String parameter;
    /**
     * 更新时间
     */
    private Date updateTime;
}