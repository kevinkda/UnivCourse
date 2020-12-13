package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 折扣发放列表
 *
 * @author Kevin KDA on 2020/11/21 21:24
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain
 * @classname DiscountDistributionList
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class DiscountDistributionList implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 折扣发放ID
     */
    private Integer distributionId;
    /**
     * 优惠产品ID
     */
    private Integer discountId;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 优惠状态
     */
    private Integer status;
    /**
     * 商品参数JSON
     */
    private String parameter;
    /**
     * 更新时间
     */
    private Date updateTime;
}