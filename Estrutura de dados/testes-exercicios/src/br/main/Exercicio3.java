package br.main;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número entre 3 e 10");
		int valor = sc.nextInt();
		double mediaTotal = 0;
		double mediaMinima = 10;
		double mediaMaxima = 0;
		while (valor >= 3 == false || valor <= 10 == false) {
			System.out.println("Digite um número válido");
			valor = sc.nextInt();
		}
		for (int i = 1; i <= valor; i++) {
			System.out.println("Digite a nota continuada do aluno " + i + ": ");
			double notaContinuada = sc.nextDouble();
			System.out.println("Digite a nota semestral do aluno " + i + ": ");
			double notaSemestral = sc.nextDouble();

			double media = calculaMedia(notaContinuada, notaSemestral);
			if (media < 5) {
				System.out.println("Reprovado");
				System.out.println("Média: " + media);
			} else {
				System.out.println("Aprovado");
				System.out.println("Média: " + media);

			}
			
			if (media< mediaTotal / i) {
				
			}
			mediaTotal+= media;
			if (media < mediaMinima) {
				mediaMinima = media;
			} else if(media > mediaMaxima) {
				mediaMaxima = media;
			}
			
		}
		System.out.println("Média das médias: " + mediaTotal/valor);
		System.out.println("Media minima: " + mediaMinima);
		System.out.println("Media maxima: " + mediaMaxima);
		sc.close();
	}

	private static double calculaMedia(double notaContinuada, double notaSemestral) {
		double media = notaContinuada * 0.4f + notaSemestral * 0.6f;
		return media;
	}

}
