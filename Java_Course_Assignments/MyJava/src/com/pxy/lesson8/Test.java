/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.lesson8;

import com.pxy.DVD;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test {

	public static void main(String[] args) {
		try {
			//反序列化
			DVD dvd = new DVD();
			
			File file = new File("d:\\aaa.data");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			dvd = (DVD)ois.readObject();
			
			ois.close();
			fis.close();
			
			System.out.println(dvd.getName());
			
			//序列化
//			DVD dvd = new DVD();
//			dvd.setNo("2323");
//			dvd.setName("aaaaaa");
//			dvd.setState(1);
//			
//			File file = new File("d:\\aaa.data");
//			FileOutputStream fos = new FileOutputStream(file);
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			
//			oos.writeObject(dvd);
//			
//			oos.close();
//			fos.close();
//			System.out.println("存档完成！");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}
	
}
