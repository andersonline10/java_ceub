package java_exercicios_lista1;

import java.util.Scanner;

public class _2_NumeroInteiro {
	public static void main(String[]args) {
	//	2. Escreva um programa que solicite ao usu�rio um n�mero inteiro e ao final apresente na tela
	//	o n�mero informado pelo usu�rio do programa
		
		//Declara��o de vari�veis
		Scanner leitor = new Scanner (System.in);
		int numero = 0;
		
		//Entrada de dados
		System.out.println("Digite um n�mero inteiro: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		//Sa�da de dados
		System.out.println("Voc� informou o n�mero " + numero + ".");
		
		
		
	}

}
