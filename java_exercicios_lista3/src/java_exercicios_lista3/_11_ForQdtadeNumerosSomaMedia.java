//11. Elabore um algoritmo que leia um número de entrada que indicará a quantidade de
//números a serem lidos. Em seguida, leia n números (conforme o valor informado
//anteriormente) e imprima a soma e a média aritmética dos números informados.

package java_exercicios_lista3;

import java.util.Scanner;

public class _11_ForQdtadeNumerosSomaMedia {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		int qtde = 0;
		int soma = 0;
		double media = 0;
		
		System.out.print("Quantidade de números a serem informados: ");
		qtde = leitor.nextInt();
		
		for (int i=1; i <= qtde; i++) {
			System.out.printf("Informe o %do número: ", i);
			numero = leitor.nextInt();
			soma += numero;	
		}
		
		media = (double) soma / qtde;
		
		System.out.println("Soma: " + soma + ".");
		System.out.printf("A média aritmética é %.2f. ", media);
		
		leitor.close();
	}

}
