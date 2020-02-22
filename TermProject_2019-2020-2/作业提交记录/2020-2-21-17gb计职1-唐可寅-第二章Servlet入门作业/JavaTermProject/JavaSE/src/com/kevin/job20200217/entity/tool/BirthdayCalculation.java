package com.kevin.job20200217.entity.tool;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Kevin KDA on 2020/2/17 14:55
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200217.entity.tool
 * @classname BirthdayCalculation
 * @description TODO 提供关于生日的年龄计算
 * @interface/enum
 */
public class BirthdayCalculation {
    /**
     * @param birthday:提供一个日期，需求含义生日
     * @return int:计算后得出的年龄
     * @author Kevin KDA on 2020/2/19 13:55
     * @description BirthdayCalculation /  TODO 提供通过所给生日计算年龄
     */
    public static int getAgeByBirth(Date birthday) {
        int age = 0;
        try {
            Calendar now = Calendar.getInstance();
            // 当前时间
            now.setTime(new Date());

            Calendar birth = Calendar.getInstance();
            birth.setTime(birthday);

            //如果传入的时间，在当前时间的后面，返回0岁
            if (birth.after(now)) {
                age = 0;
            } else {
                age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
                if (now.get(Calendar.DAY_OF_YEAR) > birth.get(Calendar.DAY_OF_YEAR)) {
                    age += 1;
                }
            }
            return age;
        } catch (Exception e) {//兼容性更强,异常后返回数据
            return 0;
        }
    }

    /**
     * @param birthDay:提供一个日期，需求含义生日
     * @return int:计算后得出的年龄
     * @author Kevin KDA on 2020/2/19 13:55
     * @description BirthdayCalculation / getAge TODO 提供通过所给生日计算年龄
     */
    @Deprecated
    public static int getAge(Date birthDay) {
        Calendar cal = Calendar.getInstance();
        if (cal.before(birthDay)) {
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthDay);

        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) {
                    age--;
                }
            } else {
                age--;
            }
        }
        return age;
    }
}
