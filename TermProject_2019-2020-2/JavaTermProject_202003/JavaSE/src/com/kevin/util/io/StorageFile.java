package com.kevin.util.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Kevin KDA on 2020/3/17 13:14
 * @version 1.0
 * @package com.kevin.util.io
 * @classname StorageFile
 * @description 实现文件存储和读取
 * @interface/enum
 */
public class StorageFile<T> implements Serializable {
    private static final long serialVersionUID = -8402795596948954371L;

    /**
     * 进行文件存储
     *
     * @param filepath: 传入输出文件路径
     * @param listData: 传入需存储的数据
     * @return boolean
     * @author Kevin KDA on 2020/3/17 13:36
     * @description StorageFile / storage 进行文件存储
     */
    public boolean storage(String filepath, List<T> listData) {
        File file = new File(filepath);
        //        如果目标路径不存在将创建父路径
        if (!file.getParentFile().exists()) {
            boolean mkdirs = file.getParentFile().mkdirs();
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(listData);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                Objects.requireNonNull(objectOutputStream).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /**
     * 进行文件存储
     *
     * @param filepath: 传入输出文件路径
     * @param listData: 传入需存储的数据
     * @return boolean
     * @author Kevin KDA on 2020/3/17 13:36
     * @description StorageFile / storage 进行文件存储
     */
    public boolean storage(String filepath, Object listData) {
        File file = new File(filepath);
        //        如果目标路径不存在将创建父路径
        if (!file.getParentFile().exists()) {
            boolean mkdirs = file.getParentFile().mkdirs();
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(listData);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                Objects.requireNonNull(objectOutputStream).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /**
     * 读取文件并返回List<T>数据，如文件不存在直接返回null
     *
     * @param filepath:传入读取文件路径
     * @return List<T> 传入读取文件获得的列表
     * @author Kevin KDA on 2020/3/17 13:45
     * @description StorageFile / readList 读取文件并返回List<T>数据，如文件不存在直接返回null
     */
    public List<T> readList(String filepath) {
        File file = new File(filepath);
//        检查文件是否存在，不存在返回null
        if (!file.exists()) {
            return null;
        }
        List<T> listData = null;
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            listData = (ArrayList<T>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listData;
    }

    /**
     * 读取文件并返回Object[]数据，如文件不存在直接返回null
     *
     * @param filepath:传入读取文件路径
     * @return Object 传入读取文件获得的列表
     * @author Kevin KDA on 2020/3/17 13:45
     * @description StorageFile / readObject 读取文件并返回Object[]数据，如文件不存在直接返回null
     */
    public Object[] readObject(String filepath) {
        File file = new File(filepath);
        //        检查文件是否存在，不存在返回null
        if (!file.exists()) {
            return null;
        }
        Object[] data = null;
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            data = (Object[]) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public StorageFile() {
    }
}
