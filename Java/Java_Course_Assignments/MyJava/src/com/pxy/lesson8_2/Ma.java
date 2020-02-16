/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.lesson8_2;

import java.util.Random;

public class Ma extends Thread {
	public static int ranking = 0;	//名次
	@Override
	public void run() {
		Random random  = new Random();
		int mileage = 0;
		
		try {
			while(true){
				mileage += 100+random.nextInt(100);
				System.out.println(this.getName()+"已经跑了"+mileage+"米！");
				if(mileage>=1000){
					System.out.println(this.getName()+"跑到终点了，他是第"+(++ranking)+"名！！！");
					break;
				}
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}
