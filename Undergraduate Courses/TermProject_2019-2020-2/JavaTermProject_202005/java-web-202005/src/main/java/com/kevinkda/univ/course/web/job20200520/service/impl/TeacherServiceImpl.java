package com.kevinkda.univ.course.web.job20200520.service.impl;

import com.kevinkda.univ.course.web.job20200520.dao.ITeacherDao;
import com.kevinkda.univ.course.web.job20200520.dao.impl.TeacherDaoImpl;
import com.kevinkda.univ.course.web.job20200520.model.Teacher;
import com.kevinkda.univ.course.web.job20200520.service.ITeacherService;

import java.util.List;
import java.util.Scanner;

/**
 * @author Kevin KDA on 2020/5/19 20:35
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.job20200520.service.impl
 * @classname TeacherServiceImpl
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class TeacherServiceImpl implements ITeacherService {

    Scanner scaScan = new Scanner(System.in);
    ITeacherDao dao = new TeacherDaoImpl();

    @Override
    public void service() {
        do {
            switch (selectFun()) {
                case 1:
                    addTeacher();
                    break;
                case 2:
                    showTeacher();
                    break;
                case 3:
                    showAll();
                    break;
                case 0:
                    System.exit(-1);
                default:
                    System.out.println("输入错误");
                    break;
            }
        } while (true);
    }

    private void showAll() {
        System.out.println("\nShow All Teacher");
        List<Teacher> list = dao.showAll();
        for (Teacher i :
                list) {
            System.out.println(i.toString());
        }
    }

    private void showTeacher() {
        System.out.println("\nShow Teacher By Name");
        System.out.print("Input Teacher Name: ");
        String name = scaScan.next();
        Teacher backTeacher = dao.showTeacherByName(name);
        if (backTeacher == null) {
            System.out.println("NOT Teacher: " + name);
        } else {
            System.out.println(backTeacher.toString());
        }
    }

    private void addTeacher() {
        System.out.println("\nAdd Teacher");
        System.out.print("Input Teacher ID: ");
        int id = scaScan.nextInt();
        System.out.print("Input Teacher Name: ");
        String name = scaScan.next();
        System.out.print("Input Teacher Age: ");
        int age = scaScan.nextInt();
        System.out.print("Input Teacher Phone Num.: ");
        String phone = scaScan.next();
        int backCode = dao.add(id, name, age, phone);
        if (backCode == 1) {
            System.out.println("Add Success");
        } else if (backCode == -1) {
            System.out.println("Add Fall: Teacher ID is Exist");
        } else if (backCode == -2) {
            System.out.println("Add Fall: Teacher Name is Exist");
        }
    }

    private int selectFun() {
        System.out.println("1. Add Teacher");
        System.out.println("2. Search Teacher By Name");
        System.out.println("3. Show All Teacher");
        System.out.println("0. Exit");
        System.out.print("Please Input Choose: ");
        return scaScan.nextInt();
    }

    public TeacherServiceImpl() {
    }
}
