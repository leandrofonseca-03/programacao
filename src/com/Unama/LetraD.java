package com.Unama;

import java.util.Scanner;

public class LetraD {
    public static void main(String[] args)  {
    double raio;
    double perimetro;
    double area;
    double pi;
    Scanner leia = new Scanner(System.in);
    pi = 3.14;
    System.out.print("Vamos calcular o perímetro e a área de um círculo.");
    System.out.println(" ");
    System.out.println(" ");
    System.out.print("Informe o raio: ");
    raio = leia.nextDouble();
    perimetro = 2*pi*raio;
    area = pi*Math.pow(raio,2);
    System.out.print("O Perímetro é:  " + perimetro+" 5" +"metros" + " e a área é: " + area+"m²");


    }

}
