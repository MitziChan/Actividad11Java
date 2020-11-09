package com.mitzitec;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int get, figuraArea, figuraPerimetro;
        Scanner m = new Scanner(System.in);
        System.out.println("Bienvenido\n ¿Qué desea calcular? \n 1. Área \n 2. Perímetro");
        get = m.nextInt();
        switch (get){
            case 1:
                Circle areaC = new Circle();
                Triangle areaT = new Triangle();
                Square areaS = new Square();
                Rhombus areaR = new Rhombus();

                System.out.println("¿Dé que figura desea calcular su área? \n 1. Círculo \n 2. Triangulo\n 3. Cuadrado\n 4. Rombo");
                figuraArea = m.nextInt();
                switch (figuraArea){
                    case 1:
                        areaC.areaCircle();
                        break;
                    case 2:
                        areaT.areaTriangle();
                        break;
                    case 3:
                        areaS.areaSquare();
                        break;
                    case 4:
                        areaR.areaRhombus();
                        break;
                }
                break;
            case 2:
                Circle perimeterC = new Circle();
                Triangle perimeterT = new Triangle();
                Square perimeterS = new Square();
                Rhombus perimeterR = new Rhombus();

                System.out.println("¿Dé que figura desea calcular su perímetro? \n 1. Círculo \n 2. Triangulo \n 3. Cuadrado\n 4. Rombo");
                figuraPerimetro = m.nextInt();
                switch (figuraPerimetro){
                    case 1:
                        perimeterC.perimeterCircle();
                        break;
                    case 2:
                        perimeterT.perimeterTriangle();
                        break;
                    case 3:
                        perimeterS.perimeterSquare();
                        break;
                    case 4:
                        perimeterR.perimeterRhombus();
                        break;
                }
                break;
        }
    }
}
