package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Kevin KDA on 2020/11/26 21:30
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
 * 商品信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommodityInformation implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 商品ID
     */
    private Integer commodityId;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 品牌ID
     */
    private Integer brandId;
    /**
     * 商品分类ID
     */
    private Integer classifyId;
    /**
     * 商品价格
     */
    private BigDecimal commodityPrice;
    /**
     * 商品状态
     */
    private Integer commodityStatus;
    /**
     * 商品参数JSON
     */
    private String parameter;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 商品图片路径
     */
    private String commodityPhotoUrl;
}