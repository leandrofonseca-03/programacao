package com.Unama;

import java.util.Scanner;

public class Simulado_2 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int poupanca, fundos, escolha;
        double valor, investimento;
        poupanca = 1;
        fundos = 2;
        System.out.println("Informe qual seu tipo de investimento.");
        System.out.println("1 - Para Poupança;");
        System.out.println("2 - Para Fundos de renda fixa;");
        System.out.print("Digite sua opção: ");
        escolha = leia.nextInt();
        if (escolha==1){
            System.out.print("Informe o valor de seu investimento: ");
            investimento = leia.nextDouble();
            valor = investimento*0.03;
            valor = investimento+valor;
            System.out.print("Seu saldo corrigado após 1 mês de investimento é: R$"+valor);
        }else if (escolha==2){
            System.out.print("Informe o valor de seu investimento: ");
            investimento = leia.nextDouble();
            valor = investimento*0.04;
            valor = investimento+valor;
            System.out.print("Seu saldo corrigido após 1 mês de investimento é: "+valor);
        }


    }
}
