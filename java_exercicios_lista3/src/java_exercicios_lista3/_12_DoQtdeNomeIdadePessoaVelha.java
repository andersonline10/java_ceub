// 12. Elabore um algoritmo que leia um número de entrada que indicará a quantidade de
// registros a serem lidos (N). Em seguida algoritmo deve solicitar o nome e idade de N
// pessoas e ao final apresentar o nome da pessoa mais velha.

package java_exercicios_lista3;

import java.util.Scanner;

public class _12_DoQtdeNomeIdadePessoaVelha {
	
	public static void main (String[]args) {
		Scanner leitor = new Scanner(System.in);
		int qtde = 0;
		String nome;
		String nome_velho = null;
		int idade = 0;
		int idade_velho = 0;
		
		System.out.print("Informe a quantidade de registros a serem lidos: ");
		qtde = leitor.nextInt();
		
		for(int i = 1; i <=qtde; i++) {
			System.out.printf("Informe o nome da %da pessoa: ", i);
			nome = leitor.next();
			System.out.printf("Informe a idade da %da pessoa: ", i);
			idade = leitor.nextInt();
			
			if (idade_velho < idade) {
				idade_velho = idade;
				nome_velho = nome;
			}
		}
		leitor.close();
		System.out.printf("O nome da pessoa mais velha é %s com %d anos.", nome_velho, idade_velho);
	}

}
