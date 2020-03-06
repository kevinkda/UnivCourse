package com.kevin.job20200306.task1.control;

/**
 * @author Kevin KDA on 2020/3/6 17:55
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200306.task1.control
 * @classname KawaiModelOneTurn
 * @description
 * @interface/enum
 */
public class KawaiModelOneTurn extends KawaiModel {
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
        if (linkByOneTurn(itemAI, itemAJ, itemBI, itemBJ)) {
            return 2;
        }
        return 0;
    }

    @Override
    public String getModelName() {
        return "一折模型";
    }
}
