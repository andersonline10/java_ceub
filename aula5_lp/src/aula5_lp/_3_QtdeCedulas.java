package aula5_lp;

import java.util.Scanner;

public class _3_QtdeCedulas {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int valor = 0;
		int qtdeNota200 = 0;
		int qtdeNota100 = 0;
		int qtdeNota50= 0;
		int qtdeNota20= 0;
		int qtdeNota10 = 0;
		int qtdeNota5= 0;
		int qtdeNota2 = 0;
		int qtdeNota1= 0;
		
		System.out.print("Informe o valor a ser sacado: ");
		valor = leitor.nextInt();
		
		leitor.close();
		
		qtdeNota200 = (valor / 200);
		valor = (valor % 200);
		
		qtdeNota100 = (valor / 100);
		valor = (valor % 100);
		
		qtdeNota50 = (valor / 50);
		valor = (valor % 50);
		
		qtdeNota20 = (valor / 20);
		valor = (valor % 20);
		
		qtdeNota10 = (valor / 10);
		valor = (valor % 10);
		
		qtdeNota5 = (valor / 5);
		valor = (valor % 5);
		
		qtdeNota2 = (valor / 2);
		valor = (valor % 2);
		
		qtdeNota1 = (valor / 1);
		
		
		
		if (qtdeNota200 > 0) {
			System.out.println(qtdeNota200 + " nota(s) de 200");
		}

		if (qtdeNota100 > 0) {
			System.out.println(qtdeNota100 + " nota(s) de 100");
		}
		if (qtdeNota50 > 0) {
			System.out.println(qtdeNota50 + " nota(s) de 50");
		}
		if (qtdeNota20 > 0) {
			System.out.println(qtdeNota20 + " nota(s) de 20");
		}
		if (qtdeNota10 > 0) {
			System.out.println(qtdeNota10 + " nota(s) de 10");
		}
		if (qtdeNota5 > 0) {
			System.out.println(qtdeNota5 + " nota(s) de 5");
		}
		if (qtdeNota2 > 0) {
			System.out.println(qtdeNota2 + " nota(s) de 2");
		}
		if (qtdeNota1 > 0) {
			System.out.println(qtdeNota1 + " nota(s) de 1");
		}

		
		
	}

}
