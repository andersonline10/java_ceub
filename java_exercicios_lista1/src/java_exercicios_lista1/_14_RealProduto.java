package java_exercicios_lista1;

import java.util.Scanner;

public class _14_RealProduto {
	public static void main(String[]args) {
		//declaração
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		double y = 0;
		double produto = 0;
		//entrada
		System.out.print("Informe o primeiro número real: ");
		x = leitor.nextDouble();
		System.out.print("Informe o segundo número real: ");
		y = leitor.nextDouble();
		leitor.close();
		//processamento
		produto = x * y;
		//saída
		System.out.printf("O produto dos números %.2f e %.2f corresponde a %.2f.", x, y, produto);
	}

}
