// 1. Elabore um programa que solicite ao usu�rio um n�mero real e ao final imprima na tela se o
// n�mero informado � maior que 10 (dez)

package java_exercicios_lista2;

import java.util.Scanner;

public class _1_NumeroMaiorDez {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		
		System.out.print("Informe um n�mero real: ");
		x = leitor.nextDouble();
		leitor.close();
		
		if (x > 10) {
			System.out.printf("O n�mero %.2f informado � maior que 10.", x);
			}
		else {
			System.out.printf("O n�mero %.2f informado n�o � maior do que 10.", x);
			}
		}
}