//4. Escreva um programa que solicite ao usu�rio dois n�meros inteiros e ao final apresente na
//tela os dois n�meros informados da seguinte forma: "Voce informou os numeros X e Y"

package java_exercicios_lista1;

import java.util.Scanner;

public class _4_NumerosIntXY {
	public static void main (String[] args) {
		//Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		//Entrada de dados
		System.out.print("Digite o primeiro n�mero: ");
		x = leitor.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		y = leitor.nextInt();
		
		leitor.close();
		
		//Sa�da de dados
		System.out.printf("Os n�meros informados foram %d e %d.", x, y);
	}

}
