package br.main;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lista[] = new int[7];

		for (int i = 0; i < lista.length; i++) {
			System.out.println("Digite um número: ");
			lista[i] = sc.nextInt();
		}
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		System.out.println(" ");
		for (int i = lista.length - 1; i >= 0; i--) {
			System.out.println(lista[i]);
		}
		sc.close();
	}
}