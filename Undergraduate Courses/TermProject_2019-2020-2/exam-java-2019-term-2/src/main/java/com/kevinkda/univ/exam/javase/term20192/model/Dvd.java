package com.kevinkda.univ.exam.javase.term20192.model;

import java.util.Date;

/**
 * 领域对象，DVD JavaBean
 *
 * @author Kevin KDA on 2020/5/22 09:15
 * @version 1.0.0
 * @project exam-java-2019-term-2
 * @package com.kevinkda.univ.exam.javase.term20192.model
 * @classname Dvd
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class Dvd {
    /**
     * 序号
     */
    private int serial;
    /**
     * DVD状态
     */
    private int state;
    /**
     * 名称
     */
    private String name;
    /**
     * 借出日期
     */
    private int outDated;
    /**
     * 借出次数
     */
    private int time;


//    Override

    @Override
    public String toString() {
        return "Dvd{" +
                "serial=" + serial +
                ", state=" + state +
                ", name='" + name + '\'' +
                ", outDated=" + outDated +
                ", time=" + time +
                '}';
    }


//    Constructor、Getter、Setter

    public Dvd() {
    }

    public Dvd(int state, String name, int outDated, int time) {
        this.state = state;
        this.name = name;
        this.outDated = outDated;
        this.time = time;
    }

    public Dvd(int serial, int state, String name, int outDated, int time) {
        this.serial = serial;
        this.state = state;
        this.name = name;
        this.outDated = outDated;
        this.time = time;
    }


    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOutDated() {
        return outDated;
    }

    public void setOutDated(int outDated) {
        this.outDated = outDated;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
