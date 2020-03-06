package com.kevin.job20200306.task1.control;

/**
 * @author Kevin KDA on 2020/3/6 17:54
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200306.task1.control
 * @classname KawaiModelLine
 * @description
 * @interface/enum
 */
public class KawaiModelLine extends KawaiModel {
    @Override
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
        return "一条线模型";
    }
}