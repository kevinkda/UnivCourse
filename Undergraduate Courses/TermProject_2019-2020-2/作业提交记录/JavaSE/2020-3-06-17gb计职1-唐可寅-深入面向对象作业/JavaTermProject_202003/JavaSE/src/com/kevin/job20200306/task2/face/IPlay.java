package com.kevin.job20200306.task2.face;

/**
 * @author Kevin KDA on 2020/3/6 15:31
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200306.task2.face
 * @classname IPlay
 * @description TODO
 * @interface/enum
 */
public interface IPlay {
    /**
     * 提供播放器读取文件的方法
     * @param fileName
     * @return
     */
    public byte[] read(String fileName);

    /**
     * 提供播放器播放文件的方法
     * @param fileName
     */
    public void play(String fileName);
}
