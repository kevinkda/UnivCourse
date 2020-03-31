/**
 * Copyright 2009 ChinaSoft International Ltd. All rights reserved.
 */
package com.chinasofit.etc.example.se.homework.advancedoop.question1;

/**
 * <p>Title: KawaiModelLine</p>
 * <p>Description: 连连看只允许一条直线连接的模型</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: ChinaSoft International Ltd.</p>
 *
 * @author etc
 * @version 1.0
 */
public class KawaiModelLine extends KawaiModel {
    public byte isConnected(int itemAI, int itemAJ, int itemBI, int itemBJ) {
        if (map[itemAI][itemAJ] == 0 || map[itemBI][itemBJ] == 0
                || (map[itemAI][itemAJ] != map[itemBI][itemBJ])
                || (itemAI == itemBI && itemAJ == itemBJ)) {
            return 0;
        }
        if (linkByLine(itemAI, itemAJ, itemBI, itemBJ)) {
            return 1;
        }
        return 0;
    }

    @Override
    public String getModelName() {
        // TODO Auto-generated method stub
        return "一条线模型";
    }
}
