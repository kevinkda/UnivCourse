package com.chinasofit.etc.example.se.homework.advancedoop.question1;

public class KawaiModelDefault extends KawaiModel {

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
        if (linkByTwoTurn(itemAI, itemAJ, itemBI, itemBJ)) {
            return 3;
        }
        return 0;
    }

    @Override
    public String getModelName() {
        // TODO Auto-generated method stub
        return "默认模型";
    }
}
