package com.Unama;

import java.util.Scanner;

public class Ex2letraF {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        float a,b;
        System.out.println("Informe dois numeros:");
        a = leia.nextFloat();
        b = leia.nextFloat();
        if(a>b){
            System.out.print("O número maior é: "+a);
        }else {
            System.out.print("O número maior é: "+b);
        }
    }
}
