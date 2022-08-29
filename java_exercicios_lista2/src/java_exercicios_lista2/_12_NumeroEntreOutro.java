// 12. Elabore um algoritmo que indique se um número digitado está compreendido entre 20 e
// 90, ou não

package java_exercicios_lista2;

import java.util.Scanner;

public class _12_NumeroEntreOutro {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		
		System.out.print("Informe um número real: ");
		x = leitor.nextDouble();
		leitor.close();
		
		if (x >= 20 && x <=90) {
			System.out.println("O número informado está compreendido entre 20 e 90.");
		}
		else {
			System.out.println("O número informado não está compreendido entre 20 e 90.");
		}
		
	}
}
