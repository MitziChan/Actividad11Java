package com.mitzitec;

public class Square {
    double lado, area, perimetro;
    Shape s = new Shape();

    void areaSquare(){
        s.squareA = true;
        s.getArea();
    }
    void perimeterSquare(){
        s.squareP = true;
        s.getPerimeter();
    }
}
