package com.kevinkda.univ.course.enter.framework.b20200623.domain;

import java.util.Date;

/**
 *
 * @author Kevin KDA on 2020/6/23 20:48
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200623.domain
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class 20200623TbComment {
    private Integer commentId;

    private Integer blogId;

    private String content;

    private Date commentTime;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", blogId=").append(blogId);
        sb.append(", content=").append(content);
        sb.append(", commentTime=").append(commentTime);
        sb.append("]");
        return sb.toString();
    }
}