package com.mitzitec;

public class Circle implements Shape{
    private double pi=3.141592;
    private double radio;


    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return pi*radio*radio;
    }

    @Override
    public double getPerimeter() {
        return pi*radio*2;
    }
}
