/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.lesson7_txl;

import java.util.HashMap;
import java.util.Map;

public class FriendManager {
	private Map<String, Friend> friendList = new HashMap<String, Friend>();
	
	public FriendManager(){
		init();
	}
	//初始化数据
	public void init(){
		Friend friend1 = new Schoolmate("大胖", "13383492894", "武汉");
		Friend friend2 = new Kinsfolk("二大爷", "13355633838", "北京");
		Friend friend3 = new Business("美团外卖", "15838294782", "武汉");
		((Schoolmate)friend1).encrypt();	//加密
		friendList.put(friend1.getName(), friend1);
		friendList.put(friend2.getName(), friend2);
		friendList.put(friend3.getName(), friend3);
	}
	
	public void add(Friend friend){
		if(friend instanceof Schoolmate){
			((Schoolmate)friend).encrypt();	//加密
		}
		friendList.put(friend.getName(), friend);
	}
	
	public boolean remove(String name){
		Friend friend = friendList.remove(name);
		if(friend!=null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void showAll(){
		System.out.println("姓名\t电话\t性别\t住址");
		System.out.println("==================================");
		for (Friend friend : friendList.values()) {
			System.out.println(friend.getName()+"\t"+
					friend.getPhone()+"\t"+
					friend.getSex()+"\t"+
					friend.getAddress());
		}
	}
	
	public void showByName(String name){
		System.out.println("姓名\t电话\t性别\t住址");
		System.out.println("==================================");
		for (Friend friend : friendList.values()) {
			if(friend.getName().indexOf(name)>=0){
				System.out.println(friend.getName()+"\t"+
						friend.getPhone()+"\t"+
						friend.getSex()+"\t"+
						friend.getAddress());
			}
			
		}
	}
	
	public void showByPhone(String phone){
		System.out.println("姓名\t电话\t性别\t住址");
		System.out.println("==================================");
		for (Friend friend : friendList.values()) {
			//如果是同学，先解密，再比较
			if(friend instanceof Schoolmate){
				((Schoolmate)friend).decode();
			}
			if(friend.getPhone().indexOf(phone)>=0){
				System.out.println(friend.getName()+"\t"+
						friend.getPhone()+"\t"+
						friend.getSex()+"\t"+
						friend.getAddress());
			}
			
		}
	}
}
