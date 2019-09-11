package com.Unama;

import java.util.Scanner;

public class letraA {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Qual é o seu nome?");
        nome = leia.next();
        System.out.println("Qual a sua idade?");
        idade = leia.nextInt();
        System.out.print("Seu nome é "+nome+" e você tem "+idade+" anos");

    }
}
