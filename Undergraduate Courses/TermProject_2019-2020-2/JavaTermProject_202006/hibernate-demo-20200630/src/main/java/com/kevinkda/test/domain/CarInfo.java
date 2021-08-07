package com.kevinkda.test.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author Kevin KDA on 2020/6/30 09:26
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.test.domain
 * @classname
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Entity
@Data
@Getter
@Setter
@ToString
public class CarInfo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carId;
    private String carName;
    private Double carPrice;

    public CarInfo() {
    }

    public CarInfo(String carName, double carPrice) {
        this.carName = carName;
        this.carPrice = carPrice;
    }

    public CarInfo(int carId, String carName, double carPrice) {
        this.carId = carId;
        this.carName = carName;
        this.carPrice = carPrice;
    }


    @Id
    @Column(name = "carID")
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    @Basic
    @Column(name = "carName")
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Basic
    @Column(name = "carPrice")
    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CarInfo carInfo = (CarInfo) o;
        return carId == carInfo.carId &&
                Objects.equals(carName, carInfo.carName) &&
                Objects.equals(carPrice, carInfo.carPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, carName, carPrice);
    }
}
