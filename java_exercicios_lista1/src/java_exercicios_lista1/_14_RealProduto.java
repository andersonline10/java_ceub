package java_exercicios_lista1;

import java.util.Scanner;

public class _14_RealProduto {
	public static void main(String[]args) {
		//declara��o
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		double y = 0;
		double produto = 0;
		//entrada
		System.out.print("Informe o primeiro n�mero real: ");
		x = leitor.nextDouble();
		System.out.print("Informe o segundo n�mero real: ");
		y = leitor.nextDouble();
		leitor.close();
		//processamento
		produto = x * y;
		//sa�da
		System.out.printf("O produto dos n�meros %.2f e %.2f corresponde a %.2f.", x, y, produto);
	}

}
