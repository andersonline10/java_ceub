package java_exercicios_lista1;

import java.util.Scanner;

public class _3_NumeroInteiro_Frase {
	public static void main(String[]args) {
		//3. Escreva um programa que solicite ao usuário um número inteiro e ao final apresente na tela
		//o número informado da seguinte forma: "Foi informado o valor: X"
			
		//Declaração de variáveis
		Scanner leitor = new Scanner (System.in);
		int numero = 0;
			
		//Entrada de dados
		System.out.println("Digite um número inteiro: ");
		numero = leitor.nextInt();
		
		leitor.close();
			
		//Saída de dados
		System.out.println("Foi informado o valor: " + numero + ".");	
		}
}
