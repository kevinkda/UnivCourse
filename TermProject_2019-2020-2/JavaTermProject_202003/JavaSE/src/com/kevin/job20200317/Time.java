package com.kevin.job20200317;

import com.kevin.util.date.TimeUtil;

import java.io.Serializable;

/**
 * @author Kevin KDA on 2020/3/17 15:26
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200317
 * @classname Time
 * @description
 * @interface/enum
 */
public class Time extends TimeUtil implements Serializable {
    private String funcName;
    private static final long serialVersionUID = -8402795596948954372L;

    public Time(String funcName) {
        this.funcName = funcName;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }
}
