package com.Unama;

import java.util.Scanner;

public class Ex2letraC {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int idade;
        String nome;
        System.out.println("Olá! Bem vindo(a) à escolinha de natação LAL!");
        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.print("Vamos à matrícula? Por favor, escreva seu nome: ");
        nome = leia.next();
        System.out.print("Agora nos informe a sua idade: ");
        idade = leia.nextInt();
        if (idade<10){
            System.out.print("Parabéns, "+nome+"! Você está matriculado(a) na categoria Infantil.");

        }else if ((idade>=10)&&(idade<=17)){
            System.out.print("Parabéns, "+nome+"! Você está matriculado(a) na categoria Juvenil.");
        }else if(idade>17) {
            System.out.print("Parabéns, " + nome + "! Você está matriculado(a) na categoria Senior.");
        }
    }
}