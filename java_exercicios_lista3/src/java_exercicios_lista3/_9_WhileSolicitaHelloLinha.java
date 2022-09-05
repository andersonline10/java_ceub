//9. Elabore um algoritmo que solicite ao usuário um número inteiro que indicará a quantidade
//de vezes que o texto "Hello World!" será impresso na tela, um em cada linha.
package java_exercicios_lista3;

import java.util.Scanner;

public class _9_WhileSolicitaHelloLinha {
	public static void main(String[]args) {
		int i = 1;
		int qtde = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de vezes para imprimir o texto Hello World!: ");
		qtde = leitor.nextInt();
		
		while (i <= qtde) {
			System.out.println(i + " - Hello World!");
			i +=1;
		}
		
		leitor.close();
		
	}
	
	

}
 