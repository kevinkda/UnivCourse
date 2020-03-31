/**
 * Copyright 2009 ChinaSoft International Ltd. All rights reserved.
 */

package com.chinasofit.etc.example.se.homework.advancedoop.question1;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * <p>Title: KawaiModelFactory</p>
 * <p>Description: 连连看游戏数据模型工厂</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: ChinaSoft International Ltd.</p>
 *
 * @author etc
 * @version 1.0
 */

public class KawaiModelFactory {
    public static KawaiModel getModel() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("ModelConf.conf"));
            String modelClassName = br.readLine();
            br.close();
            KawaiModel model = (KawaiModel) Class.forName(modelClassName).newInstance();
            return model;
        } catch (Exception ex) {
            //ex.printStackTrace();
            return new KawaiModelDefault();
        }
    }
}
