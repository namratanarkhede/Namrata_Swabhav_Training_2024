package com.aurionpro.creational.prototype.model;

public interface ICar extends Cloneable {
    void start();
    void stop();
    String getName();
    ICar clone() throws CloneNotSupportedException;
}