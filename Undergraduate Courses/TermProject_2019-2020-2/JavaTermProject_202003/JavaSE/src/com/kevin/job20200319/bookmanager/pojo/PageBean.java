package com.kevin.job20200319.bookmanager.pojo;

import com.kevin.util.number.InputNum;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2020/3/22 20:25
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200319.bookmanager.pojo
 * @classname PageBean
 * @description
 * @interface/enum
 */
public class PageBean {
    /**
     * 当前页
     */
    private int pageIndex;
    /**
     * 每页显示数据的最大条数
     */
    private int pageSize;
    /**
     * 总的数量
     */
    private int totalCount;
    /**
     * 总的页数
     */
    private int totalPage;
    private List<String> list = new ArrayList<String>();
    /**
     * 默认没有购买
     */
    private boolean buyStatus = false;

    public PageBean() {
    }

    public PageBean(int pageSize, int totalCount, List<String> list, boolean buyStatus) {
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        setTotalPage();
        this.list = list;
        this.buyStatus = buyStatus;
    }

    public PageBean(int pageSize, int totalCount, int totalPage, List<String> list, boolean buyStatus) {
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = totalPage;
        this.list = list;
        this.buyStatus = buyStatus;
    }

    public PageBean(int pageIndex, int pageSize, int totalCount, int totalPage, List<String> list, boolean buyStatus) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = totalPage;
        this.list = list;
        this.buyStatus = buyStatus;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public int setPageIndex(int pageIndex, Account account) throws InterruptedException {
        int choice = 1;
        //如果为true那么证明是买过这本书的
        if (this.buyStatus) {
            this.pageIndex = Math.max(pageIndex, 1);
        } else {
            if (pageIndex >= 1 && pageIndex <= 3) {
                this.pageIndex = pageIndex;
            } else {
                System.out.println("不好意思，您尚未购买本书，所以只能观看前三页。");
                this.pageIndex = 1;
                do {
                    System.out.println("按1退出：");
                    choice = InputNum.getInt("");
                    if (choice == 1) {

                    } else {
                        System.out.println("您的输入有误，请重新输入！");
                    }
                } while (choice != 1);
            }
        }
        return this.pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    /**
     * 设置页数
     *
     * @return void
     * @author Kevin KDA on 2020/3/22 20:57
     * @description PageBean / setTotalPage 设置页数
     */
    public void setTotalPage() {
        this.totalPage = this.totalCount % this.pageSize == 0 ? this.totalCount / this.pageSize : this.totalCount / this.pageSize + 1;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public boolean isbuy() {
        return buyStatus;
    }

    public void setBuyStatus(boolean buyStatus) {
        this.buyStatus = buyStatus;
    }

    /**
     * 开始位置
     *
     * @return int
     * @author Kevin KDA on 2020/3/22 20:57
     * @description PageBean / startRow 开始位置
     */
    public int startRow() {
        return (this.pageIndex - 1) * this.pageSize;
    }

    /**
     * 结束位置
     *
     * @return int
     * @author Kevin KDA on 2020/3/22 20:57
     * @description PageBean / endRow 结束位置
     */
    public int endRow() {
        return this.pageIndex * this.pageSize;
    }
}
