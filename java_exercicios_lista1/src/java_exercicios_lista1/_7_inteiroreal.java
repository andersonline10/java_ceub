//7. Escreva um programa que solicite ao usu�rio um n�mero inteiro e um n�mero real e ao final
//apresente na tela os dois n�meros informados formatando com duas casas decimais
//somente o n�mero real da seguinte forma: "Voce informou os numeros N e X.YY"

package java_exercicios_lista1;

import java.util.Scanner;

public class _7_inteiroreal {
	public static void main(String[]args) {
	//declara��o de vari�veis
	Scanner leitor = new Scanner(System.in);
	int x = 0;
	double y = 0;
	
	//entrada de dados
	System.out.print("Informe um n�mero inteiro: ");
	x = leitor.nextInt();
	System.out.print ("Informe um n�mero real: ");
	y = leitor.nextDouble();
	
	leitor.close();
	
	//Sa�da de dados
	System.out.printf("Voc� informou os n�meros %d e %.2f.", x, y);
	
	}
	

}
