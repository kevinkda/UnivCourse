/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.dvd0arraylist;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DVDManager {
	private List dvdList = new ArrayList();	//DVD列表
	
	public DVDManager(){
		
		DVD d1 = new DVD();
		d1.setNo("9527");
		d1.setName("监狱风云2");
		d1.setState(1);
		d1.setOutDate(new Date());
		
		DVD d2 = new DVD();
		d2.setNo("3432");
		d2.setName("复仇者联盟");
		
		DVD d3 = new DVD();
		d3.setNo("6655");
		d3.setName("中国机长");
		
		dvdList.add(d1);
		dvdList.add(d2);
		dvdList.add(d3);
	}
	
	//	添加()
	//格式：访问修饰符 返回值类型 方法名(参数列表){}
	public void add(DVD dvd){
		dvdList.add(dvd);
	}
	//查看所有DVD()
	public void showAll(){
		System.out.println("序号\t名称\t状态\t借出时间");
		for (Object obj : dvdList) {
			DVD dvd = (DVD)obj;
			System.out.println(dvd.getNo()+"\t"+
					dvd.getName()+"\t"+
					(dvd.getState()==0?"可借":"已借出")+"\t"+
					(dvd.getOutDate()==null?"":dvd.getOutDate()));
		}
		
	}
	
	//，删除()
	public int remove(String dvdNO){
		int state = 0;	//0. 没有数据 1.删除成功 2.已借出不能删除
		for (Object obj : dvdList) {
			DVD dvd = (DVD)obj;
			if(dvd.getNo().equals(dvdNO) && dvd.getState()==0){
				dvdList.remove(dvd);
				state = 1;
				break;
			}
			else if(dvd.getNo().equals(dvdNO) && dvd.getState()==1){
				state = 2;
				break;
			}
		}
		
		return state;
	}
	
	//，修改()，出租()，归还()
}
