package br.main;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int[] diasDoMes = new int[13];
		diasDoMes[0] = 0;
		diasDoMes[1] = 31;
		diasDoMes[2] = 28;
		diasDoMes[3] = 31;
		diasDoMes[4] = 30;
		diasDoMes[5] = 31;
		diasDoMes[6] = 30;
		diasDoMes[7] = 31;
		diasDoMes[8] = 31;
		diasDoMes[9] = 30;
		diasDoMes[10] = 31;
		diasDoMes[11] = 30;
		diasDoMes[12] = 31;
		
		System.out.println("Digite um dia do mês: ");
		int diaDoMes = sc.nextInt();
		System.out.println("Digite um mês: ");
		int mes = sc.nextInt();
		
		for(int i = 0; i < mes; i++) {
			soma += diasDoMes[i];
		}
		int diaDoAno = soma + diaDoMes;
		
		System.out.println("O dia " + diaDoMes + " é o dia "+ diaDoAno + " do ano");
		sc.close();
	}

}
