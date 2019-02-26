package br.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		String matriz[][] = new String[5][2];
		Scanner sc = new Scanner(System.in);
		boolean encontrado = false;
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Digite um nome: ");
			matriz[i][0] = sc.nextLine();
			for (int j = 1; j < matriz[0].length; j++) {
				System.out.println("Digite um número de telefone: ");
				matriz[i][j] = sc.nextLine();
			}
		}
		System.out.println("Digite um nome para pesquisar: ");
		String nome = sc.nextLine();
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][0].equals(nome)) {
				System.out.println("Telefone: " + matriz[i][1]);
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("Nome não encontrado :(");
		}

		sc.close();
	}

	public static void exibeMatriz(String matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
