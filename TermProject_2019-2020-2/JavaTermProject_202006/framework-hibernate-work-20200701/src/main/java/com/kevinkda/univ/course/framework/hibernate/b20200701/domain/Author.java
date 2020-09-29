package com.kevinkda.univ.course.framework.hibernate.b20200701.domain;

/**
 * @author Kevin KDA on 2020/7/1 22:45
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.framework.hibernate.b20200701.domain
 * @classname Author
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class Author {
    private Integer author_ID;
    private String author_Name;
    private Integer author_Age;

    public Author() {
        super();
    }

    public Author(String author_Name, Integer author_Age) {
        this.author_Name = author_Name;
        this.author_Age = author_Age;
    }

    public Author(Integer author_ID, String author_Name, Integer author_Age) {
        this.author_ID = author_ID;
        this.author_Name = author_Name;
        this.author_Age = author_Age;
    }

    public Integer getAuthor_ID() {
        return author_ID;
    }

    public void setAuthor_ID(Integer author_ID) {
        this.author_ID = author_ID;
    }

    public String getAuthor_Name() {
        return author_Name;
    }

    public void setAuthor_Name(String author_Name) {
        this.author_Name = author_Name;
    }

    public Integer getAuthor_Age() {
        return author_Age;
    }

    public void setAuthor_Age(Integer author_Age) {
        this.author_Age = author_Age;
    }


    @Override
    public String toString() {
        return "Author{" +
                "author_ID=" + author_ID +
                ", author_Name='" + author_Name + '\'' +
                ", author_Age=" + author_Age +
                '}';
    }
}
