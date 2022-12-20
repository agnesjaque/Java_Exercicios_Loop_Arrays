package Exercicios_Array;

import java.util.Scanner;

//Faça um Programa que leia um vetor de 6 caracteres,
// e diga quantas consoantes foram lidas. Imprima as consoantes.
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6]; //quantidade de caracteres

        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") | //! quer que puxe o que não for o que está entre parenteses
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u")));{
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        }while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes ) { //primeiro é o tipo e depois o array que ele vai navegar
        // para cada elemento dentro do array eu quero que voce imprima a consoante
            System.out.print(consoante + " ");
        }
    }
}
