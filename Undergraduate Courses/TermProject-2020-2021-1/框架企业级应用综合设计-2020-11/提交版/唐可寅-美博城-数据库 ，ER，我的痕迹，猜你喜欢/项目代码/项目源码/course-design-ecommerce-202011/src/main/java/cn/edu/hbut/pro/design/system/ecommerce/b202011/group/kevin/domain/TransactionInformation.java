package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 交易信息
 * <p>
 * transactionStatus交易状态
 * 0 正常
 * 1 关闭
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain
 * @classname TransactionInformation
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class TransactionInformation implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 交易ID
     */
    private Integer transactionId;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 用户地址ID
     */
    private Integer addressId;
    /**
     * 交易状态
     */
    private Integer transactionStatus;
    /**
     * 交易备注
     */
    private String note;
    /**
     * 商品参数JSON
     */
    private String parameter;
    /**
     * 更新时间
     */
    private Date updateTime;
}