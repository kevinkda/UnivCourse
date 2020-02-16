package com.kevin.courseprojectb.entity;

/**
 * @author Kevin KDA on 2019/12/5 23:09
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package com.kevin.courseprojectb.entity
 * @classname Song
 * @description TODO
 * @interface/enum
 */
public class Song {
    private int songID;
    private String title;
    private int singerID;
    private int typeID;
    private String typeName;
    private int hit;

    public Song() {
    }

    public Song(int songID, String title, int singerID, int typeID, String typeName, int hit) {
        this.songID = songID;
        this.title = title;
        this.singerID = singerID;
        this.typeID = typeID;
        this.typeName = typeName;
        this.hit = hit;
    }

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSingerID() {
        return singerID;
    }

    public void setSingerID(int singerID) {
        this.singerID = singerID;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
}
