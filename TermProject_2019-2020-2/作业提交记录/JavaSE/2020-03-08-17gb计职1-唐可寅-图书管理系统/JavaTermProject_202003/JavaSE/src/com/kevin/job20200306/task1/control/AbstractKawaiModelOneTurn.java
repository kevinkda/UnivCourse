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
public class AbstractKawaiModelOneTurn extends AbstractKawaiModel {
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
        return 0;
    }

    @Override
    public String getModelName() {
        return "一折模型";
    }
}
