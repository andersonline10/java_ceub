// 11. Elabore um algoritmo que solicite ao usu�rio um n�mero real e ao final imprima na tela o
//numero informado e na linha de baixo o dobro deste n�mero da seguinte forma:
//Numero -> X
//Dobro deste numero -> Y

package java_exercicios_lista1;

import java.util.Scanner;

public class _11_RealDobro {
	public static void main(String[]args) {
		//declara��o
		Scanner leitor = new Scanner(System.in);
		double numero = 0;
		double dobro = 0;
		//entrada
		System.out.print("Informe um n�mero real: ");
		numero = leitor.nextDouble();
		leitor.close();
		//processamento
		dobro = (numero*2);
		//sa�da de dados
		System.out.printf("N�mero: %.2f.%n", numero);
		System.out.printf("Dobro deste n�mero: %.2f.%n", dobro);
	}

}
