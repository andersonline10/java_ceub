package java_exercicios_lista1;

import java.util.Scanner;

public class _12_RealQuadradoCubo {
	public static void main (String[]args) {
		//declaração de variáveis
		Scanner leitor = new Scanner (System.in);
		double x = 0;
		double dobro = 0;
		double quadrado = 0;
		double cubo = 0;
		//entrada de dados
		System.out.print("Informe um número real: ");
		x = leitor.nextDouble();
		leitor.close();
		//processamento
		dobro = x * 2;
		quadrado = Math.pow(x, 2);
		cubo = Math.pow(x, 3);
		//saída de dados
		System.out.printf("Número: %.2f.%n" + "Dobro: %.2f.%n" + "Quadrado: %.2f.%n" + "Cubo: %.2f.%n", x, dobro, quadrado, cubo);
	}

}
