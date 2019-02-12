package br.main;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;
		while (numero >= 0) {
			System.out.println("Digite um número positivo: ");
			numero = sc.nextInt();
			if (numero < 0) {
				break;
			}
			verificaVetor(numero);
		}
		sc.close();
	}

	private static void verificaVetor(int numero) {
		boolean primo = false;
		int soma = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				soma += 1;
				if (soma > 2) {
					primo = false;
					break;
				}
			}
		}
		if (soma == 2) {
			primo = true;
		}

		if (primo) {
			System.out.println("É primo");
		} else {
			System.out.println("Não é primo");
		}

	}
}