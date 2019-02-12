package br.main;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomes[] = new String[10];
		boolean nomeExiste = false;
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite um nome: ");
			nomes[i] = sc.nextLine();
		}
		System.out.println("Digite um nome da lista");
		String sugestao = sc.nextLine();
		
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(sugestao)) {
				System.out.println(i);
				nomeExiste = true;
			}
		}
		if(!nomeExiste) {
			System.out.println("Nome inexistente");
		}
		sc.close();

	}

}
