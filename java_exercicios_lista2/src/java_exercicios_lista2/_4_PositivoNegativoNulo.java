// 4. Elabore um algoritmo que solicite ao usu�rio um n�mero real e ao final imprima na tela se o
// n�mero informado � positivo, negativo ou nulo (zero)

package java_exercicios_lista2;

import java.util.Scanner;

public class _4_PositivoNegativoNulo {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		
		System.out.print("Informe um n�mero real: ");
		x = leitor.nextDouble();
		leitor.close();
		
		if (x > 0) {
			System.out.println("O n�mero informado � positivo.");
		}
		else if (x == 0) {
			System.out.println("O n�mero informado � nulo.");
		}
		else {
			System.out.println("O n�mero informado � negativo.");
		}
	}
}
