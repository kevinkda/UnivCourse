package com.kevin.job20200324.pojo;

/**
 * @author Kevin KDA on 2020/3/24 14:18
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200324.pojo
 * @classname Car
 * @description
 * @interface/enum
 */
public class Car {
    private int carId;
    private String carName;
    private double carPrice;

    public Car() {
    }

    public Car(String carName, double carPrice) {
        this.carName = carName;
        this.carPrice = carPrice;
    }

    public Car(int carId, String carName, double carPrice) {
        this.carId = carId;
        this.carName = carName;
        this.carPrice = carPrice;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }
}
