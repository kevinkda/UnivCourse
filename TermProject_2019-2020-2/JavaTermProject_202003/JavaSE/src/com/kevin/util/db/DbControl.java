/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.util.db;

import java.sql.ResultSet;

/**
 * @author Kevin KDA on 2020/3/24 10:08
 * @version 1.0
 * @project GPACalculator
 * @package com.kevin.util.db
 * @classname DbControl
 * @description
 * @interface/enum
 */
public class DbControl {
    public static int insertData(String strTable, Object[] args) {
        StringBuilder builder = new StringBuilder("insert into  () values ();");
        builder.append(strTable);
        builder.append(") values (");
        int intNumberOfAffectedRows = -1;
        if (args != null && args.length > 1) {


            return intNumberOfAffectedRows;
        } else if (args != null && args.length == 1) {

            return intNumberOfAffectedRows;
        } else {
            return intNumberOfAffectedRows;
        }
    }

    public static ResultSet getResultSet() {
//        int count = getResultSet().getMetaData().getColumnCount();
        return null;
    }
}
