package com.kevinkda.univ.course.mysql.job.b20200612.service;

import com.kevinkda.univ.course.mysql.job.b20200612.constant.ConfigConsts;
import com.kevinkda.univ.course.mysql.job.b20200612.service.mapper.ProMapper;
import com.kevinkda.util.db.JdbcImpl;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


/**
 * @author Kevin KDA on 2020/6/11 18:55
 * @version 1.0.0
 * @project mysql-course-202006
 * @package com.kevinkda.univ.course.mysql.job.b20200612.service
 * @classname Control
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class Control {
    public void select() {
        JdbcImpl jdbc = new JdbcService();
        ResultSet set = jdbc.runCallableStatement(ConfigConsts.PRO_NAME_20200612_SELECT, new Object[]{0});

        int count = 1;

        try {
            while (set.next()) {
                System.out.println(count + ":" + set.getString(1) + ":" + set.getString(2));
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                jdbc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void insert() {
        JdbcImpl jdbc = new JdbcService();

//        jdbc.runCallableStatement(ConfigConsts.PRO_NAME_20200612_INSERT,new Object[]{"asdfgh"});


//
//        try {
//            CallableStatement callableStatement = jdbc.getConnection().prepareCall(ConfigConsts.PRO_NAME_20200612_INSERT);
//            callableStatement.setString(1, "abag");
//            boolean flag = callableStatement.execute();
//            System.out.println(flag);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                jdbc.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

        boolean flag = runCallableStatement(ConfigConsts.PRO_NAME_20200612_INSERT, new Object[]{"asdfghjkl"});
//        int flag = insertTbUser("asdfghjkl");
        System.out.println("flag = " + flag);

//        SqlSession session = JdbcService.getUsSession();
//       int flag= session.insert(ConfigConsts.MB_MAPPER_INSERT_USER,"sjglk");
//        System.out.println("flag = " + flag);
    }

    public static int insertTbUser(String userName) {
        int count = 0;
        Connection con = null;
        CallableStatement stmt = null;
        JdbcImpl jdbc = new JdbcService();
        try {
            con = jdbc.getConnection();
            stmt = con.prepareCall("{CALL 20200612_insert_user_copy1(?)}");
            stmt.setString(1, userName);
            count = stmt.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
        }//得到Connection对象
        finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }
        return count;
    }

    public boolean runCallableStatement(String proc, Object[] args) {
        JdbcImpl jdbc = new JdbcService();

        try {
            CallableStatement callableStatement = jdbc.getConnection().prepareCall(proc);

            for (int i = 0; i < args.length; ++i) {
                callableStatement.setObject(i + 1, args[i]);
            }

            int flag = callableStatement.executeUpdate();
            return false;
        } catch (SQLException var4) {
            var4.printStackTrace();
            return false;
        }
    }

    public void update() {
        boolean flag = runCallableStatement(ConfigConsts.PRO_NAME_20200612_MODIFY, new Object[]{61, "asdfghjkl"});
        System.out.println("flag = " + flag);
    }

    public void delete() {
        boolean flag = runCallableStatement(ConfigConsts.PRO_NAME_20200612_DELECT, new Object[]{72});
        System.out.println("flag = " + flag);

    }

    public Control() {
        select();
        insert();
        update();
        delete();
    }
}
