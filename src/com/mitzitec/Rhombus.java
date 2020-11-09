package com.mitzitec;

public class Rhombus {
    double diagonalMayor, diagonalMenor, lado, area, perimetro;
    Shape s = new Shape();

    void areaRhombus(){
        s.rhombusA = true;
        s.getArea();
    }
    void perimeterRhombus(){
        s.rhombusP = true;
        s.getPerimeter();
    }
}
