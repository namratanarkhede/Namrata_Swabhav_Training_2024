package com.aurionpro.creational.prototype.model;

public class Car implements ICar {
    private String name;

    // Constructor
    public Car(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(name + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ICar clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }
}