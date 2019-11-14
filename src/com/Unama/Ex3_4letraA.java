package com.Unama;

import java.util.Scanner;

public class Ex3_4letraA {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int alunos;
        double notas, somaNotas=0;
        System.out.println("Entre com o número de alunos: ");
        alunos = leia.nextInt();
        for(int i=1; i<=alunos;i++){
            System.out.println("Informe a nota do aluno "+i+": ");
                notas = leia.nextDouble();
                somaNotas = somaNotas + notas;

        }
        System.out.println(somaNotas/alunos);
    }
}
