//9. Elabore um algoritmo que solicite ao usuário um número inteiro que indicará a quantidade
//de vezes que o texto "Hello World!" será impresso na tela, um em cada linha.

//de vezes que o texto "Hello World!" será impresso na tela, um em cada linha.
package java_exercicios_lista3;

import java.util.Scanner;

public class _9_ForSolicitaHelloLinha {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int qtde = 0;
		System.out.print("Informe a quantidade de vezes para imprimir o texto Hello World!: ");
		qtde = leitor.nextInt();
		
		leitor.close();
		
		for (int i = 1; i <= qtde; i++) {
			System.out.println(i + " - Hello World!");
		}
	}

}
 