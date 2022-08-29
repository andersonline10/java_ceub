// 4. Elabore um algoritmo que solicite ao usuário um número real e ao final imprima na tela se o
// número informado é positivo, negativo ou nulo (zero)

package java_exercicios_lista2;

import java.util.Scanner;

public class _4_PositivoNegativoNulo {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		
		System.out.print("Informe um número real: ");
		x = leitor.nextDouble();
		leitor.close();
		
		if (x > 0) {
			System.out.println("O número informado é positivo.");
		}
		else if (x == 0) {
			System.out.println("O número informado é nulo.");
		}
		else {
			System.out.println("O número informado é negativo.");
		}
	}
}
