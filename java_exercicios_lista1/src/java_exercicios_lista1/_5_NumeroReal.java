// 5. Escreva um programa que solicite ao usu�rio um n�mero real e ao final apresente na tela o
// n�mero informado formatado com duas casas decimais da seguinte forma: "Voce informou
// o numero X.YY"

package java_exercicios_lista1;

import java.util.Scanner;

public class _5_NumeroReal {
	public static void main (String[] args) {
		//Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		double numero_real = 0;
		
		//Entrada de dados
		System.out.print("Digite um n�mero real: ");
		numero_real = leitor.nextDouble();
		leitor.close();
		
		//Sa�da de dados
		System.out.printf("O n�mero informado foi o %.2f.", numero_real);
	}
	

}
