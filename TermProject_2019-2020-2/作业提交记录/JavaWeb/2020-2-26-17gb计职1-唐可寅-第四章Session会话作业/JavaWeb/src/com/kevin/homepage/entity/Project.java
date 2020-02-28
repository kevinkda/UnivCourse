package com.kevin.homepage.entity;

/**
 * @author Kevin KDA on 2020/2/22 18:09
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.homepage.entity
 * @classname Project
 * @description TODO
 * @interface/enum
 */
public class Project {
    private String strsn;
    private String strProjName;
    private String strSubmissionDate;
    private String strProjectDescription;
    private String strAffiliatedCourses;
    private String strUrlByProjName;
    private String strUrlByTaskDetails;

    public Project() {
    }

    public Project(String strProjName, String strSubmissionDate, String strProjectDescription,
                   String strAffiliatedCourses, String strUrlByProjName) {
        this.strProjName = strProjName;
        this.strSubmissionDate = strSubmissionDate;
        this.strProjectDescription = strProjectDescription;
        this.strAffiliatedCourses = strAffiliatedCourses;
        this.strUrlByProjName = strUrlByProjName;
        this.strUrlByTaskDetails = "job" + strSubmissionDate;
    }

    public Project(String strProjName, String strSubmissionDate, String strProjectDescription,
                   String strAffiliatedCourses, String strUrlByProjName, String strUrlByTaskDetails) {
        this.strProjName = strProjName;
        this.strSubmissionDate = strSubmissionDate;
        this.strProjectDescription = strProjectDescription;
        this.strAffiliatedCourses = strAffiliatedCourses;
        this.strUrlByProjName = strUrlByProjName;
        this.strUrlByTaskDetails = strUrlByTaskDetails;
    }

    public String getStrsn() {
        return strsn;
    }

    public void setStrsn(String strsn) {
        this.strsn = strsn;
    }

    public String getStrProjName() {
        return strProjName;
    }

    public void setStrProjName(String strProjName) {
        this.strProjName = strProjName;
    }

    public String getStrSubmissionDate() {
        return strSubmissionDate;
    }

    public void setStrSubmissionDate(String strSubmissionDate) {
        this.strSubmissionDate = strSubmissionDate;
    }

    public String getStrProjectDescription() {
        return strProjectDescription;
    }

    public void setStrProjectDescription(String strProjectDescription) {
        this.strProjectDescription = strProjectDescription;
    }

    public String getStrAffiliatedCourses() {
        return strAffiliatedCourses;
    }

    public void setStrAffiliatedCourses(String strAffiliatedCourses) {
        this.strAffiliatedCourses = strAffiliatedCourses;
    }

    public String getStrUrlByProjName() {
        return strUrlByProjName;
    }

    public void setStrUrlByProjName(String strUrlByProjName) {
        this.strUrlByProjName = strUrlByProjName;
    }

    public String getStrUrlByTaskDetails() {
        return strUrlByTaskDetails;
    }

    public void setStrUrlByTaskDetails(String strUrlByTaskDetails) {
        this.strUrlByTaskDetails = strUrlByTaskDetails;
    }
}
