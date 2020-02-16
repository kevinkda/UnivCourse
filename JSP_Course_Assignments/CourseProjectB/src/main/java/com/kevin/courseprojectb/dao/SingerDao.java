package com.kevin.courseprojectb.dao;

import com.kevin.courseprojectb.dbm.DBManage;
import com.kevin.courseprojectb.entity.Singer;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2019/12/5 23:07
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package com.kevin.courseprojectb.dao
 * @classname SingerDao
 * @description TODO
 * @interface/enum
 */
public class SingerDao {
    public static List<Singer> selectAll() {
        String sql = "select singerID,singerName from singer";
        return select(sql);
    }

    private static List<Singer> select(String sql) {
        List<Singer> list = new ArrayList<Singer>();
        try {
            ResultSet rs = DBManage.getResultSet(sql);
            while (rs.next()) {
                Singer singer = new Singer(rs.getInt("singerID"), rs.getString("singerName"));
                list.add(singer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

    public static List<Singer> selectByArea(String area){
        String sql = "select singerID,singerName from singer ";
        if(!area.equals("-1")){
            sql += " where area='"+area+"'";
        }
        return select(sql);
    }

    public static List<String> selectAllArea(){
        List<String> list = new ArrayList<String>();
        String sql = "select area from singer group by area";
        try {
            ResultSet rs = DBManage.getResultSet(sql);
            while (rs.next()) {
                list.add(rs.getString("area"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
}
