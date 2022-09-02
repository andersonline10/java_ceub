// 8. Elabore um algoritmo que leia um número, e se ele for maior do que 20, imprimir a metade
// desse número, caso contrário, imprimir o dobro do número

package java_exercicios_lista2;

import java.util.Scanner;

public class _8_MetadeDobro {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		
		System.out.print("Informe um número real: ");
		x = leitor.nextDouble();
		leitor.close();
		
		if (x >= 20) {
			System.out.println("A metade do número informado é " + (x / 2) + ".");
		}
		if (x < 20) {
			System.out.println("O dobro do número informado é " + (x * 2) + ".");
		}
		
	}

}
