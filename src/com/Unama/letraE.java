package com.Unama;

import java.util.Scanner;

public class letraE {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double tvendas, tcomis;
        System.out.println("Qual o total de suas vendas?");
        tvendas = leia.nextFloat();
        tcomis = tvendas*0.1;
        System.out.print("Sua comissão é de: R$"+tcomis);


    }
}
