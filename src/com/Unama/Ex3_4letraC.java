package com.Unama;

import java.util.Scanner;

public class Ex3_4letraC {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double capital, juros, montante;
        int meses;
        System.out.println("Informe quantos meses você quer calcular: ");
        meses = leia.nextInt();
        System.out.println("Informe seu capital inicial para o cálculo: ");
        capital = leia.nextDouble();
        System.out.println("Informe a taxa de juros mensal: ");
        juros = leia.nextDouble();
        for(int i=1; i<=meses; i++){
            montante = (juros*capital)+capital;
            capital = montante;
            System.out.println("O montante no mês "+meses+" foi de R$"+montante);

        }
    }
}

