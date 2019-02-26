package br.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		int vetor[] = new int[3];
		int soma = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println("Digite um número: ");
				matriz[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < matriz[0].length; i++) {

			for (int j = 0; j < matriz.length; j++) {
				soma += matriz[j][i];
			}
			vetor[i] = soma;
			soma = 0;

		}

		exibeMatriz(vetor);
		sc.close();
	}

	public static void exibeMatriz(int matriz[]) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i] + " ");
		}
	}
}
