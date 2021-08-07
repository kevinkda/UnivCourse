package com.kevinkda.univ.course.enter.framework.b20200621.domain;

/**
 * @author Kevin KDA on 2020/6/21 16:31
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200621.domain
 * @classname Blog
 * @apiNote <p></p>
 * @since 2020.06.21
 */
public class Blog {
    private int blogId;
    private String blogTitle;
    private int blogCount;


    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogCount=" + blogCount +
                '}';
    }


    public Blog() {
    }

    public Blog(String blogTitle, int blogCount) {
        this.blogTitle = blogTitle;
        this.blogCount = blogCount;
    }

    public Blog(int blogId, String blogTitle, int blogCount) {
        this.blogId = blogId;
        this.blogTitle = blogTitle;
        this.blogCount = blogCount;
    }


    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public int getBlogCount() {
        return blogCount;
    }

    public void setBlogCount(int blogCount) {
        this.blogCount = blogCount;
    }
}
