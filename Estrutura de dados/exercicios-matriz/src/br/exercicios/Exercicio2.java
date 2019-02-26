package br.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int matriz1[][] = new int[2][3];
		int matriz2[][] = new int[2][3];
		int matrizSoma[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {
				System.out.println("Digite um número da matriz 1: ");
				matriz1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[0].length; j++) {
				System.out.println("Digite um número da matriz 2: ");
				matriz2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < matrizSoma.length; i++) {
			for (int j = 0; j < matrizSoma[0].length; j++) {

				matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		
		exibeMatriz(matrizSoma);
		sc.close();

	}

	public static void exibeMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}