package com.mitzitec;

public class Rhombus implements Shape{
    double diagMayor, diagMenor, lado, area;

    public Rhombus(double diagMayor, double diagMenor, double lado) {
        this.diagMayor = diagMayor;
        this.diagMenor = diagMenor;
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return (diagMayor*diagMenor)/2;
    }

    @Override
    public double getPerimeter() {
        return lado*4;
    }
}
