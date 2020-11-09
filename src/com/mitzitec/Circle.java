package com.mitzitec;

public class Circle {
    double radio, area, perimetro;
    Shape c = new Shape();

    void areaCircle(){
        c.circleA = true;
        c.getArea();
    }
    void perimeterCircle(){
        c.circleP = true;
        c.getPerimeter();

    }

}
