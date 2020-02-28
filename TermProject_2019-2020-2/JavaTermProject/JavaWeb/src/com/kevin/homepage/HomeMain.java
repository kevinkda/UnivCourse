/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.homepage;

import com.kevin.homepage.dao.ProjectDao;
import com.kevin.homepage.dao.TaskDetailsDao;
import com.kevin.homepage.entity.Project;
import com.kevin.homepage.entity.TaskDetails;

import java.util.ArrayList;

/**
 * @author Kevin KDA on 2020/2/25 13:31
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200225
 * @classname Main
 * @description TODO
 * @interface/enum
 */
public class HomeMain {
    public static void main(String[] args) {
        Project items = new Project();
        ArrayList<Project> cartItems = ProjectDao.getAllProjects();
        ArrayList<TaskDetails> taskDetails = TaskDetailsDao.getAllProjects();
        ArrayList<TaskDetails> details=TaskDetailsDao.getProjectByTaskName("job20200225");
        System.out.println("0");
        return;
    }

    private static void test(String[] args) {

    }
}
