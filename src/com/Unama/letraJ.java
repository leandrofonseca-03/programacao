package com.Unama;

import java.util.Scanner;

public class letraJ {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double real, cotacao, dolar;
        System.out.print("Insira o valor em reais: BRL ");
        real = leia.nextDouble();
        cotacao = 4.08;
        dolar = real*cotacao;
        System.out.print("O valor em dolar é de: USD "+dolar);


    }
}
