package com.Unama;

import java.util.Scanner;

public class exer2letraA {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int totalC;
        double totalP;
        System.out.print("Informe o número de cópias que vocÊ quer: ");
        totalC = leia.nextInt();
        if (totalC <= 100){
            totalP=totalC*0.25;
        }else {
            totalP=totalC*0.20;
        }
        System.out.println("O valor a ser pago é: "+ totalP);
    }
}
