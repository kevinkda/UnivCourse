/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.homepage.dao;

import com.kevin.homepage.entity.TaskDetails;
import com.kevin.homepage.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Kevin KDA on 2020/2/25 17:03
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.homepage.dao
 * @classname TaskDetailsDao
 * @description TODO
 * @interface/enum
 */
public class TaskDetailsDao {
    public static ArrayList<TaskDetails> getAllProjects() {
        String sql = "" + "select * from taskDetails;";
        return getParameters(sql);
    }

    public static ArrayList<TaskDetails> getProjectByTaskName(String args) {
        String sql = "" + "select *\n" +
                "from taskDetails\n" +
                "where strTaskName = '" + args + "';";
        return getParameters(sql);
    }

    private static ArrayList<TaskDetails> getParameters(String sql) {
        Connection conn = DBUtil.getConnection();
        ArrayList<TaskDetails> taskDetails = new ArrayList<>();
        TaskDetails items;
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                items = new TaskDetails();
                items.setStrTaskName(rs.getString("strTaskName"));
                items.setStrTaskSubmitName(rs.getString("strTaskSubmitName"));
                items.setStrLayoutTime(rs.getString("strLayoutTime"));
                items.setStrSubmissionDate(rs.getString("strSubmissionDate"));
                items.setStrTaskDescription(rs.getString("strTaskDescription"));
                taskDetails.add(items);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return taskDetails;
    }
}
