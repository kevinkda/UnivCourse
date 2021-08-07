package com.kevinkda.univ.course.web.job20200520;

import com.kevinkda.univ.course.web.job20200520.service.ITeacherService;
import com.kevinkda.univ.course.web.job20200520.service.impl.TeacherServiceImpl;

/**
 * @author Kevin KDA on 2020/5/19 21:13
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.job20200520
 * @classname Main0520
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class Main0520 {
    private static ITeacherService service = new TeacherServiceImpl();

    public static void process() {
        service.service();
    }

    public static void main(String[] args) {
        process();
    }
}
