package br.main;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lista[] = new int[10];
		int soma = 0;
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Digite um n�mero: ");
			lista[i] = sc.nextInt();
			soma += lista[i];
		}
		double media = soma / lista.length;
		System.out.println("M�dia: " + media);
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] > media) {
				System.out.println("O n�mero " + lista[i] + " est� acima da m�dia");
			}
		}
		sc.close();
	}
}
