package com.kevin.job20200217.base;

import com.kevin.job20200217.base.tool.BirthdayCalculation;

import java.util.Date;

/**
 * @author Kevin KDA on 2020/2/17 14:26
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200217.base
 * @classname PersonalInformation
 * @description TODO
 * @interface/enum
 */
public class PersonalInformation {
    private String strName;
    private int intSex;
    private int intHeight;
    private Date dateBirth;

    public PersonalInformation(String strName, String strSex, int intHeight, Date dateBirth) {
        this.strName = strName;
        setStringSex(strSex);
        this.intHeight = intHeight;
        this.dateBirth = dateBirth;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    /**
     * @param
     * @return int
     * @author Kevin KDA on 2020/2/19 13:20
     * @description PersonalInformation / getIntSex TODO 提供对已清洗性别数据的原始数据叫其他方法继续转换
     */
    public int getIntSex() {
        return intSex;
    }

    /**
     * @param
     * @return String
     * @author Kevin KDA on 2020/2/17 14:26
     * @description PersonalInformation / getStringSex TODO 提供对已清洗性别数据的本地反向解析
     */
    public String getStringSex() {
        return intSex == 1 ? "男" : "女";
    }

    /**
     * @param strSex:提供文字性描述的性别
     * @return void
     * @author Kevin KDA on 2020/2/17 14:26
     * @description PersonalInformation / setStringSex TODO 提供对性别数据的清洗，确保数据统一；e.g."男"、"male"同指男性；数据标记1.男性，2.女性
     * 本方法暂仅提供对"男"、"女"的数据清理
     */
    public void setStringSex(String strSex) {
        if ("男".equals(strSex)) {
            this.intSex = 1;
        } else {
            this.intSex = 0;
        }
    }

    public int getIntHeight() {
        return intHeight;
    }

    public void setIntHeight(int intHeight) {
        this.intHeight = intHeight;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getIntAgeByBirth() {
        return BirthdayCalculation.getAgeByBirth(dateBirth);
    }
}
