/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.lesson6;

import com.pxy.lesson6.Car.CarType;

public class Test {

	public static void main(String[] args) {
		Automobile car = new Car("鄂A48298", CarType.宝马);
		Bus bus = new Bus("京A48482", 28);
		
		System.out.println(car.toString());
	}

}
