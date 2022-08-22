//7. Escreva um programa que solicite ao usuário um número inteiro e um número real e ao final
//apresente na tela os dois números informados formatando com duas casas decimais
//somente o número real da seguinte forma: "Voce informou os numeros N e X.YY"

package java_exercicios_lista1;

import java.util.Scanner;

public class _7_inteiroreal {
	public static void main(String[]args) {
	//declaração de variáveis
	Scanner leitor = new Scanner(System.in);
	int x = 0;
	double y = 0;
	
	//entrada de dados
	System.out.print("Informe um número inteiro: ");
	x = leitor.nextInt();
	System.out.print ("Informe um número real: ");
	y = leitor.nextDouble();
	
	leitor.close();
	
	//Saída de dados
	System.out.printf("Você informou os números %d e %.2f.", x, y);
	
	}
	

}
