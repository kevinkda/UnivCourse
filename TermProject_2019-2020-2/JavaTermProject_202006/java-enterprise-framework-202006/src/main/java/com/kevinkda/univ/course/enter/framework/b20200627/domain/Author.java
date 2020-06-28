package com.kevinkda.univ.course.enter.framework.b20200627.domain;

/**
 * @author Kevin KDA on 2020/6/27 16:53
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200627.domain
 * @classname Author
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class Author {
    private Integer authorId;

    private String authorName;

    private Integer authorAge;


    public Author() {
    }

    public Author(String authorName, Integer authorAge) {
        this.authorName = authorName;
        this.authorAge = authorAge;
    }

    public Author(Integer authorId, String authorName, Integer authorAge) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorAge = authorAge;
    }


    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getAuthorAge() {
        return authorAge;
    }

    public void setAuthorAge(Integer authorAge) {
        this.authorAge = authorAge;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", authorAge=" + authorAge +
                '}';
    }
}
