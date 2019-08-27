package com.Unama;

import java.util.Scanner;

public class LetraB {

    public static void main(String[] args) {
        double numero;
        double dobro;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Bem vindo(a) ao programa de cálculo do dobro");
        System.out.print("Informe o número: ");
        numero = scanner.nextDouble();
        dobro = numero * 2;
        System.out.println("O dobro do número é " + dobro);
        System.out.println(" ");
        System.out.println("Desenvolvido por Leandro Fonscea.");
	// write your code here
    }
}
