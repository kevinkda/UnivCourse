package com.kevinkda.demo.proj.onlineretailers.springboot.b202010.util;

import org.junit.jupiter.api.Test;

/**
 * @author Kevin KDA on 2020/10/8 16:47
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.onlineretailers.springboot.b202010.util
 * @classname com.kevinkda.demo.proj.onlineretailers.springboot.b202010.util.MD5Tool
 * @apiNote <p></p>
 * @since 1.0.0
 */
class MD5ToolTest {

    @Test
    void string2MD5() {
    }

    @Test
    void convertMD5() {
    }

    @Test
    void test() {
        String s = new String("199809016014");
        System.out.println("原始：" + s);
        System.out.println("MD5后：" + MD5Tool.string2MD5(s));
        System.out.println("加密的：" + MD5Tool.convertMD5(s));
        System.out.println("解密的：" + MD5Tool.convertMD5(MD5Tool.convertMD5(s)));
    }
}