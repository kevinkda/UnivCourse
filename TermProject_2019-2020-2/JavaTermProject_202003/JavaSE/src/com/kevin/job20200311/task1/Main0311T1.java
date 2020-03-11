package com.kevin.job20200311.task1;


/**
 * @author Kevin KDA on 2020/3/11 15:54
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200311.task1
 * @classname Main0311T1
 * @description
 * @interface/enum
 */
public class Main0311T1 {
    public static void main(String[] args) {
        ExceptionTest.mathException(100, 10);
        ExceptionTest.mathException(100, 0);
        ExceptionTest.emptyPointException("123");
        String str = null;
        ExceptionTest.emptyPointException(str);
        String[] str2 = {"123", "ABC", "阿斯顿"};
        ExceptionTest.numTypeException();
        ExceptionTest.indexOutException(str2);
        ExceptionTest.typeChangeException();
    }
}
