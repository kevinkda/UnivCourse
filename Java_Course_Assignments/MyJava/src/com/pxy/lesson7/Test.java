/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.lesson7;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Role role = new Role();
		role.setName("小黄侠");
		System.out.println("请选择您的坐骑：");
		System.out.println("======================");
		System.out.println("1. 大花（猫）");
		System.out.println("2. 变形金刚（汽车）");
		System.out.println("3. 大剑（飞剑）");
		int t = input.nextInt();
		switch (t) {
		case 1:
			role.setMount(new Cat("大花"));
			break;
		case 2:
			role.setMount(new Car("大黄疯"));
			break;
		case 3:
			role.setMount(new Sword("大剑"));
			break;
		}
		
		role.getMount().run();
	}

}
