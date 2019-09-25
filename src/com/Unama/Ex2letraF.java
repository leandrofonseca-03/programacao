package com.Unama;

import java.util.Scanner;

public class Ex2letraF {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int a,b;
        System.out.println("Informe dois numeros:");
        a = leia.nextInt();
        b = leia.nextInt();
        if(a>b){
            System.out.print("O número maior é: "+a);
        }else {
            System.out.print("O número maior é: "+b);
        }
    }
}
