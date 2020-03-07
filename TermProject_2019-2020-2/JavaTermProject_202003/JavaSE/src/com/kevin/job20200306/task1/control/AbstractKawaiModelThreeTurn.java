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
public class AbstractKawaiModelThreeTurn extends AbstractKawaiModel {
    public boolean linkByThreeTurn(int itemAi, int itemAj, int itemBi, int itemBj) {
        for (int i = 0; i < map.length; i++) {
            if (map[i][itemAj] == 0 && linkByLine(i, itemAj, itemAi, itemAj)
                    && linkByTwoTurn(i, itemAj, itemBi, itemBj)) {
                // turningPointBI=i;
                // turningPointBJ=itemAj;

                setTurningPoints(i, itemAj, 3);
                return true;
            }
        }

        for (int j = 0; j < map[itemAi].length; j++) {
            if (map[itemAi][j] == 0 && linkByLine(itemAi, j, itemAi, itemAj)
                    && linkByTwoTurn(itemAi, j, itemBi, itemBj)) {
                // turningPointBI=itemAi;
                // turningPointBJ=j;
                setTurningPoints(itemAi, j, 3);
                return true;
            }
        }
        return false;
    }

    @Override
    public byte isConnected(int itemAi, int itemAj, int itemBi, int itemBj) {
        // System.out.println(this.turningPoints.length);
        if (turningPoints.length < 3) {

            turningPoints = new Node[3];
        }
        if (map[itemAi][itemAj] == 0 || map[itemBi][itemBj] == 0
                || (map[itemAi][itemAj] != map[itemBi][itemBj])
                || (itemAi == itemBi && itemAj == itemBj)) {
            return 0;
        }
        if (linkByLine(itemAi, itemAj, itemBi, itemBj)) {
            return 1;
        }
        if (linkByOneTurn(itemAi, itemAj, itemBi, itemBj)) {
            return 2;
        }
        if (linkByTwoTurn(itemAi, itemAj, itemBi, itemBj)) {
            return 3;
        }
        if (linkByThreeTurn(itemAi, itemAj, itemBi, itemBj)) {
            return 4;
        }
        return 0;
    }

    @Override
    public String getModelName() {
        return "三折模型";
    }
}
