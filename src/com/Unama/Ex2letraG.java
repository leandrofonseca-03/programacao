package com.Unama;

import java.util.Scanner;

public class Ex2letraG {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int numero;
        System.out.print("Insira qualquer número inteiro: ");
        numero = leia.nextInt();
        if(numero % 2 == 0){
            System.out.print("O número é par!");
        }else {
            System.out.print("O número é ímpar!");
        }
    }
}
