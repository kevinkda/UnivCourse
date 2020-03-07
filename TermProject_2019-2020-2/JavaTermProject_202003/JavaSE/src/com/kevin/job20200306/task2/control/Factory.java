package com.kevin.job20200306.task2.control;

import com.kevin.job20200306.task2.face.IOs;
import com.kevin.job20200306.task2.face.IPlay;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/3/6 15:34
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200306.task2.control
 * @classname Factory
 * @description
 * @interface/enum
 */
public class Factory implements IPlay, IOs {
    @Override
    public byte[] read(String fileName) {
        File file = new File(fileName);
        FileInputStream input = null;
        try {
            try {
                input = new FileInputStream(file);
                byte[] buf = new byte[input.available()];
                final int read = input.read(buf);
                return buf;
            } catch (Exception e) {
                System.out.println("文件不存在，程序结构设计测试成功");
            }
            System.out.println("文件读取成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public void play(String fileName) {
        System.out.println("程序播放开始处理");
        bootloader(fileName);
        System.out.println("程序播放处理成功");
    }

    @Override
    public byte[] processor(String fileName) {
        System.out.println("系统开始处理");
        return read(fileName);
    }

    @Override
    public void bootloader(String fileName) {
        System.out.println("系统开始成功");
        processor(fileName);
        System.out.println("系统启动成功");
    }
}
