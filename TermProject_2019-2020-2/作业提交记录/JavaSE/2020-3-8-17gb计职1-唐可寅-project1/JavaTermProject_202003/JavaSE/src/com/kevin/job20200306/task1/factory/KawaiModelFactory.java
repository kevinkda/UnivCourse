package com.kevin.job20200306.task1.factory;


import com.kevin.job20200306.task1.control.AbstractKawaiModel;
import com.kevin.job20200306.task1.control.AbstractKawaiModelDefault;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Kevin KDA on 2020/3/6 17:14
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200306.task1.factory
 * @classname KawaiModelFactory
 * @description
 * @interface/enum
 */
public class KawaiModelFactory {
    public static AbstractKawaiModel getModel() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("ModelConf.conf"));
            String modelClassName = br.readLine();
            br.close();
            return (AbstractKawaiModel) Class.forName(modelClassName).newInstance();
        } catch (Exception ex) {
            return new AbstractKawaiModelDefault();
        }
    }
}
