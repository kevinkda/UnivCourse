package com.kevin.job20200306.task1;


import com.kevin.job20200306.task1.control.KawaiModel;
import com.kevin.job20200306.task1.control.KawaiModelLine;
import com.kevin.job20200306.task1.factory.KawaiModelFactory;

/**
 * @author Kevin KDA on 2020/3/6 14:59
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200306.task1
 * @classname Main0306T1
 * @description TODO 连连看
 * @interface/enum
 */
public class Main0306T1 {
    public static void main(String[] args) {
        int[][] map = new int[][]{
                {0, 0, 0, 1, 1, 0, 2, 0, 3},
                {1, 0, 0, 2, 0, 0, 1, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 2, 0},
                {3, 0, 0, 2, 1, 0, 1, 0, 0}
        };
//        KawaiModel km = new KawaiModel();
//        km.setMap(map);
//        km.showConnectState(0, 3, 1, 0);
//        km.showConnectState(0, 3, 1, 6);

//        KawaiModel km = new KawaiModelLine();
//        km.setMap(map);
//        km.showConnectState(0, 3, 1, 0);
//        km.showConnectState(2, 0, 2, 7);

        KawaiModel km = KawaiModelFactory.getModel();
        km.setMap(map);
        km.showConnectState(1, 0, 0, 4);
    }
}
