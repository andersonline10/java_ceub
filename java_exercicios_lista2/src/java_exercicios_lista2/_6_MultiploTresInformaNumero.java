// 6. Refazer o exerc�cio anterior, solicitando antes o m�ltiplo a ser testado

package java_exercicios_lista2;

import java.util.Scanner;

public class _6_MultiploTresInformaNumero {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		System.out.print("Informe um n�mero inteiro: ");
		x = leitor.nextInt();
		
		System.out.print("Informe um m�ltiplo a ser testado: ");
		y = leitor.nextInt();
		leitor.close();
	
		if (x % y == 0) {
			System.out.printf("O n�mero � multiplo de %d.", y);
		}
		else {
			System.out.printf("O n�mero n�o � multiplo de %d.", y);
		}
	}
}
