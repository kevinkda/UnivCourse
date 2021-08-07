/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.lesson7_txl;

public class Schoolmate extends Friend implements IPWDManager {
	private String city;
	
	public Schoolmate(){}
	public Schoolmate(String name, String phone, String city){
		super(name, phone);
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public void encrypt() {
		// TODO Auto-generated method stub
		String newPhone = "";
		for (int i = 0; i < this.getPhone().length(); i++) {
			newPhone += (char)(this.getPhone().charAt(i)*2);
		}
		this.setPhone(newPhone);
	}
	@Override
	public void decode() {
		// TODO Auto-generated method stub
		String newPhone = "";
		for (int i = 0; i < this.getPhone().length(); i++) {
			newPhone += (char)(this.getPhone().charAt(i)/2);
		}
		this.setPhone(newPhone);
	}
	
	
}
