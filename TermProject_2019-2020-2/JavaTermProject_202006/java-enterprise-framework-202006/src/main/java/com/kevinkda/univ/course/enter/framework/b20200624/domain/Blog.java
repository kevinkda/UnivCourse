package com.kevinkda.univ.course.enter.framework.b20200624.domain;

/**
 * @author Kevin KDA on 2020/6/21 16:31
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200623.domain
 * @classname Blog
 * @apiNote <p></p>
 * @since 2020.06.21
 */
public class Blog {
    private Integer blogId;
    private String blogTitle;
    private Integer blogCount;
    private Integer authorId;


    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogCount=" + blogCount +
                ", authorId=" + authorId +
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

    public Blog(Integer blogId, String blogTitle, Integer blogCount, Integer authorId) {
        this.blogId = blogId;
        this.blogTitle = blogTitle;
        this.blogCount = blogCount;
        this.authorId = authorId;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public Integer getBlogCount() {
        return blogCount;
    }

    public void setBlogCount(Integer blogCount) {
        this.blogCount = blogCount;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}
