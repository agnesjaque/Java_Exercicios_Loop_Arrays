package Exercicios_Loop;


/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
        Ex.: 5!=5.4.3.2.1=120*/

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1; // como é multiplicação se colocar 0 vai ser tudo 0

        for (int i = fatorial; i >= 1; i--) { //controle + limitador + ação
            multiplicacao = multiplicacao * i;

        }
        System.out.println(fatorial + "!" + " = " + multiplicacao);
    }
}
