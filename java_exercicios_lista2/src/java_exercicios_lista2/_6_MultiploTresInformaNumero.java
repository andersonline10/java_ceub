// 6. Refazer o exercício anterior, solicitando antes o múltiplo a ser testado

package java_exercicios_lista2;

import java.util.Scanner;

public class _6_MultiploTresInformaNumero {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		System.out.print("Informe um número inteiro: ");
		x = leitor.nextInt();
		
		System.out.print("Informe um múltiplo a ser testado: ");
		y = leitor.nextInt();
		leitor.close();
	
		if (x % y == 0) {
			System.out.printf("O número é multiplo de %d.", y);
		}
		else {
			System.out.printf("O número não é multiplo de %d.", y);
		}
	}
}
