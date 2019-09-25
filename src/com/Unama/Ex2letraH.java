package com.Unama;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2letraH {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#,##0.00");
        int menu;
        double pH, pM, altH, altF;
        System.out.println("A seguir informe seu sexo: ");
        System.out.println("1 - Masculino;");
        System.out.println("2 - Feminino;");
        menu = leia.nextInt();
        if(menu==1){
            System.out.print("Informe sua altura: ");
            altH = leia.nextFloat();
            pH = (72.7*altH)-58;
            System.out.print("Seu peso ideal é: "+df.format(pH)+"Kg");
        }else if(menu==2){
            System.out.print("Informe sua altura: ");
            altF = leia.nextDouble();
            pM = (62.1*altF)-44.7;
            System.out.print("Seu peso ideal é: "+df.format(pM)+"Kg");

        }else{
            System.out.print("Ação inválida. Saindo.");
        }
    }
}
