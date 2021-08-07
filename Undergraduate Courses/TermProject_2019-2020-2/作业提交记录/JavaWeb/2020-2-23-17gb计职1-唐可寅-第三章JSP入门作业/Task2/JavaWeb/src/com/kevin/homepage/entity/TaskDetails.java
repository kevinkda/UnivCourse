/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.homepage.entity;

/**
 * @author Kevin KDA on 2020/2/22 19:39
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.homepage.entity
 * @classname TaskDetails
 * @description TODO
 * @interface/enum
 */
public class TaskDetails {
    private String strTaskName;
    private String strTaskSubmitName;
    private String strLayoutTime;
    private String strSubmissionDate;
    private String strTaskDescription;

    public TaskDetails(String strTaskSubmitName, String strLayoutTime, String strSubmissionDate,
                       String strTaskDescription) {
        this.strTaskSubmitName = strTaskSubmitName;
        this.strLayoutTime = strLayoutTime;
        this.strSubmissionDate = strSubmissionDate;
        this.strTaskDescription = strTaskDescription;
        this.strTaskName = "job" + strSubmissionDate;
    }

    public TaskDetails(String strTaskName, String strTaskSubmitName, String strLayoutTime,
                       String strSubmissionDate, String strTaskDescription) {
        this.strTaskName = strTaskName;
        this.strTaskSubmitName = strTaskSubmitName;
        this.strLayoutTime = strLayoutTime;
        this.strSubmissionDate = strSubmissionDate;
        this.strTaskDescription = strTaskDescription;
    }

    public String getStrTaskName() {
        return strTaskName;
    }

    public void setStrTaskName(String strTaskName) {
        this.strTaskName = strTaskName;
    }

    public String getStrTaskSubmitName() {
        return strTaskSubmitName;
    }

    public void setStrTaskSubmitName(String strTaskSubmitName) {
        this.strTaskSubmitName = strTaskSubmitName;
    }

    public String getStrLayoutTime() {
        return strLayoutTime;
    }

    public void setStrLayoutTime(String strLayoutTime) {
        this.strLayoutTime = strLayoutTime;
    }

    public String getStrSubmissionDate() {
        return strSubmissionDate;
    }

    public void setStrSubmissionDate(String strSubmissionDate) {
        this.strSubmissionDate = strSubmissionDate;
    }

    public String getStrTaskDescription() {
        return strTaskDescription;
    }

    public void setStrTaskDescription(String strTaskDescription) {
        this.strTaskDescription = strTaskDescription;
    }
}
