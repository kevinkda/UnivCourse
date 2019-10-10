/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.Kevin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Console Input");
        System.out.println("-----------");
        System.out.print("Please Input Word:");
        //Scanner
        Scanner Scinput = new Scanner(System.in);
        String strText = Scinput.next();
        System.out.println("Your input are:" + strText);

    }
}
