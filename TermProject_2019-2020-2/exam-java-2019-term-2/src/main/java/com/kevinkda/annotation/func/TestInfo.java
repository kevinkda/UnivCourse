/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.kevinkda.annotation.func;

import com.kevinkda.annotation.func.container.TestInfoContainer;

import java.lang.annotation.*;

/**
 * The interface Test info.
 *
 * @author Kevin KDA on 2020/4/26 15:24
 * @version 1.0.0
 * @project TotalPro
 * @package com.kevinkda.annotation.func
 * @classname TestInfo
 * @apiNote
 * @since 3.0.0
 */
//@Target(ElementType.TYPE)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
//@Scope("request")
@Repeatable(TestInfoContainer.class)
@Documented
public @interface TestInfo {
    /**
     * 标注测试版本号
     *
     * @return the string
     * @author Kevin KDA on 2020/4/17 14:59
     * @since 1.0.0
     */
    public String version() default "1.0.0";

    /**
     * 标注测试状态
     *
     * @return the verified type
     * @author Kevin KDA on 2020/4/17 14:59
     * @since 1.0.0
     */
    public VerifiedType status() default VerifiedType.Unverified;

    /**
     * 标注测试时间
     *
     * @return the string
     * @author Kevin KDA on 2020/4/17 14:59
     * @since 1.0.0
     */
    public String date() default "";

    /**
     * 标注测试备注
     *
     * @return the string
     * @author Kevin KDA on 2020/4/26 15:28
     * @since 1.0.0
     */
    public String note() default "";
}
