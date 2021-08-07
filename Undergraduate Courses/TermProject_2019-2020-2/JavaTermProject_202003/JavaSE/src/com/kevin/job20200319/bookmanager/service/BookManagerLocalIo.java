package com.kevin.job20200319.bookmanager.service;

import com.kevin.job20200319.bookmanager.pojo.Book;

/**
 * @author Kevin KDA on 2020/3/19 13:33
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200319.bookmanager.service
 * @classname BookManagerLocalIo
 * @description 提供图书管理服务类
 * @interface/enum
 */
public class BookManagerLocalIo extends DataPersistenceLayer {
    /**
     * 提供查找书目的方法
     *
     * @param uid: 书目UID
     * @return boolean 返回书目详细属性
     * @author Kevin KDA on 2020/3/19 19:06
     * @description BookManagerLocalIo / searchBookByBookId 提供查找书目的方法
     */
    public static Book searchBookByBookId(int uid) {
        for (Book i :
                bookList) {
            if (uid == i.getIntBookId()) {
                return i;
            }
        }
        return null;
    }

    /**
     * 提供购买书目的方法，并保存数据
     *
     * @param uid: 书目UID
     * @return boolean 返回购买结果
     * @author Kevin KDA on 2020/3/19 19:06
     * @description BookManagerLocalIo / searchBookByBookId 提供购买书目的方法，并保存数据
     */
    public static boolean buyingNovelsByBookId(int uid) {
        for (Book i :
                bookList) {
            if (uid == i.getIntBookId()) {
                i.setBookStatus(1);
                DataPersistenceLayer.saveBookInformation();
                DataPersistenceLayer.saveAccountInformation();
                return true;
            }
        }
        return false;
    }

    private BookManagerLocalIo() {
    }
}
