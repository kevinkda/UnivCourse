package com.kevin.job20200319.bookmanager.service;

import com.kevin.job20200319.bookmanager.pojo.Account;
import com.kevin.job20200319.bookmanager.pojo.Book;
import com.kevin.util.io.StorageFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2020/3/19 12:31
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200319.bookmanager.service
 * @classname DataPersistenceLayer
 * @description 提供数据持久化操作
 * @interface/enum
 */
public class DataPersistenceLayer {
    private static final String PATH_ACCOUNT_LIST = "." + File.separator +
            "JavaSE" + File.separator +
            "src" + File.separator +
            "com" + File.separator +
            "kevin" + File.separator +
            "job20200319" + File.separator +
            "localdb" + File.separator +
            "ACCOUNT_LIST.txt";
    private final static String PATH_BOOK_LIST = "." + File.separator +
            "JavaSE" + File.separator +
            "src" + File.separator +
            "com" + File.separator +
            "kevin" + File.separator +
            "job20200319" + File.separator +
            "localdb" + File.separator +
            "BOOK_LIST.txt";

    /**
     * 用户账户信息数据程序运行时保存区
     */
    static List<Account> accountList = new ArrayList<>();
    /**
     * 图书信息数据程序运行时保存区
     */
    static List<Book> bookList = new ArrayList<>();

    /**
     * Account类文件操作对象
     */
    static final StorageFile<Account> ACCOUNT_STORAGE_FILE = new StorageFile<>();
    /**
     * Book类文件操作对象
     */
    static final StorageFile<Book> BOOK_STORAGE_FILE = new StorageFile<>();

    /**
     * @return boolean 返回读取结果
     * @author Kevin KDA on 2020/3/19 13:59
     * @description DataPersistenceLayer / readUserListDataFromDisk 从磁盘读入用户列表数据
     */
    public static boolean readUserListDataFromDisk() {
        int count;
        try {
            accountList = ACCOUNT_STORAGE_FILE.readList(PATH_ACCOUNT_LIST);
            count = DataPersistenceLayer.getAccountList().size();
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    /**
     * @return boolean 返回读取结果
     * @author Kevin KDA on 2020/3/19 13:59
     * @description DataPersistenceLayer / readUserListDataFromDisk 从磁盘读入图书列表数据
     */
    public static boolean readBookListDataFromDisk() {
        int count;
        try {
            bookList = BOOK_STORAGE_FILE.readList(PATH_BOOK_LIST);
            if (bookList == null) {
                bookList = new ArrayList<>();
            }
//            bookList.add(new Book(
//                    1,
//                    "ABC",
//                    "A",
//                    5.0,
//                    0
//            ));
//            bookList.add(new Book(
//                    2,
//                    "Karry",
//                    "K",
//                    9.21,
//                    0
//            ));
            count = DataPersistenceLayer.getBookList().size();
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    /**
     * @return boolean 返回存储结果
     * @author Kevin KDA on 2020/3/19 16:03
     * @description DataPersistenceLayer / saveAccountInformation 保存账户信息
     */
    public static boolean saveAccountInformation() {
        return ACCOUNT_STORAGE_FILE.storage(PATH_ACCOUNT_LIST, accountList);
    }

    /**
     * @return boolean 返回存储结果
     * @author Kevin KDA on 2020/3/19 16:03
     * @description DataPersistenceLayer / saveAccountInformation 保存图书信息
     */
    public static boolean saveBookInformation() {
        return BOOK_STORAGE_FILE.storage(PATH_BOOK_LIST, bookList);
    }

    DataPersistenceLayer() {
    }

    public static String getPathAccountList() {
        return PATH_ACCOUNT_LIST;
    }

    public static String getPathBookList() {
        return PATH_BOOK_LIST;
    }

    public static List<Account> getAccountList() {
        return accountList;
    }

    public static void setAccountList(List<Account> accountList) {
        DataPersistenceLayer.accountList = accountList;
    }

    public static List<Book> getBookList() {
        return bookList;
    }

    public static void setBookList(List<Book> bookList) {
        DataPersistenceLayer.bookList = bookList;
    }

    public static StorageFile<Account> getAccountStorageFile() {
        return ACCOUNT_STORAGE_FILE;
    }

    public static StorageFile<Book> getBookStorageFile() {
        return BOOK_STORAGE_FILE;
    }
}
