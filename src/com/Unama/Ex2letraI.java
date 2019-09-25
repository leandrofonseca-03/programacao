package com.Unama;

import java.util.Scanner;

public class Ex2letraI {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double av1,av2,av3,media,mediaFinal;
        System.out.println("Informe suas notas da Av1, Av2 e Av3: ");
        av1 = leia.nextDouble();
        av2 = leia.nextDouble();
        av3 = leia.nextDouble();
        media = (av1+av2+av3)/3;
        if(media<=3){
            System.out.print("Você foi reprovado!");
        }else if ((media>3)&&(media<7)) {
            System.out.print("Você fará a prova final!");
        }else {
            System.out.print("Você foi aprovado!");
        }
    }
}
