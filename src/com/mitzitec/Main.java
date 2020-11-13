package com.mitzitec;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int get, figuraArea, figuraPerimetro;
        double part1 = 0, part2 = 0, part3 = 0; //Las partes de la figura
        Scanner m = new Scanner(System.in);
        System.out.println("Bienvenido\n ¿Qué desea calcular? \n 1. Área \n 2. Perímetro");
        get = m.nextInt();
        switch (get){
            case 1:
                System.out.println("¿Dé que figura desea calcular su área? \n 1. Círculo \n 2. Triangulo\n 3. Cuadrado\n 4. Rombo");
                figuraArea = m.nextInt();
                switch (figuraArea){
                    case 1:
                        System.out.println("Digite el el radio del Circulo:");
                        part1 = m.nextDouble();
                        Circle C1= new Circle(part1);
                        System.out.println("El área del Circulo es: "+ C1.getArea());
                        break;
                    case 2:
                        System.out.println("Digite la base del Triangulo: ");
                        part1 = m.nextDouble();
                        System.out.println("Digite la altura del Triangulo: ");
                        part2= m.nextDouble();
                        Triangle t1= new Triangle(part1,part2);
                        System.out.println("El área del Triangulo es: "+ t1.getArea());
                        break;
                    case 3:
                        System.out.println("Digite un lado del Cuadrado:");
                        part1= m.nextDouble();
                        Square s1= new Square(part1);
                        System.out.println("El área del Cuadrado es: "+ s1.getArea());
                        break;
                    case 4:
                        System.out.println("Digite la diagonal mayor:");
                        part1 = m.nextDouble();
                        System.out.println("Digite la diagonal mayor:");
                        part2 = m.nextDouble();
                        Rhombus r1= new Rhombus(part1, part2, part3);
                        System.out.println("El área del Rombo es: "+ r1.getArea());
                        break;
                }
                break;
            case 2:

                System.out.println("¿Dé que figura desea calcular su perímetro? \n 1. Círculo \n 2. Triangulo\n 3. Cuadrado\n 4. Rombo");
                figuraPerimetro = m.nextInt();
                switch (figuraPerimetro){
                    case 1:
                        System.out.println("Digite el radio del Circulo:");
                        part1 = m.nextDouble();
                        Circle C1= new Circle(part1);
                        System.out.println("El perímetro del Circulo es: "+ C1.getPerimeter());
                        break;
                    case 2:
                        System.out.println("Digite un lado del Triangulo: ");
                        part1 = m.nextDouble();
                        Triangle t1= new Triangle(part1,part2);
                        System.out.println("El perímetro del Triangulo es: "+ t1.getPerimeter());
                        break;
                    case 3:
                        System.out.println("Digite un lado del Cuadrado:");
                        part1 = m.nextDouble();
                        Square s1= new Square(part1);
                        System.out.println("El perímetro del Cuadrado es: "+ s1.getPerimeter());
                        break;
                    case 4:
                        System.out.println("Digite un lado del Rombo:");
                        part3 = m.nextDouble();
                        Rhombus r1= new Rhombus(part1, part2, part3);
                        System.out.println("El perímetro del Rombo es: "+ r1.getPerimeter());
                        break;
                }
                break;
        }
    }
}

