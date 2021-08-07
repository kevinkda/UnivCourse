package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户购物车
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain
 * @classname ShoppingCart
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ShoppingCart implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 购物车项目ID
     */
    private Integer itemId;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 商品ID
     */
    private Integer commodityId;
    /**
     * 项目购物车加入数
     */
    private Integer itemNum;
    /**
     * 商品参数JSON
     */
    private String parameter;
    /**
     * 用户勾选状态
     */
    private String checkStatus;
    /**
     * 更新时间
     */
    private Date updateTime;
}