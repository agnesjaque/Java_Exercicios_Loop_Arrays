package Exercicios_Array;


//Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
public class Ex1_OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println("Vetor: ");

        int count = 0;

        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println("\nVetor invertido: ");
        for (int i = (vetor.length - 1); i >= 0; i--){//tem que ser -1 pois o cumprimento é de 6 mas as posições são de 0 a 5
            System.out.print(vetor[i] + " "); // tira o ln para não quebrar a linha

        }
    }
}
