package com.kevin.job20200306.task2.face;

/**
 * @author Kevin KDA on 2020/3/6 15:31
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200306.task2.face
 * @classname IPlay
 * @description
 * @interface/enum
 */
public interface IPlay {
    /**
     * 提供播放器读取文件的方法
     *
     * @param fileName: 文件路径及文件名
     * @return byte[]
     * @author Kevin KDA on 2020/3/6 20:23
     * @description IPlay / read 提供播放器读取文件的方法
     */
    public byte[] read(String fileName);

    /**
     * 提供播放器播放文件的方法
     *
     * @param fileName: 文件路径及文件名
     * @return void
     * @author Kevin KDA on 2020/3/6 20:24
     * @description IPlay / play 提供播放器播放文件的方法
     */
    public void play(String fileName);
}
