package java_exercicios_lista1;

import java.util.Scanner;

public class _2_NumeroInteiro {
	public static void main(String[]args) {
	//	2. Escreva um programa que solicite ao usuário um número inteiro e ao final apresente na tela
	//	o número informado pelo usuário do programa
		
		//Declaração de variáveis
		Scanner leitor = new Scanner (System.in);
		int numero = 0;
		
		//Entrada de dados
		System.out.println("Digite um número inteiro: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		//Saída de dados
		System.out.println("Você informou o número " + numero + ".");
		
		
		
	}

}
