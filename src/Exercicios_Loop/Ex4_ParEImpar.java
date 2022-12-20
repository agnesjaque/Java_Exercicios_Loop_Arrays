package Exercicios_Loop;


import java.util.Scanner;

/*Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0; //mesma coisa que criar dois int

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();


        int count = 0; //contador de vezes que vai entrar no laço

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++; // mesma coisa que count = count + 1 - se não colocar esse contador o count vai ser sempre 0

        }while (count < quantNumeros);//laço vai se repetir na quantidade que colocar nessa variavel

        System.out.println("Quantidade Pares: " + quantPares);
        System.out.println("Quantidade Ímpares: " + quantImpares);
    }
}
