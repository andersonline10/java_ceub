//10. Elabore um algoritmo que solicite ao usu�rio uma palavra e um n�mero inteiro que
//indicar� a quantidade de vezes que a palavra digitada ser� impressa na tela, um em cada
//linha.

package java_exercicios_lista3;

import java.util.Scanner;

public class _10_WhilePalavraQtde {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		String palavra;
		int qtde = 0;
		int contador = 1;
		
		System.out.print("Informe uma palavra: ");
		palavra = leitor.next();
		
		System.out.print("Informe quantas vezes a palavra ser� impressa: ");
		qtde = leitor.nextInt();
		
		leitor.close();
		
		while (contador <= qtde ) {
			System.out.println(contador + " - " + palavra);
			contador += 1;
		}
		
		
		
	}
 
}
