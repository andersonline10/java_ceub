//4. Escreva um programa que solicite ao usuário dois números inteiros e ao final apresente na
//tela os dois números informados da seguinte forma: "Voce informou os numeros X e Y"

package java_exercicios_lista1;

import java.util.Scanner;

public class _4_NumerosIntXY {
	public static void main (String[] args) {
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		//Entrada de dados
		System.out.print("Digite o primeiro número: ");
		x = leitor.nextInt();
		System.out.print("Digite o segundo número: ");
		y = leitor.nextInt();
		
		leitor.close();
		
		//Saída de dados
		System.out.printf("Os números informados foram %d e %d.", x, y);
	}

}
