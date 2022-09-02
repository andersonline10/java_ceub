//5. Elabore um algoritmo que leia um número inteiro e imprima uma das mensagens: é múltiplo
//de 3, ou, não é múltiplo de 3

package java_exercicios_lista2;

import java.util.Scanner;

public class _5_MultiploDeTres {
	public static void main (String[]args) {
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		
		System.out.print("Informe um número inteiro: ");
		x = leitor.nextInt();
		leitor.close();
		
		if (x % 3 == 0) {
			System.out.println("O número é múltiplo de 3.");
		}
		else
			System.out.println("O número não é múltiplo de 3.");
	}
}
