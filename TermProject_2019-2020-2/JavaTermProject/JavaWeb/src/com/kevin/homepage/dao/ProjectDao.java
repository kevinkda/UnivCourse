/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.homepage.dao;

import com.kevin.homepage.entity.Project;
import com.kevin.homepage.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Kevin KDA on 2020/2/25 16:44
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.homepage.dao
 * @classname ProjectDao
 * @description TODO
 * @interface/enum
 */
public class ProjectDao {
    public static ArrayList<Project> getAllProjects() {
        String sql = "" + "select * from projects;";
        return getParameters(sql);
    }

    private static ArrayList<Project> getParameters(String sql) {
        Connection conn = DBUtil.getConnection();
        ArrayList<Project> projects = new ArrayList<>();
        Project items;
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                items = new Project();
//                items.setStrsn(rs.getString("SN"));
                items.setStrProjName(rs.getString("strProjName"));
                items.setStrSubmissionDate(rs.getString("strSubmissionDate"));
                items.setStrProjectDescription(rs.getString("strProjectDescription"));
                items.setStrAffiliatedCourses(rs.getString("strAffiliatedCourses"));
                items.setStrUrlByProjName(rs.getString("strUrlByProjName"));
                items.setStrUrlByTaskDetails(rs.getString("strUrlByTaskDetails"));
                projects.add(items);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return projects;
    }
}
