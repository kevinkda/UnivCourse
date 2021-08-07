/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.lesson11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		try {
			Class personClass = Class.forName("com.pxy.lesson11.Person");
			//得到构造方法对象
			Constructor constructor = personClass.getDeclaredConstructor(String.class, int.class);
			//根据构造方法创建Person对象
			Object object = constructor.newInstance("小王",28);
			//得到属性
			Field nameField = personClass.getDeclaredField("name");
			nameField.setAccessible(true);
			nameField.set(object, "大王");
			//得到方法
			Method showMethod = personClass.getDeclaredMethod("show", null);
			//执行方法
			showMethod.invoke(object, null);
			
			System.out.println(object);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		 
	}

}
