package java_exercicios_lista1;

import java.util.Scanner;

public class _3_NumeroInteiro_Frase {
	public static void main(String[]args) {
		//3. Escreva um programa que solicite ao usu�rio um n�mero inteiro e ao final apresente na tela
		//o n�mero informado da seguinte forma: "Foi informado o valor: X"
			
		//Declara��o de vari�veis
		Scanner leitor = new Scanner (System.in);
		int numero = 0;
			
		//Entrada de dados
		System.out.println("Digite um n�mero inteiro: ");
		numero = leitor.nextInt();
		
		leitor.close();
			
		//Sa�da de dados
		System.out.println("Foi informado o valor: " + numero + ".");	
		}
}
