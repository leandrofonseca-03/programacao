package com.Unama;

import java.util.Scanner;

public class Ex2letraE {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double media;
        int faltas;
        System.out.print("informe quantas vezes você faltou: ");
        faltas = leia.nextInt();
        System.out.print("Informe qual foi a sua media anual: ");
        media = leia.nextDouble();
        if (faltas >= 40) {
            System.out.print("Você foi reprovado por passar do limite de faltas.");
        } else if (media < 6.0) {
            System.out.print("Você ficou de recuperação por não tirar a media suficiente.");
        } else {
            System.out.print("Você foi aprovado!");
        }

    }
}

