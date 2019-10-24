/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.obsolete.build4.storagemanage;

import com.kevin.contact.obsolete.build4.ManageControl;
import com.kevin.contact.obsolete.build4.contact.Contact;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Kevin KDA
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.contact.newbuild.storagemanage
 * @classname StorageManage
 * @description TODO
 * @date 2019/10/23 19:47
 * @interface
 * @enum
 */
public class StorageManage extends ManageControl implements Serializable {
    public StorageManage() throws Exception {
    }
    private static final long serialVersionUID = -8402795596948954371L;

    public static void storage(ArrayList<Contact> arrayListData) throws IOException {
        String filepath = "./Contact/resource/Data.txt";//注意filepath的内容；
//        File file = new File(filepath);
//        ObjectOutputStream objectOutputStream;
//        objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeUnshared(arrayListData);
//        objectOutputStream.writeObject(arrayListData);
//        objectOutputStream.close();

//        File file = new File("./test.txt");
//        if(!file.exists()) {
//            file.createNewFile();
//            System.out.println("创建文件成功");
//        }


//        File directory = new File("");//参数为空
//        String courseFile = directory.getCanonicalPath() ;
//        System.out.println(courseFile);


//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(filepath),false))) {
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(filepath)))) {
//                objectOutputStream.writeObject(arrayListData);
//                objectOutputStream.close();
//        }catch (FileNotFoundException e) {
//            System.out.println("文件不存在或者文件不可读或者文件是目录");
//        } catch (IOException e) {
//            System.out.println("读取过程存在异常");
//        }

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(filepath)));
        objectOutputStream.writeObject(arrayListData);
        objectOutputStream.close();

//        DataOutputStream os = new DataOutputStream(new FileOutputStream(new File(filepath)));
//        os.writeUTF(String.valueOf(arrayListData));

//        try (FileOutputStream fos = new FileOutputStream(new File(filepath))) {
//            for (Iterator it = arrayListData.iterator(); it.hasNext(); ) { //便利arrylist
//                String str = (String) it.next(); //将list中的元素转为str遍历给String
//                fos.write(str.getBytes()); //字节流转为byte数组写入
//                fos.write("\r\n".getBytes()); //代表windows系统的换行。
//            }
//            fos.close();
//        }

//        FileWriter fileWriter = new FileWriter(filepath);
//        fileWriter.write(String.valueOf(arrayListData));
//        fileWriter.close();
    }

    static ArrayList<Contact> arrayList = new ArrayList<Contact>();


    public void read() throws Exception {
//        FileInputStream fileInputStream = new FileInputStream("resource/1.txt");
//        ObjectInputStream objectInputStream 1= new ObjectInputStream(fileInputStream);
//
//        String filepath = "./Contact/resource/Data.txt";
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(filepath)));
//        arrayList=(ArrayList<Contact>)objectInputStream.readObject();
//
////        arrayList = (ArrayList) objectInputStream.readObject();
//
//        for (Contact c:arrayList
//             ) {
//            createDataItem(c);
//        }
//        objectInputStream.close();
//        System.out.println(arrayListData.get(0).getStrName());


        String filepath = "./Contact/resource/Data.txt";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(filepath)));
        arrayListData = (ArrayList<Contact>) objectInputStream.readObject();

        objectInputStream.close();
        System.out.println(arrayListData.get(0).getStrName());


//        Object one = objectInputStream.readObject();
//        Object twObject = objectInputStream.readObject();
//        Student sone = (Student)one;
//        Student stwo = (Student)twObject;
//        System.out.println("name: "+sone.getName()+" age:"+sone.getAge());
//        System.out.println("name: "+stwo.getName()+" age:"+stwo.getAge());

//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("record.txt"));
//        Contact s1=(Contact) ois.readObject();
//        System.out.println(s1);
//        ois.close();
    }
}
