package br.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.println("Digite um número: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
