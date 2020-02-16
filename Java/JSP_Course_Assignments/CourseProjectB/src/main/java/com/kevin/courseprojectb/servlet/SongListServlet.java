package com.kevin.courseprojectb.servlet;

import com.kevin.courseprojectb.dao.SingerDao;
import com.kevin.courseprojectb.dao.SongDao;
import com.kevin.courseprojectb.entity.Singer;
import com.kevin.courseprojectb.entity.Song;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Kevin KDA on 2019/12/5 23:11
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package ${PACKAGE_NAME}
 * @classname ${NAME}
 * @description TODO
 * @interface/enum
 */
@WebServlet(name = "SongListServlet", urlPatterns = "/SongListServlet")
public class SongListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Song song = new Song();
        if (request.getParameter("singerID") != null) {
            song.setSingerID(Integer.parseInt(request.getParameter("singerID")));
        }
        if (request.getParameter("title") != null) {
            song.setTitle(request.getParameter("title").trim());
        }

        //1. 加载歌手列表，将歌手列表保存到Session
        List<Singer> singerList = SingerDao.selectAll();
        request.getSession().setAttribute("singerList", singerList);
        //2. 加载歌曲列表，歌曲列表保存request
        List<Song> songList = SongDao.selectBySong(song);
        request.setAttribute("songList", songList);
        //3. 跳转页面
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
}