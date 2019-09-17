package com.Unama;

import java.util.Scanner;

public class Ex2letraD {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1, n2, n3;
        System.out.print("Insira o primeiro número: ");
        n1 = leia.nextDouble();
        System.out.print("Insira o segundo número: ");
        n2 = leia.nextDouble();
        System.out.print("Insira o terceiro número: ");
        n3 = leia.nextDouble();
        if ((n1 == n2) && (n2 == n3)) {
            System.out.print("Seu triângulo é EQUILÁTERO.");
        } else if ((n1 == n2) && (n2 != n3) || (n2 == n3) && (n1 != n3) || (n1 == n3) && (n2 != n3)) {
            System.out.print("Seu triângulo é ISÓSCELES.");
        }else if((n1!=n2)&&(n2!=n3)&&(n1!=n3)) {
            System.out.print("Seu triângulo é ESCALENO.");
        }
    }
}