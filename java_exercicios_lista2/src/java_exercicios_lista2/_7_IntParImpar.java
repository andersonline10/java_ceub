// 7. Desenvolva um algoritmo que classifique um n�mero inteiro fornecido pelo usu�rio como
// par ou �mpar

package java_exercicios_lista2;

import java.util.Scanner;

public class _7_IntParImpar {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		
		System.out.print("Informe um n�mero inteiro: ");
		x = leitor.nextInt();
		leitor.close();
		
		if (x % 2 == 0) {
			System.out.println("O n�mero informado � par.");
		}
		else {
			System.out.println("O n�mero informado � �mpar.");
		}
	}
}
