package com.Unama;

import java.util.Scanner;

public class letraG {
    public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    double comprimento, largura, area;
    System.out.print("Digite o valor do comprimento: ");
    comprimento = leia.nextDouble();
    System.out.print("Digite o valor da largura: ");
    largura = leia.nextDouble();
    area = comprimento * largura;
    System.out.print("O valor da área é de: "+area+"m²");

    }
}