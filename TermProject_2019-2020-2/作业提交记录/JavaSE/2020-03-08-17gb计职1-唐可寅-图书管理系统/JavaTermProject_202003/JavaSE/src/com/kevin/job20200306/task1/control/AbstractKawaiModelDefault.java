package com.kevin.job20200306.task1.control;

/**
 * @author Kevin KDA on 2020/3/6 17:53
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200306.task1.control
 * @classname KawaiModelDefault
 * @description
 * @interface/enum
 */
public class AbstractKawaiModelDefault extends AbstractKawaiModel {
    @Override
    public byte isConnected(int itemAi, int itemAj, int itemBi, int itemBj) {
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
        return 0;
    }

    @Override
    public String getModelName() {
        return "默认模型";
    }
}
