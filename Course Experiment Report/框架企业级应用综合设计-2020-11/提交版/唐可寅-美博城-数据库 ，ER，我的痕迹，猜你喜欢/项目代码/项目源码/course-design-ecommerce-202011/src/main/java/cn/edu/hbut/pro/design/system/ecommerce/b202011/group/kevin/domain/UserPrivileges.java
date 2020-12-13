package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户权限表
 *
 * @author Kevin KDA on 2020/11/21 12:40
 * @version 1.0.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.kevin.domain
 * @classname UserPrivileges
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UserPrivileges implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 普通用户
     */
    private Integer consumer;
    /**
     * 开发
     */
    private Integer dev;
    /**
     * 管理
     */
    private Integer manager;
    /**
     * 测试
     */
    private Integer test;
    /**
     * 更新时间
     */
    private Date updateTime;
}