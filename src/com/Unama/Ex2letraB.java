package com.Unama;

import java.util.Scanner;

public class Ex2letraB {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int pecasProduzidas, pecasDefeituosas;
        System.out.print("Informe qual foi a produção total da máquina: ");
        pecasProduzidas = leia.nextInt();
        System.out.print("Informe o número de peças defeituosas: ");
        pecasDefeituosas = leia.nextInt();
        if (pecasDefeituosas>0.1*pecasProduzidas){
            System.out.print("A máquina precisa de manutenção.");
        }else {
            System.out.print("A máquina não precisa de manutenção.");
        }
    }

}
