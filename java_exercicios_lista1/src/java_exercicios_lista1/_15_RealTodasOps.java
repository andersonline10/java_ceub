// 15. Refazer o programa 14 realizando as quatro opera��es aritm�ticas b�sicas

package java_exercicios_lista1;

import java.util.Scanner;

public class _15_RealTodasOps {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		double y = 0;
		double soma = 0;
		double subtracao = 0;
		double produto = 0;
		double divisao = 0;
		
		System.out.print("Informe o primeiro n�mero real: ");
		x = leitor.nextDouble();
		System.out.print("Informe o segundo n�mero real: ");
		y = leitor.nextDouble();
		leitor.close();
		
		soma = x+y;
		subtracao = x-y;
		produto = x*y;
		divisao = x/y;
		
		System.out.printf("A soma dos n�meros %.2f e %.2f corresponde a %.2f .%n", x, y, soma);
		System.out.printf("A subtra��o dos n�meros %.2f e %.2f corresponde a %.2f .%n", x, y, subtracao);
		System.out.printf("O produto dos n�meros %.2f e %.2f corresponde a %.2f .%n", x, y, produto);
		System.out.printf("A divis�o dos n�meros %.2f e %.2f corresponde a %.2f .%n", x, y, divisao);
	}
	

}
