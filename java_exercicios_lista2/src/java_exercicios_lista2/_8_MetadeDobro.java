// 8. Elabore um algoritmo que leia um n�mero, e se ele for maior do que 20, imprimir a metade
// desse n�mero, caso contr�rio, imprimir o dobro do n�mero

package java_exercicios_lista2;

import java.util.Scanner;

public class _8_MetadeDobro {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		
		System.out.print("Informe um n�mero real: ");
		x = leitor.nextDouble();
		leitor.close();
		
		if (x >= 20) {
			System.out.println("A metade do n�mero informado � " + (x / 2) + ".");
		}
		if (x < 20) {
			System.out.println("O dobro do n�mero informado � " + (x * 2) + ".");
		}
		
	}

}
