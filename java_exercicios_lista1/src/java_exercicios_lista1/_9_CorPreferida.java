
// 9. Escreva um programa que solicite ao usu�rio o nome de sua cor preferida e ao final
// apresente na tela a cor informada pelo usu�rio da seguinte forma: "Voce gosta da cor AAA"

package java_exercicios_lista1;

import java.util.Scanner;

public class _9_CorPreferida {
	public static void main (String[]args) {
		//declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		String cor;
		//entrada de dados
		System.out.print("Informe o nome da sua cor preferida: ");
		cor = leitor.next();
		leitor.close();
		//sa�da
		System.out.printf("Voc� gosta da cor %s.", cor);
		
		
	}

}
