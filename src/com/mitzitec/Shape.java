package com.mitzitec;

import java.util.Scanner;
public class Shape {
    boolean circleA, triangleA, squareA, rhombusA;
    boolean circleP, triangleP, squareP, rhombusP;
    void getArea(){
        Scanner a = new Scanner(System.in);

        if (circleA == true){
            Circle c1 = new Circle();
            System.out.println("Digíte el radio del circulo: ");
            c1.radio = a.nextDouble();
            c1.area = 3.1416 * (c1.radio * c1.radio);
            System.out.println("El área del circulo es de: " + c1.area);

        }else if(triangleA == true){
            Triangle t1 = new Triangle();
            System.out.println("Digíte la base del triángulo: ");
            t1.base = a.nextDouble();
            System.out.println("Digíte la altura del triángulo: ");
            t1.altura = a.nextDouble();
            t1.area = (t1.base * t1.altura)/2;
            System.out.println("El área del triángulo es de: " + t1.area);

        } else if(squareA == true){
            Square s1 = new Square();
            System.out.println("Digíte la base del cuadrado: ");
            s1.lado = a.nextDouble();
            s1.area = s1.lado * s1.lado;
            System.out.println("El área del cuadrado es de: " + s1.area);

        } else if(rhombusA == true){
            Rhombus r1 = new Rhombus();
            System.out.println("Digíte la diagonal mayor del rombo: ");
            r1.diagonalMayor = a.nextDouble();
            System.out.println("Digíte la diagonal menor del rombo: ");
            r1.diagonalMenor = a.nextDouble();
            r1.area = (r1.diagonalMayor * r1.diagonalMenor)/2;
            System.out.println("El área del rombo es: " + r1.area);

        }

    }
    Scanner b = new Scanner(System.in);

    void getPerimeter(){
        Scanner p = new Scanner(System.in);
        if (circleP == true){
            Circle c2 = new Circle();
            System.out.println("Digíte el radio del circulo: ");
            c2.radio = b.nextDouble();
            c2.perimetro = 2 * 3.1416 * c2.radio;
            System.out.println("El perímetro del circulo es: " + c2.perimetro);
        }else if(triangleP == true){
            Triangle t2 = new Triangle();
            System.out.println("Digíte un lado del triangulo: ");
            t2.lado = b.nextDouble();
            t2.perimetro = t2.lado * 3;
            System.out.println("El perímetro del triángulo es: " + t2.perimetro);
        } else if(squareP == true){
            Square s2 = new Square();
            System.out.println("Digíte un lado del cuadrado: ");
            s2.lado = b.nextDouble();
            s2.perimetro = s2.lado + s2.lado +s2.lado + s2.lado;
            System.out.println("El perímetro del cuadrado es de: " + s2.perimetro);
        } else if(rhombusP == true){
            Rhombus r2 = new Rhombus();
            System.out.println("Digíte un lado del rombo: ");
            r2.lado = b.nextDouble();
            r2.perimetro = r2.lado * 4;
            System.out.println("El perímetro del rombo es de: " + r2.perimetro);


        }

    }
}

