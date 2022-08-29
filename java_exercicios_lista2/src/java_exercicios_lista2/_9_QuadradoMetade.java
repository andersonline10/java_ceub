//9. Elabore um algoritmo que leia dois números inteiros e realize a adição; caso o resultado
// seja maior que 10, imprima o quadrado do resultado, caso contrário, imprima a metade dele

package java_exercicios_lista2;

import java.util.Scanner;

public class _9_QuadradoMetade {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int resultado = 0;
		int quadrado = 0;
		
		System.out.print("Informe o primeiro número inteiro: ");
		x = leitor.nextInt();
		System.out.print("Informe o segundo número inteiro: ");
		y = leitor.nextInt();
		leitor.close();
		
		resultado = x + y;
		quadrado = (int) Math.pow(resultado,2);
	
		if (resultado >= 10) {
			System.out.printf("O quadrado da soma dos números informados é " + ((int) Math.pow(resultado,2)) + ".");
		}	
		if (resultado < 10) {
			System.out.println("A metade da soma dos números informados é " + (resultado/2) + ".");
		}
	}
}
