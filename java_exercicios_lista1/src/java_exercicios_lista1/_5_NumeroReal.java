// 5. Escreva um programa que solicite ao usuário um número real e ao final apresente na tela o
// número informado formatado com duas casas decimais da seguinte forma: "Voce informou
// o numero X.YY"

package java_exercicios_lista1;

import java.util.Scanner;

public class _5_NumeroReal {
	public static void main (String[] args) {
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double numero_real = 0;
		
		//Entrada de dados
		System.out.print("Digite um número real: ");
		numero_real = leitor.nextDouble();
		leitor.close();
		
		//Saída de dados
		System.out.printf("O número informado foi o %.2f.", numero_real);
	}
	

}
