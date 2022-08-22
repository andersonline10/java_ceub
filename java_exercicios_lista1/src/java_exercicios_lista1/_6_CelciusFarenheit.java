// 6. Escreva um programa que solicite ao usuário a temperatura em graus Celsius e ao final
// apresente a temperatura correspondente em graus Farenheit. F = Celsius * 1.8 + 32

package java_exercicios_lista1;

import java.util.Scanner;

public class _6_CelciusFarenheit {
	public static void main (String[]args) {
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double celsius = 0;
		double farenheit = 0;
		
		//Entrada de dados
		System.out.print("Informe a temperatura em Celsius: ");
		celsius = leitor.nextDouble();
		
		leitor.close();
		
		//Processamento
		farenheit = (celsius * 1.8) + 32;
		
		//Saída de dados
		
		System.out.printf("A temperatura em Farenheit é de %.2f.", farenheit);
		
	}

}
