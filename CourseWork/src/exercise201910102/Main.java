/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package exercise201910102;

/**
 * @Project Java_Course_Assignments
 * @Package Exercise_20191010_1
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/10/10 8:42
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        IFly[] iFly = new IFly[5];
        iFly[0]=new Airport();
        for (IFly i:
             iFly) {
            if (i != null){
                i.fly();
            }
        }
    }
}
