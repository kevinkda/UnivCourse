package com.kevin.job20200223.work2.pojo;

/**
 * @author Kevin KDA on 2020/2/21 21:07
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200223.work1.pojo
 * @classname News
 * @description TODO
 * @interface/enum
 */
public class News {
    /**
     * 标题ID
     */
    private int newsTitleId;
    /**
     * 新闻名称
     */
    private String newsTitleName;
    /**
     * 新闻内容
     */
    private String newsTitleContext;

    public int getNewsTitleId() {
        return newsTitleId;
    }

    public void setNewsTitleId(int newsTitleId) {
        this.newsTitleId = newsTitleId;
    }

    public String getNewsTitleName() {
        return newsTitleName;
    }

    public void setNewsTitleName(String newsTitleName) {
        this.newsTitleName = newsTitleName;
    }

    public String getNewsTitleContext() {
        return newsTitleContext;
    }

    public void setNewsTitleContext(String newsTitleContext) {
        this.newsTitleContext = newsTitleContext;
    }

    public News(int newsTitleId, String newsTitleName, String newsTitleContext) {
        super();
        this.newsTitleId = newsTitleId;
        this.newsTitleName = newsTitleName;
        this.newsTitleContext = newsTitleContext;
    }
}
