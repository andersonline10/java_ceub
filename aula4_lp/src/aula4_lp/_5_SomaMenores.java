package aula4_lp;

import java.util.Scanner;

public class _5_SomaMenores {
	public static void main (String[]args) {
		Scanner leitor = new Scanner(System.in);
		
		int a = 0;
		int b = 0; 
		int c = 0;
		int soma = 0;
		
		System.out.print("Informe o primeiro número: ");
		a = leitor.nextInt();
		
		System.out.print("Informe o segundo número: ");
		b = leitor.nextInt();
		
		System.out.print("Informe o terceiro número: ");
		c = leitor.nextInt();
		
		
		//processamento
		
		if ((a > b) && (a > c)) {
			soma = (b + c);
		}
		else if ((b > a ) && (b > c)) {
			soma = (a + c);
		}
		else {
			soma = (a + b);
		}
		
		//saída de dados
		
		System.out.println("A soma dos dois menores é: " + soma + ".");
		
	}

}
