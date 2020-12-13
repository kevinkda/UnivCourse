package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 用户地址
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain
 * @classname UserAddress
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 地址ID
     */
    private Integer addressId;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 国家ID
     */
    private Integer countryId;
    /**
     * 用户手机号
     */
    private String userAddPhone;
    /**
     * 省
     */
    private Integer province;
    /**
     * 市
     */
    private Integer city;
    /**
     * 区
     */
    private Integer area;
    /**
     * 详细地址
     */
    private String detailedAddress;
    /**
     * 区
     */
    private String postcode;
    /**
     * 标签
     */
    private String label;
    /**
     * 备注
     */
    private String note;
    /**
     * 用户姓氏
     */
    private String realSurname;
    /**
     * 用户名字
     */
    private String realGivenName;
}