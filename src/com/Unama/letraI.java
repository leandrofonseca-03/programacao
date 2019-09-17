package com.Unama;

import java.util.Scanner;

public class letraI {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double compra, valorDesconto, total;
        System.out.print("Cálculo de desconto.");
        System.out.println(" ");
        System.out.print("Insira o valor da compra: ");
        compra = leia.nextDouble();
        System.out.print("Insira o valor do desconto (ex.: para 10% insira 0,1): ");
        valorDesconto = leia.nextDouble();
        total = compra - (valorDesconto*compra);
        System.out.print("O total a ser pago é: R$"+total);


    }
}
