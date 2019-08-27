package com.Unama;

import java.util.Scanner;

public class LetraC {
    public static void main(String[] args)  {
    double base;
    double altura;
    double area;

    Scanner leia = new Scanner(System.in);
    System.out.print("Informe a base: ");
    base = leia.nextDouble();
    System.out.print("Informe a altura: ");
    altura = leia.nextDouble();
    area = (base*altura)/2;
    System.out.println("A área do triângulo é: " + area+"m²");



    }
}
