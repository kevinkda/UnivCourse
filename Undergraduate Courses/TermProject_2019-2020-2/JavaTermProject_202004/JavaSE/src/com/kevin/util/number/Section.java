package com.kevin.util.number;

/**
 * @author Kevin KDA on 2020/3/31 21:21
 * @version 1.0
 * @project JavaUtils
 * @package com.kevin.util.number
 * @classname Section
 * @description
 * @interface/enum
 */
public class Section {
    private int left;
    private int right;

    public Section() {
    }

    public Section(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }
}
