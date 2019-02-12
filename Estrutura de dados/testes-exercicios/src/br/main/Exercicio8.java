package br.main;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valores[] = new int[10];
		int soma = 0;

		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite um n�mero: ");
			valores[i] = sc.nextInt();
		}

		System.out.println("Digite um n�mero qualquer: ");
		int numeroChute = sc.nextInt();

		for (int i = 0; i < valores.length; i++) {
			if (numeroChute == valores[i]) {
				soma++;
			}
		}
		if (soma != 0) {
			System.out.println("O n�mero " + numeroChute + " aparece " + soma + " vezes.");
		} else {
			System.out.println("O n�mero " + numeroChute + " n�o existe na lista.");
		}
		
		sc.close();
	}

}
