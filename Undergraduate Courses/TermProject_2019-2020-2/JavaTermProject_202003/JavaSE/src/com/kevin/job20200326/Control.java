package com.kevin.job20200326;

import com.kevin.util.db.JdbcUtils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Kevin KDA on 2020/3/26 19:47
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200326
 * @classname Control
 * @description
 * @interface/enum
 */
public class Control {
    private void func() {
        task1();
    }

    private void task1() {
        String sql = "select carID,carName,carPrice from carInfo";
        List<Map<String, Object>> list = JdbcUtils.getResultListMap(sql);
        for (Map<String, Object> map :
                list) {
            Set<Map.Entry<String, Object>> entrySet = map.entrySet();
            Iterator<Map.Entry<String, Object>> entryIterator = entrySet.iterator();
            Map.Entry<String, Object> entry;
            while (entryIterator.hasNext()) {
                entry = entryIterator.next();
                String key = entry.getKey();
                Object value = entry.getValue();
                if ("carPrice".equals(key)) {
                    if ((double) value <= 500000) {
                        value += "\n国产牌汽车";
                    } else {
                        value += "\n进口牌汽车";
                    }
                }
                System.out.println(key + " = " + value);
            }
            System.out.println("");
        }
    }

    public Control() {
        func();
    }
}
