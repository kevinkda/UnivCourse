package com.kevin.job01.base;

import com.kevin.job01.base.tool.BirthdayCalculation;

import java.util.Date;

/**
 * @author Kevin KDA on 2020/2/17 14:26
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job01.base
 * @classname PersonalInformation
 * @description TODO
 * @interface/enum
 */
public class PersonalInformation {
    String strName;
    int intSex;
    int intHeight;
    Date dateBirth;

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

    public String getStringSex() {
        return intSex == 1 ? "男" : "女";
    }

    public void setStringSex(String strSex) {
        if (strSex == "男") {
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

    public int getIntAgeByBirth(){
        return BirthdayCalculation.getAgeByBirth(dateBirth);
    }
}
