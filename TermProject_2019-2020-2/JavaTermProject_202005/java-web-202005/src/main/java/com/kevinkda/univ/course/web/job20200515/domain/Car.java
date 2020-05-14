package com.kevinkda.univ.course.web.job20200515.domain;

/**
 * @author Kevin KDA on 2020/5/14 15:35
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.job20200515.domain
 * @classname Car
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class Car {
    private int id;
    private String brand;
    private String model;
    private String color;
    private double price;


    public Car() {
    }

    public Car(int id, String brand, String model, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
