//13. Elabore um algoritmo que leia dois n�meros e imprima qual � maior, qual � menor, ou se
//s�o iguais

package java_exercicios_lista2;

import java.util.Scanner;

public class _13_MaiorMenorIgual {
	public static void main (String[]args){
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		double y = 0;
		
		System.out.print("Informe o primeiro n�mero: ");
		x = leitor.nextDouble(); 
		
		System.out.print("Informe o segundo n�mero: " );
		y = leitor.nextDouble();
		
		leitor.close();
		
		if (x > y) {
			System.out.printf("O primeiro n�mero %.2f � maior do que o segundo %.2f.", x, y);
		}
		else if (y > x) {
			System.out.printf("O segundo n�mero %.2f � maior do que o primeiro %.2f.", y, x);
		}
		else
			System.out.printf("O primeiro e o segundo n�mero s�o iguais.");
	}

}
