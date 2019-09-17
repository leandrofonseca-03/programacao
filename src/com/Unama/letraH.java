package com.Unama;

import java.util.Scanner;

public class letraH {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
            double salarioAtual, reajuste, salarioReajus;
            System.out.print("Cálculo do reajuste salarial do servidor.");
            System.out.println(" ");
            System.out.println(" ");
            System.out.print("Insira seu salário atual: ");
            salarioAtual = leia.nextDouble();
            System.out.print("Insira o valor do reajuste (ex.: para 10% digite 0.1): ");
            reajuste = leia.nextDouble();
            salarioReajus = (salarioAtual*reajuste) + salarioAtual;
            System.out.print("Seu salário reajustado é de: "+ salarioReajus);

    }
}
