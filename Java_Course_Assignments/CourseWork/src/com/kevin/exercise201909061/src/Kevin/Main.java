/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.exercise201909061.src.Kevin;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		System.out.println(a+b*c/d-5);

		//double distanceGo=2;
		//double distanceBack=2.5;
		/*int speedUp=3000;
		int speedDown=4500;
		double timeGO=2;
		double timeBack=2.5;
		double distance=(2+2.5)/(1.0/3000+1.0/4500);
		System.out.println("翻越这座山共走了"+distance+"M");*/

		Climber C1 = new Climber();
		Climber C2 = new Climber();
		C2.Climbers(4500,5000,3,4.5);
		C1.showdistance();
		C2.showdistance();
	}

}
