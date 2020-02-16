/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.dvd0arraylist;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DVD {
	private String no;		//编号
	private String name;	//姓名
	private int state;		//0.可借 1.已借出
	private Date outDate;	//借出时间
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		if(state !=0 && state != 1){
			this.state = 1;
		}
		else{
			this.state = state;
		}
	}
	public String getOutDate() {
		if(this.outDate!=null){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(outDate);
		}
		else{
			return "";
		}
		
	}
	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}
	
}
