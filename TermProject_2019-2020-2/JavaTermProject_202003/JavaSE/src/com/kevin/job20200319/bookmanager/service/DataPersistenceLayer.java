package com.kevin.job20200319.bookmanager.service;

import com.kevin.job20200319.bookmanager.pojo.Account;
import com.kevin.job20200319.bookmanager.pojo.Book;
import com.kevin.util.io.StorageFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    private static final String PATH_BOOK_LIST = "." + File.separator +
            "JavaSE" + File.separator +
            "src" + File.separator +
            "com" + File.separator +
            "kevin" + File.separator +
            "job20200319" + File.separator +
            "localdb" + File.separator +
            "BOOK_LIST.txt";
    private static final String BOOK_ROOT_PATH = "." + File.separator +
            "JavaSE" + File.separator +
            "src" + File.separator +
            "com" + File.separator +
            "kevin" + File.separator +
            "job20200322" + File.separator +
            "localdb" + File.separator +
            "book" + File.separator;

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
            if (accountList == null) {
                accountList = new ArrayList<>();
            }
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
//                    0,
//                    "sf.txt"
//            ));
//            bookList.add(new Book(
//                    2,
//                    "Karry",
//                    "K",
//                    9.21,
//                    0,
//                    "zt.txt"
//            ));
            count = DataPersistenceLayer.getBookList().size();
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    /**
     * 从磁盘读入图书
     *
     * @param strPath: 需要读入书目ID的路径
     * @return List<String> 返回书目内容，按行
     * @author Kevin KDA on 2020/3/22 20:08
     * @description DataPersistenceLayer / readBookFromDisk 从磁盘读入图书
     */
    public static List<String> readBookFromDisk(String strPath) {
        //将记事本上的文字一行行的加载到集合里面去
        List<String> list = new ArrayList<>();
        BufferedReader bufferedReaderead = null;
        try {
            bufferedReaderead = new BufferedReader(new FileReader(new File(strPath)));
            String str;
            while ((str = bufferedReaderead.readLine()) != null) {
                list.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                Objects.requireNonNull(bufferedReaderead).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
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

    public static String getBookRootPath() {
        return BOOK_ROOT_PATH;
    }
}
