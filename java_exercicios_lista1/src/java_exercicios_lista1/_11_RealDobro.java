// 11. Elabore um algoritmo que solicite ao usuário um número real e ao final imprima na tela o
//numero informado e na linha de baixo o dobro deste número da seguinte forma:
//Numero -> X
//Dobro deste numero -> Y

package java_exercicios_lista1;

import java.util.Scanner;

public class _11_RealDobro {
	public static void main(String[]args) {
		//declaração
		Scanner leitor = new Scanner(System.in);
		double numero = 0;
		double dobro = 0;
		//entrada
		System.out.print("Informe um número real: ");
		numero = leitor.nextDouble();
		leitor.close();
		//processamento
		dobro = (numero*2);
		//saída de dados
		System.out.printf("Número: %.2f.%n", numero);
		System.out.printf("Dobro deste número: %.2f.%n", dobro);
	}

}
