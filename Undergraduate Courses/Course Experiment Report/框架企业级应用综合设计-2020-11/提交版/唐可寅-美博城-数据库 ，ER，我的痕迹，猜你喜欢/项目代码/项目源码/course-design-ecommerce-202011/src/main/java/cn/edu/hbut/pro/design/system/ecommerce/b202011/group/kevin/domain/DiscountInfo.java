package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 优惠信息
 * <p>
 * discountType 优惠类型
 * 0 优惠券
 * 1 红包
 *
 * @author Kevin KDA on 2020/11/21 21:24
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain
 * @classname DiscountInfo
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class DiscountInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 优惠产品ID
     */
    private Integer discountId;
    /**
     * 优惠类型
     */
    private Integer discountType;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date stopTime;
    /**
     * 可使用的优惠数量
     */
    private Integer discountNum;
    /**
     * 优惠金额
     */
    private BigDecimal discountAmount;
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