package com.kevin.job20200319.bookmanager.control;

import com.kevin.job20200319.bookmanager.service.DataPersistenceLayer;

import java.util.ArrayList;

/**
 * @author Kevin KDA on 2020/3/19 13:48
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200319.bookmanager.control
 * @classname SysInitOperation
 * @description 提供系统初始化操作类
 * @interface/enum
 */
public class SysInitOperation {
    public SysInitOperation() {
        System.out.println("系统初始化中 … ");
        System.out.println("载入用户列表，结果：" + DataPersistenceLayer.readUserListDataFromDisk());
        System.out.println("载入图书列表，结果：" + DataPersistenceLayer.readBookListDataFromDisk());
    }
}
