package com.kevinkda.univ.course.web.job20200520.dao;

import com.kevinkda.annotation.func.FuncVerification;
import com.kevinkda.annotation.func.VerifiedType;
import com.kevinkda.univ.course.web.job20200520.model.Teacher;

import java.util.List;

/**
 * @author Kevin KDA on 2020/5/19 20:29
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.job20200520.dao.impl
 * @classname
 * @apiNote <p></p>
 * @since 1.0.0
 */
public interface ITeacherDao {
    /**
     * 添加Teacher
     *
     * @param id    传入Teacher ID
     * @param name  传入Teacher 姓名
     * @param age   传入Teacher 年龄
     * @param phone 传入Teacher 电话
     * @return int 返回状态值
     * @author Kevin KDA on 2020/5/19 22:00
     * @description ITeacherDao / add
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/19 22:00")
    int add(int id, String name, int age, String phone);

    /**
     * 显示List中所有内容
     *
     * @return {@code java.util.List<com.kevinkda.univ.course.web.job20200520.model.Teacher>} 返回所有Teacher信息
     * @author Kevin KDA on 2020/5/19 21:59
     * @description ITeacherDao / showAll
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/19 21:59")
    List<Teacher> showAll();

    /**
     * 根据传入的Teacher 姓名，显示Teacher所有信息
     *
     * @param name 传入Teacher 姓名
     * @return com.kevinkda.univ.course.web.job20200520.model.Teacher 返回Teacher信息
     * @author Kevin KDA on 2020/5/19 22:03
     * @description ITeacherDao / showTeacherByName
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    @FuncVerification(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/5/19 22:03")
    Teacher showTeacherByName(String name);
}
