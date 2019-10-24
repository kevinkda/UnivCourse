/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.lesson6;

public class Car extends Automobile {
	//定义枚举类型（小轿车类型）
	enum CarType {
		宝马, 别克, 奔驰
	}
	
	private CarType type;	//车型
	
	public Car(String number, CarType type){
		super(number);
		this.type = type;
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}
	
	@Override
	public int calcRent(int days) {
		int price = 0;
		if(this.type == CarType.宝马){
			price = 500*days;
		}
		else if(this.type == CarType.别克){
			price = 600*days;
		}
		else if(this.type == CarType.奔驰){
			price = 300*days;
		}
		
		return price;
	}

}
