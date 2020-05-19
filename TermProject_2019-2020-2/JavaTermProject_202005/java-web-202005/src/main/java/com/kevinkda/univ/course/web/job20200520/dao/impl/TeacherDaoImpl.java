package com.kevinkda.univ.course.web.job20200520.dao.impl;

import com.kevinkda.univ.course.web.job20200520.dao.ITeacherDao;
import com.kevinkda.univ.course.web.job20200520.model.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/19 20:30
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.job20200520.dao.impl
 * @classname TeacherDaoImpl
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class TeacherDaoImpl implements ITeacherDao {
    static List<Teacher> list = null;


    @Override
    public int add(int id, String name, int age, String phone) {
        for (Teacher i :
                list) {
            if (id == i.getId()) {
                return -1;
            } else if (name.equals(i.getName())) {
                return -2;
            }
        }
        Teacher temp = new Teacher(id, name, age, phone);
        list.add(temp);
        return 1;
    }

    @Override
    public List<Teacher> showAll() {
        return list;
    }

    @Override
    public Teacher showTeacherByName(String name) {
        for (Teacher temp :
                list) {
            if (name.equals(temp.getName())) {
                return temp;
            }
        }
        return null;
    }


    public TeacherDaoImpl() {
        list = new ArrayList<>();
        Teacher temp;
        for (int i = 0; i < 3; i++) {
            temp = new Teacher(i + 1, "Teacher" + i, i * 10, "3456" + i);
            list.add(temp);
        }
    }
}
