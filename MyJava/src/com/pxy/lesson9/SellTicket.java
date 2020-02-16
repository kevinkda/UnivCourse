/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.lesson9;

public class SellTicket implements Runnable {
	
	private int tickets = 10;
	private Object obj = new Object();
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (obj) {
					if(tickets>0){
						System.out.println(Thread.currentThread().getName() +"售出一张票，还剩"+(--tickets)+"张");
					}
				}
				Thread.sleep(200);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}
