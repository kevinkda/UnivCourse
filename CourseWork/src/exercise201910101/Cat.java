/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package exercise201910101;

public class Cat extends Animal implements IMount {

	public Cat(){}
	public Cat(String name){
		super(name);
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("我叫"+this.getName()+"，我跑起来能达到100米/秒！");
	}
	@Override
	public void run() {
		System.out.println("长八米，宽八米的猫，向你跑来，就问你怕不怕！");
	}

}
