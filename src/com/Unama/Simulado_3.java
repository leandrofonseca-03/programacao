package com.Unama;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Simulado_3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
        double preco, desconto,valorFinal;
        int codigo;
        System.out.print("Informe o preço do produto: R$ ");
        preco = leia.nextDouble();
        System.out.print("Informe o código do produto: ");
        codigo = leia.nextInt();
        if (preco<30) {
            System.out.print("Você não terá desconto.");
        }else if((preco>=30)&&(preco<=100)) {
            desconto = (preco*0.1);
            valorFinal = preco-desconto;
            System.out.print("Você teve um desconto de R$"+df.format(desconto)+" e irá pagar: R$"+df.format(valorFinal));

        }else {
            desconto = (preco*0.15);
            valorFinal = preco-desconto;
            System.out.print("Você teve um desconto de R$"+df.format(desconto)+" e irá pagar: R$"+df.format(valorFinal));
        }
    }
}
