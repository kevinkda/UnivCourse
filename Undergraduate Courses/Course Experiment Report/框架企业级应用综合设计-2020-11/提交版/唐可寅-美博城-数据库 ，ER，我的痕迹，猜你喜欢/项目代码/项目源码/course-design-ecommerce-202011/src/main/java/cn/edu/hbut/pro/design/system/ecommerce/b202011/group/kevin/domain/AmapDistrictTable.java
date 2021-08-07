package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 高德行政区化表
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain
 * @classname AmapDistrictTable
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class AmapDistrictTable implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 区域ID
     */
    private Integer districtId;
    /**
     * 城市编码
     */
    private String citycode;
    private Integer adcode;
    /**
     * 行政区名
     */
    private String name;
    /**
     * 边界坐标
     */
    private String center;
    /**
     * 行政区级别
     */
    private String level;
    /**
     * 上级行政区ID
     */
    private Integer parentId;
    private String polyline;
}