// 1. Elabore um programa que solicite ao usuário um número real e ao final imprima na tela se o
// número informado é maior que 10 (dez)

package java_exercicios_lista2;

import java.util.Scanner;

public class _1_NumeroMaiorDez {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		
		System.out.print("Informe um número real: ");
		x = leitor.nextDouble();
		leitor.close();
		
		if (x > 10) {
			System.out.printf("O número %.2f informado é maior que 10.", x);
			}
		else {
			System.out.printf("O número %.2f informado não é maior do que 10.", x);
			}
		}
}