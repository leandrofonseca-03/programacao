package com.Unama;

import java.util.Scanner;

public class letraF {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int quantidade;
        float preco, total;
        System.out.print("Informe quantos notebook serão comprados: ");
        quantidade = leia.nextInt();
        System.out.print("Informe o preço unitário do produto: ");
        preco = leia.nextFloat();
        total = quantidade * preco;
        System.out.println("O valor a ser pago pelo cliente é: R$"+total);
    }
}
