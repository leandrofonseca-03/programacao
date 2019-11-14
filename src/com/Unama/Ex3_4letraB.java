package com.Unama;

import java.util.Scanner;

public class Ex3_4letraB {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numPac, maior = 0, idade = 0;
        System.out.println("Informa o número de pacientes: ");
        numPac = leia.nextInt();
        for(int i=1; i<=numPac; i++){
            System.out.println("Informe a idade do paciente "+i+": ");
            idade = leia.nextInt();
            if(idade>maior){
                maior = idade;
            }

        }System.out.println("A idade do paciente mais velho é: "+maior+" anos.");
    }
}
