//8. Escreva um programa que solicite ao usuário a primeira letra de seu nome e ao final
//apresente na tela a letra informada pelo usuário da seguinte forma: "Voce digitou w"

package java_exercicios_lista1;

import java.util.Scanner;

public class _8_LetraNome {
	public static void main(String[]args) {
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		String letra;
		
		//Entrada de dados
		System.out.print("Informe a primeira letra do seu nome: ");
		letra = leitor.next();
		leitor.close();
		
		//Saída de dados
		System.out.printf("Você informou a letra %s.", letra);
		
	}
	

}
