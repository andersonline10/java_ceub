//11. Elabore um algoritmo que leia um n�mero de entrada que indicar� a quantidade de
//n�meros a serem lidos. Em seguida, leia n n�meros (conforme o valor informado
//anteriormente) e imprima a soma e a m�dia aritm�tica dos n�meros informados.

package java_exercicios_lista3;

import java.util.Scanner;

public class _11_WhileQdtadeNumerosSomaMedia {
	public static void main(String[]args) {
		
		Scanner leitor = new Scanner(System.in);
		int numero = 0;
		int qtde = 0;
		int i = 1;
		int soma = 0;
		double media = 0;
		
		
		System.out.print("Quantidade de n�meros a serem informados: ");
		qtde = leitor.nextInt();
				
		while (i <= qtde) {
			System.out.printf("Informe o %do n�mero: ", i);
			numero = leitor.nextInt();
			i += 1;
			soma += numero;
		}
		
		leitor.close();
		
		media = (double) soma / qtde;
		
		System.out.println("Soma: " + soma + ".");
		System.out.printf("A m�dia aritm�tica � %.2f. ", media);
	}

}
