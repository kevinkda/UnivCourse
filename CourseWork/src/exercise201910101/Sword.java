/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package exercise201910101;

public class Sword implements IMount {
	public String name;
	
	public Sword(){}
	public Sword(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void move(){
		System.out.println("这是"+this.name+"牌飞剑，时速能达到8888公里！");
	}
	@Override
	public void run() {
		System.out.println("传说中的神器，只要你坐上来，就是剑人了！！！");
	}
}
