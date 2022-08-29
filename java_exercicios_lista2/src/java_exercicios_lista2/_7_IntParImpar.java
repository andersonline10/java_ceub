// 7. Desenvolva um algoritmo que classifique um número inteiro fornecido pelo usuário como
// par ou ímpar

package java_exercicios_lista2;

import java.util.Scanner;

public class _7_IntParImpar {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		
		System.out.print("Informe um número inteiro: ");
		x = leitor.nextInt();
		leitor.close();
		
		if (x % 2 == 0) {
			System.out.println("O número informado é par.");
		}
		else {
			System.out.println("O número informado é ímpar.");
		}
	}
}
