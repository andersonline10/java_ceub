//11. Elabore um algoritmo que leia o nome e o peso de duas pessoas e imprima o nome da
//pessoa mais pesada

package java_exercicios_lista2;

import java.util.Scanner;

public class _11_PessoaMaisPesada {
	public static void main (String[]args){
		Scanner leitor = new Scanner(System.in);
		String nome_pessoa1;
		String nome_pessoa2;
		double peso_pessoa1 = 0;
		double peso_pessoa2 = 0;
		
		System.out.print("Informe o nome da primeira pessoa: ");
		nome_pessoa1 = leitor.next();
		System.out.print("Qual o peso da primeira pessoa? ");
		peso_pessoa1 = leitor.nextDouble();
		
		System.out.print("Informe o nome da segunda pessoa: ");
		nome_pessoa2 = leitor.next();
		System.out.print("Qual o peso da segunda pessoa? ");
		peso_pessoa2 = leitor.nextDouble();
		
		leitor.close();
		
		if (peso_pessoa1 > peso_pessoa2) {
			System.out.printf("A pessoa mais pesada é %s.%n", nome_pessoa1);
		}
		else if (peso_pessoa2 > peso_pessoa1){
			System.out.printf("A pessoa mais pesada é %s.%n", nome_pessoa2);
		}
		else {
			System.out.printf("%s e %s têm o mesmo peso.", nome_pessoa1, nome_pessoa2);
		}
	}
}
