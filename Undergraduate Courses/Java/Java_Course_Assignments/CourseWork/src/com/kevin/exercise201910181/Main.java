/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package e201910181;

/**
 * @Project E2017
 * @Package e20191018
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/10/18 11:20
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        convertToGeneral("刘备-4-仁德-98,关羽-4-龙胆-85,曹操-4-奸雄,夏侯惇-4-刚烈");
    }

    public static void convertToGeneral(String str) {
        String[] strs = str.split(",");
        for (int i = 0; i < strs.length; i++) {
            String element = strs[i];
            String[] cell = element.split("-");
            String info = null;
            if (cell.length == 4) {
                info = "武将" + cell[0] + "的血量是" + cell[1]
                        + "，技能是" + cell[2] + "，情义值是" + cell[3];
            }
            if (cell.length == 3) {
                info = "武将" + cell[0] + "的血量是" + cell[1]
                        + "，技能是" + cell[2];
            }
            System.out.println(info);
        }
    }

}
