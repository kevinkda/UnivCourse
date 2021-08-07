/**
 * Copyright 2009 ChinaSoft International Ltd. All rights reserved.
 */
package com.chinasofit.etc.example.se.homework.advancedoop.question1;

/**
 * <p>Title: KawaiModelTest</p>
 * <p>Description: 测试连连看数据模型的主类</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: ChinaSoft International Ltd.</p>
 *
 * @author etc
 * @version 1.0
 */
public class KawaiModelTest {
    public static void main(String[] args) {
        int[][] map = new int[][]{
                {0, 0, 0, 1, 1, 0, 2, 0, 3},
                {1, 0, 0, 2, 0, 0, 1, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 2, 0},
                {3, 0, 0, 2, 1, 0, 1, 0, 0}
        };

//		KawaiModel km=new KawaiModel();
//		km.setMap(map);
//		km.showConnectState(0,3, 1, 0);
//		km.showConnectState(0,3, 1, 6);

//		KawaiModel km=new KawaiModelLine();
//		km.setMap(map);
//		km.showConnectState(0,3, 1, 0);
//		km.showConnectState(2,0, 2, 7);

        KawaiModel km = KawaiModelFactory.getModel();
        km.setMap(map);
        km.showConnectState(1, 0, 0, 4);
    }
}
