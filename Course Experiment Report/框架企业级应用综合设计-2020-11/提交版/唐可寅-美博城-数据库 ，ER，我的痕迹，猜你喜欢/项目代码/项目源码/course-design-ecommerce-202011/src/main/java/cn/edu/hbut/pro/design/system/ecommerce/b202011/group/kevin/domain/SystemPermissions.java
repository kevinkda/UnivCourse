package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统权限
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain
 * @classname SystemPermissions
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SystemPermissions implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 权限ID
     */
    private Integer privilegeId;
    /**
     * 权限类型
     */
    private String permissionTypes;
    /**
     * 权限状态
     */
    private Integer stateAuthority;
    /**
     * 参数
     */
    private String parameter;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 备注
     */
    private String note;
}