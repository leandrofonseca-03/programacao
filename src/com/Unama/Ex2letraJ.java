package com.Unama;

import java.util.Scanner;

public class Ex2letraJ {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1,n2,soma,raiz;
        int escolha;
        soma = 1;
        raiz = 2;
        System.out.println("Escolha qual operação quer realizar: ");
        System.out.println("1 - Para soma;");
        System.out.println("2 - Para raiz quadrada.");
        escolha = leia.nextInt();
        if(escolha==1){
            System.out.print("Insira o primeiro número: ");
            n1 = leia.nextDouble();
            System.out.print("Insira o segundo número: ");
            n2 = leia.nextDouble();
            soma = n1+n2;
            System.out.print("A soma dos dois números é "+soma);
        }else if (escolha==2){
            System.out.print("Insira o número: ");
            n1 = leia.nextDouble();
            System.out.println("A raiz quadrada é "+Math.sqrt(n1));

        }


    }
}
