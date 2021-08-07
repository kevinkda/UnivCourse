package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单信息
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain
 * @classname OrderInfo
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class OrderInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 订单ID
     */
    private Integer orderId;
    /**
     * 父订单（交易信息）ID
     */
    private Integer transactionId;
    /**
     * 商品ID
     */
    private Integer commodityId;
    /**
     * 成交金额
     */
    private BigDecimal transactionAmount;
    /**
     * 成交数量
     */
    private BigDecimal transactionNum;
    /**
     * 商品参数JSON
     */
    private String parameter;
}