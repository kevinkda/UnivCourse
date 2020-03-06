package com.kevin.job20200306.task1.control;


import com.kevin.job20200306.task1.entity.Node;

/**
 * @author Kevin KDA on 2020/3/6 17:56
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200306.task1.control
 * @classname KawaiModelThreeTurn
 * @description
 * @interface/enum
 */
public class KawaiModelThreeTurn extends KawaiModel {
    public boolean linkByThreeTurn(int itemAI, int itemAJ, int itemBI, int itemBJ) {
        for (int i = 0; i < map.length; i++) {
            if (map[i][itemAJ] == 0 && linkByLine(i, itemAJ, itemAI, itemAJ)
                    && linkByTwoTurn(i, itemAJ, itemBI, itemBJ)) {
                // turningPointBI=i;
                // turningPointBJ=itemAJ;

                setTurningPoints(i, itemAJ, 3);
                return true;
            }
        }

        for (int j = 0; j < map[itemAI].length; j++) {
            if (map[itemAI][j] == 0 && linkByLine(itemAI, j, itemAI, itemAJ)
                    && linkByTwoTurn(itemAI, j, itemBI, itemBJ)) {
                // turningPointBI=itemAI;
                // turningPointBJ=j;
                setTurningPoints(itemAI, j, 3);
                return true;
            }
        }
        return false;
    }

    @Override
    public byte isConnected(int itemAI, int itemAJ, int itemBI, int itemBJ) {
        // System.out.println(this.turningPoints.length);
        if (turningPoints.length < 3) {

            turningPoints = new Node[3];
        }
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
        if (linkByTwoTurn(itemAI, itemAJ, itemBI, itemBJ)) {
            return 3;
        }
        if (linkByThreeTurn(itemAI, itemAJ, itemBI, itemBJ)) {
            return 4;
        }
        return 0;
    }

    @Override
    public String getModelName() {
        return "三折模型";
    }
}
