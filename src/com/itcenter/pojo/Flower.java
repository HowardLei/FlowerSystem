package com.itcenter.pojo;

/**
 * Flower class
 *
 * @author apple
 * @date 2019/9/30
 */
public class Flower {
    private int id;
    private String name;
    private double price;
    private String production;

    public Flower(int id, String name, double price, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.production = production;
    }

    public Flower(String name, double price, String production) {
        this(-1, name, price, production);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }
}
