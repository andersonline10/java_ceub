//2. Escreva um programa que solicite ao usu�rio um n�mero real e ao final imprima na tela se
//o n�mero informado � maior ou igual a dez ou menor que 10 (dez)

package java_exercicios_lista2;

import java.util.Scanner;

public class _2_MaiorOuIgualeMenorDez {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		
		System.out.print("Informe um n�mero real: ");
		x = leitor.nextDouble();
		leitor.close();
		
		if (x >= 10 ) {
			System.out.println("O n�mero informado � maior ou igual a 10.");
		}
		else {
			System.out.println("O n�mero informado � menor que 10.");
		}
	}
}
