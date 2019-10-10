/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package exercise201909121.src.Kevin;

public class Main {
	/*
	 * @Author Kevin KDA
	 * @Description //TODO 
	 * @Date 9:53 2019/9/12
	 * @Param 
	 * @return 
	 **/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner SC = new Scanner(System.in);
//		System.out.print("请输入要判断的年份：");
//		int intYear = SC.nextInt();
//		if ((intYear%4==0&&intYear%100!=)||intYear%400==0)
		for (int i=0,sum=0; i<=1000; i++) {
			for(int j=i; j>0; ) {
				sum = sum + j % 10;
				j = j / 10;
			}
			if (sum == i) {
				System.out.println();
			}
		}
	}

}
