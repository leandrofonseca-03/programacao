package com.Unama;

import java.util.Scanner;

public class Ex3_4letraD {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int eleitores, op, a = 0, b = 0, c= 0 , nulo= 0;
        System.out.println("Informe o número de eleitores: ");
        eleitores = leia.nextInt();
        for(int i=1;i<=eleitores; i++) {

                System.out.println("####Escolha seu candidato####");
                System.out.println("--"+i+"° eleitor: --");
                System.out.println("1 - Para candidato a;");
                System.out.println("2 - Para candidato b;");
                System.out.println("3 - Para candidato c;");
                System.out.println("4 - Para voto nulo.");
                op = leia.nextInt();

                if (op==1){
                    a++;
                }else if(op==2){
                    b++;
                }else if(op==3){
                    c++;
                }else {
                    nulo++;
            }


            }
        System.out.println("Candidato 'a' recebeu "+a+" votos");
        System.out.println("Candidato 'b' recebeu "+b+" votos");
        System.out.println("Candidato 'c' recebeu "+c+" votos");
        System.out.println("Votos nulos: "+nulo);
    }
}
