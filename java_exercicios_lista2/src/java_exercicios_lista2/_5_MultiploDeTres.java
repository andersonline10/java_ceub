//5. Elabore um algoritmo que leia um n�mero inteiro e imprima uma das mensagens: � m�ltiplo
//de 3, ou, n�o � m�ltiplo de 3

package java_exercicios_lista2;

import java.util.Scanner;

public class _5_MultiploDeTres {
	public static void main (String[]args) {
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		
		System.out.print("Informe um n�mero inteiro: ");
		x = leitor.nextInt();
		leitor.close();
		
		if (x % 3 == 0) {
			System.out.println("O n�mero � m�ltiplo de 3.");
		}
		else
			System.out.println("O n�mero n�o � m�ltiplo de 3.");
	}
}
