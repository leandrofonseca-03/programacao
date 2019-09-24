package com.Unama;

import java.util.Scanner;

public class Simulado_1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double media, nota1, nota2;
        System.out.print("Insira a primeira nota: ");
        nota1 = leia.nextDouble();
        System.out.print("Insira a segunda a nota: ");
        nota2 = leia.nextDouble();
        media = (nota1+nota2)/2;
        if(media<3) {
            System.out.println("Sua media foi de "+media+", você está reprovado!");
        }else if((media>=3)&&media<7) {
            System.out.println("Sua media foi de "+media+", você ficou de recuperação e fará outro exame!");
        }else {
            System.out.println("Sua média foi de " + media + ", você foi aprovado!");
        }


    }
}
