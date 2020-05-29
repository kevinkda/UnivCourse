/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.kevinkda.annotation.func;

/**
 * The enum Verified type.
 *
 * @author Kevin KDA on 2020/4/26 14:20
 * @version 1.0.0
 * @project TotalPro
 * @package com.kevinkda.annotation.func
 * @classname VerifiedType
 * @apiNote
 * @since 3.0.0
 */
public enum VerifiedType {
    /**
     * 尚未验证
     */
    Unverified,
    /**
     * 验证通过
     */
    Pass,
    /**
     * 验证存在错误，尚未修复
     */
    Error
}
