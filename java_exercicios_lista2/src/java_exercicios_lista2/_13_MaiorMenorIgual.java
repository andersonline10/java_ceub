//13. Elabore um algoritmo que leia dois números e imprima qual é maior, qual é menor, ou se
//são iguais

package java_exercicios_lista2;

import java.util.Scanner;

public class _13_MaiorMenorIgual {
	public static void main (String[]args){
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		double y = 0;
		
		System.out.print("Informe o primeiro número: ");
		x = leitor.nextDouble(); 
		
		System.out.print("Informe o segundo número: " );
		y = leitor.nextDouble();
		
		leitor.close();
		
		if (x > y) {
			System.out.printf("O primeiro número %.2f é maior do que o segundo %.2f.", x, y);
		}
		else if (y > x) {
			System.out.printf("O segundo número %.2f é maior do que o primeiro %.2f.", y, x);
		}
		else
			System.out.printf("O primeiro e o segundo número são iguais.");
	}

}
