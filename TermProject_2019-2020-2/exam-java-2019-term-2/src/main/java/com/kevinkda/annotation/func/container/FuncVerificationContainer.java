/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.kevinkda.annotation.func.container;

import com.kevinkda.annotation.func.FuncVerification;

import java.lang.annotation.*;

/**
 * The interface Func verification container.
 *
 * @author Kevin KDA on 2020/4/26 14:42
 * @version 1.0.0
 * @project TotalPro
 * @package com.kevinkda.annotation.func.container
 * @classname FuncVerificationContainer
 * @apiNote
 * @since 1.0.0
 */
//@Target(ElementType.TYPE)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
//@Scope("request")
public @interface FuncVerificationContainer {
    /**
     * Value func verification [ ].
     *
     * @return the func verification [ ]
     */
    FuncVerification[] value();
}
