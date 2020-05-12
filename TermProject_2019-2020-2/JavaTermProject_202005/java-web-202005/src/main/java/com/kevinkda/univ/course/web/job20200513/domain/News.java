package com.kevinkda.univ.course.web.job20200513.domain;

/**
 * @author Kevin KDA on 2020/5/12 15:32
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.job20200513.domain
 * @classname News
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class News {
    private int newsId;
    private String newsTitle;

    public News() {
    }

    public News(int newsId, String newsTitle) {
        this.newsId = newsId;
        this.newsTitle = newsTitle;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }
}
