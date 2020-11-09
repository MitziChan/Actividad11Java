package com.mitzitec;

public class Triangle {
    double base, altura, lado, area, perimetro;
    Shape t = new Shape();

    void areaTriangle(){
        t.triangleA = true;
        t.getArea();

    }
    void perimeterTriangle(){
        t.triangleP = true;
        t.getPerimeter();

    }

}
