package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户商品收藏夹
 * <p>
 * 此表数据不允许删除，用户手工删除字段使用
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain
 * @classname FavoriteCommodity
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class FavoriteCommodity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 收藏夹ID
     */
    private Integer collectionId;
    /**
     * 商品ID
     */
    private Integer commodityId;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 收藏状态
     */
    private Integer collectionStatus;
    /**
     * 商品参数JSON
     */
    private String parameter;
    /**
     * 更新时间
     */
    private Date updateTime;
}