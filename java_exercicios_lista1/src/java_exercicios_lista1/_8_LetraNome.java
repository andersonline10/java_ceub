//8. Escreva um programa que solicite ao usu�rio a primeira letra de seu nome e ao final
//apresente na tela a letra informada pelo usu�rio da seguinte forma: "Voce digitou w"

package java_exercicios_lista1;

import java.util.Scanner;

public class _8_LetraNome {
	public static void main(String[]args) {
		//Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		String letra;
		
		//Entrada de dados
		System.out.print("Informe a primeira letra do seu nome: ");
		letra = leitor.next();
		leitor.close();
		
		//Sa�da de dados
		System.out.printf("Voc� informou a letra %s.", letra);
		
	}
	

}
