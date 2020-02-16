package com.kevin.courseprojectb.entity;

/**
 * @author Kevin KDA on 2019/12/5 23:09
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package com.kevin.courseprojectb.entity
 * @classname Singer
 * @description TODO
 * @interface/enum
 */
public class Singer {
    private int singerID;
    private String singerName;

    public Singer() {
    }

    public Singer(int singerID, String singerName) {
        this.singerID = singerID;
        this.singerName = singerName;
    }

    public int getSingerID() {
        return singerID;
    }

    public void setSingerID(int singerID) {
        this.singerID = singerID;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }
}
