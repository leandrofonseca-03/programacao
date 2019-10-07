package com.Unama;

import java.util.Scanner;

public class Ex2letraK {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int escolha;
        double salario, reajuste;
        System.out.println("Escolha seu cargo: ");
        System.out.println("1 - Escriturário;");
        System.out.println("2 - Secretário;");
        System.out.println("3 - Caixa;");
        System.out.println("4 - Gerente;");
        System.out.println("5 - Diretor;");
        System.out.println("6 - Sair.");
        escolha = leia.nextInt();
        if (escolha==1){
            System.out.println("ESCRITURÁRIO");
            System.out.println("Insira seu salário atual: ");
            salario = leia.nextDouble();
            reajuste = (salario*0.5)+salario;
            System.out.print("Você terá um reajuste de 50%. Seu salário será de : "+reajuste);
        }else if(escolha==2){
            System.out.println("SECRETÁRIO");
            System.out.println("Insira seu salário atual: ");
            salario = leia.nextDouble();
            reajuste = (salario*0.35)+salario;
            System.out.print("Você terá um reajuste de 35%. Seu salário será de: "+reajuste);
        }else if (escolha==3){
            System.out.println("CAIXA");
            System.out.println("Insira seu salário atual: ");
            salario = leia.nextDouble();
            reajuste = (salario*0.2)+salario;
            System.out.print("Você terá um reajuste de 20%. Seu salário será de: "+reajuste);
        }else if(escolha==4){
            System.out.println("GERENTE");
            System.out.println("Insira seu salário atual: ");
            salario = leia.nextDouble();
            reajuste = (salario*0.1)+salario;
            System.out.println("Você será um reajuste de 10%. Seu salário será de: "+reajuste);
        }else if (escolha==5){
            System.out.println("DIRETOR");
            System.out.println("Você não terá reajuste.");
        }else if(escolha==6){
            System.out.println("Saindo...");
        }else {
            System.out.println("Opção inválida. Saindo...");
        }
    }
}
