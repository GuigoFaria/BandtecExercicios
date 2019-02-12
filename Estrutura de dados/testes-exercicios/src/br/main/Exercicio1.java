package br.main;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostraMensagem();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 4) {

			switch (n) {
			case 1:
				for (int i = 0; i <= 20; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					}
				}
				mostraMensagem();
				n = sc.nextInt();
				continue;
			case 2:
				int i = 1;
				int soma = 0;
				while (i <= 10) {
					System.out.println("Digite um numero: ");
					int numero = sc.nextInt();
					soma += numero;
					i++;

				}
				System.out.println(soma);
				mostraMensagem();
				n = sc.nextInt();
				continue;
			case 3:
				int pares = 0;
				int numero;
				do {
					System.out.println("Digite um  número positivo: ");
					numero = sc.nextInt();
					if (numero % 2 == 0) {
						pares++;
					}
				} while (numero >= 0);
				System.out.println(pares);
				mostraMensagem();
				n = sc.nextInt();
				continue;
			default:
				System.out.println("Digite algo válido");
				n = sc.nextInt();
				continue;
			}
		}
		sc.close();

	}

	private static void mostraMensagem() {
		String mensagem = "Digite o número do programa que você quer\n" + "(1)Exibir números pares de 0 a 20 com for\n"
				+ "(2)Ler 10 números com while e exibir a soma dos números\n"
				+ "(3)Ler vários números com while e exibir a quantia de números pares\n"
				+ "positivos nos números digitados\n" + "(4)Sair : ";

		System.out.println(mensagem);
	}
}