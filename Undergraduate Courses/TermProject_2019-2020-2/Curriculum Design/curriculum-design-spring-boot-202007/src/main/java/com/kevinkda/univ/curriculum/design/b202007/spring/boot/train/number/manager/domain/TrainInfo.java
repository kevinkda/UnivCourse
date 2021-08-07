package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 火车车次信息表
 *
 * @author Kevin KDA on 2020/7/6 21:29
 * @version 1.0.0
 * @project curriculum-design-spring-boot-202007
 * @package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.domain
 * @classname TrainInfo
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Data
public class TrainInfo implements Serializable {
    /**
     * 车次编号
     */
    private String trainNo;

    /**
     * 始发站
     */
    private String startStation;

    /**
     * 终点站
     */
    private String arrivalStation;

    /**
     * 出发时间
     */
    private String startTime;

    /**
     * 到达时间
     */
    private String arrivalTime;

    /**
     * 车次类型
     */
    private String type;

    /**
     * 运行时间
     */
    private String runtime;

    /**
     * 里程
     */
    private BigDecimal mile;

    public TrainInfo() {
    }

    public TrainInfo(String trainNo, String startStation, String arrivalStation, String startTime, String arrivalTime, String type, String runtime, BigDecimal mile) {
        this.trainNo = trainNo;
        this.startStation = startStation;
        this.arrivalStation = arrivalStation;
        this.startTime = startTime;
        this.arrivalTime = arrivalTime;
        this.type = type;
        this.runtime = runtime;
        this.mile = mile;
    }
}