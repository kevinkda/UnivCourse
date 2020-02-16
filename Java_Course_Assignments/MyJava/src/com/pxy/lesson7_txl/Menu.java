/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.lesson7_txl;

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

public class Menu {
	private Scanner input = new Scanner(System.in);
	FriendManager fm = new FriendManager();

	public void mainMenu() {
		System.out.println("\t通讯录2.0");
		System.out.println("======================");
		System.out.println("1.添加");
		System.out.println("2.删除");
		System.out.println("3.查找");
		System.out.println("4.退出");
		System.out.print("请选择：");
		int t = input.nextInt();
		switch (t) {
		case 1:
			addMenu();
			break;
		case 2:
			removeMenu();
			break;
		case 3:
			showMenu();
			break;

		default:
			System.out.println("程序结束！");
			break;
		}

	}

	public void addMenu() {
		Friend friend = null;

		System.out.println("通讯录2.0——>添加");
		System.out.println("========================");
		System.out.println("1.家人");
		System.out.println("2.同学");
		System.out.println("3.业务来往");
		System.out.print("请选择：");
		int t = input.nextInt();
		switch (t) {
		case 1:
			friend = new Kinsfolk();
			break;
		case 2:
			friend = new Schoolmate();
			break;
		case 3:
			friend = new Business();
			break;
		}

		System.out.print("请输入姓名：");
		friend.setName(input.next());
		System.out.print("请输入电话：");
		friend.setPhone(input.next());
		System.out.print("是否输入其他信息(y/n):");
		String s = input.next();
		if (s.toUpperCase().equals("Y")) {
			System.out.print("请输入性别：");
			friend.setSex(input.next());
			System.out.print("请输入住址：");
			friend.setAddress(input.next());

			// 输入独特信息
			if (friend instanceof Kinsfolk) {
				System.out.print("请输入家人关系：");
				((Kinsfolk) friend).setRelation(input.next());
			} else if (friend instanceof Schoolmate) {
				System.out.println("请输入所在城市：");
				((Schoolmate) friend).setCity(input.next());
			} else if (friend instanceof Business) {
				System.out.println("请输入合作业务：");
				((Business) friend).setType(input.next());
			}
		}

		fm.add(friend);
		System.out.println("添加成功！");

		returnMainMenu();
	}

	public void removeMenu() {
		System.out.println("通讯录2.0——>删除");
		System.out.println("========================");
		System.out.print("请输入姓名：");
		String name = input.next();
		if (fm.remove(name)) {
			System.out.println("删除成功！");
		} else {
			System.out.println("查无此人，请重试！");
		}

		returnMainMenu();
	}

	public void showMenu() {
		System.out.println("通讯录2.0——>查找");
		System.out.println("======================");
		System.out.println("1.查看所有");
		System.out.println("2.根据姓名搜索");
		System.out.println("3.根据电话号码搜索");
		System.out.println("4.返回上一菜单");
		System.out.print("请选择：");
		int t = input.nextInt();
		switch (t) {
		case 1:
			showAllMenu();
			break;
		case 2:
			showByNameMenu();
			break;
		case 3:
			showByPhoneMenu();
			break;
		default:
			mainMenu();
			break;
		}
	}

	public void showAllMenu() {
		fm.showAll();
		returnShowMenu();
	}

	public void showByNameMenu() {
		System.out.print("请输入姓名：");
		String name = input.next();
		fm.showByName(name);
		returnShowMenu();
	}

	public void showByPhoneMenu() {
		System.out.print("请输入手机号：");
		String phone = input.next();
		fm.showByPhone(phone);
		returnShowMenu();
	}

	// 返回主界面
	public void returnMainMenu() {
		System.out.println("按任意键后回车返回上一级菜单...");
		input.next();
		mainMenu();
	}
	//返回查找业务主界面
	public void returnShowMenu(){
		System.out.println("按任意键后回车返回上一级菜单...");
		input.next();
		showMenu();
	}
}
