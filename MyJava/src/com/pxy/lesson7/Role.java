/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.lesson7;

public class Role {
	private String name;
	private IMount mount;	//应该是什么类型？
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IMount getMount() {
		return mount;
	}
	public void setMount(IMount mount) {
		this.mount = mount;
	}
	
	
}
