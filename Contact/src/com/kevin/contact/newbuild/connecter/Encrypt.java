/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild.connecter;

/**
 * @author Kevin KDA on 2019/10/24 12:53
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.contact.newbuild.connecter
 * @classname Encrypt
 * @description TODO
 * @interface/enum
 */
public interface Encrypt {
    /**
     * @param [string]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:53
     * @description Encrypt / encryption TODO 加密
     * @returns java.lang.String
     */
    public String encryption(String string);

    /**
     * @param [string]
     * @throws
     * @author Kevin KDA on 2019/10/24 19:59
     * @description Encrypt / decryption TODO 解密
     * @returns java.lang.String
     */
    public String decryption(String string);
}
