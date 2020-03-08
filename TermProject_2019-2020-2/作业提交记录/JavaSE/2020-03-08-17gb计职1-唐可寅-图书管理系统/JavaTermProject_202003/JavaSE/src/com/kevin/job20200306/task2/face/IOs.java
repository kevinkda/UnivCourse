package com.kevin.job20200306.task2.face;

/**
 * @author Kevin KDA on 2020/3/6 15:50
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200306.task2.face
 * @classname IOs
 * @description
 * @interface/enum
 */
public interface IOs {
    /**
     * 操作系统调用方法
     *
     * @param fileName:文件路径及文件名
     * @return byte[]
     * @author Kevin KDA on 2020/3/7 20:33
     * @description IOs / processor 操作系统调用方法
     */
    byte[] processor(String fileName);

    /**
     * 系统启动方法
     *
     * @param fileName:文件路径及文件名
     * @return void
     * @author Kevin KDA on 2020/3/7 20:33
     * @description IOs / bootloader 系统启动方法
     */
    void bootloader(String fileName);
}
