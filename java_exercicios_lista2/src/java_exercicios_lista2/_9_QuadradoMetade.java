//9. Elabore um algoritmo que leia dois n�meros inteiros e realize a adi��o; caso o resultado
// seja maior que 10, imprima o quadrado do resultado, caso contr�rio, imprima a metade dele

package java_exercicios_lista2;

import java.util.Scanner;

public class _9_QuadradoMetade {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int resultado = 0;
		int quadrado = 0;
		
		System.out.print("Informe o primeiro n�mero inteiro: ");
		x = leitor.nextInt();
		System.out.print("Informe o segundo n�mero inteiro: ");
		y = leitor.nextInt();
		leitor.close();
		
		resultado = x + y;
		quadrado = (int) Math.pow(resultado,2);
	
		if (resultado >= 10) {
			System.out.printf("O quadrado da soma dos n�meros informados � " + ((int) Math.pow(resultado,2)) + ".");
		}	
		if (resultado < 10) {
			System.out.println("A metade da soma dos n�meros informados � " + (resultado/2) + ".");
		}
	}
}
