package Exercices;

import java.util.Scanner;

// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
//mostre:  
//a) a área do triângulo retângulo que tem A por base e C por altura.  
//b) a área do círculo de raio C. (pi = 3.14159)  
//c) a área do trapézio que tem A e B por bases e C por altura.  
//d) a área do quadrado que tem lado B.  
//e) a área do retângulo que tem lados A e B. 


public class Exercice1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangle_area = CalculateTriangleArea(A, C);
        double circle_area = CalculateCircleArea(C);
        double square_area = CalculateSquareArea(B);

        sc.close();
        
        System.out.println("Triangle Area: " + triangle_area);
        System.out.println("Circle Area: " + circle_area);
        System.out.println("Square Area: " + square_area);
    }
    public static double CalculateTriangleArea(double A , double C){

        double area_triangle = A * C;

        return area_triangle;
    }
    public static double CalculateCircleArea( double C){

        double pi = 3.14;
        double area_circle = pi * (Math.pow(C, 2));
        return area_circle;
    }

    public static double CalculateSquareArea( double B){

        double area_square = (Math.pow(B, 2));
        return area_square;
    }
    }

