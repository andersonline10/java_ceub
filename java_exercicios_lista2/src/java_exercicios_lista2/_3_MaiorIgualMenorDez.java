// 3. Elabore um algoritmo que solicite ao usuário um número real e ao final imprima na tela se o
// número informado é maior que dez, se é menor que dez, ou se é igual a dez


package java_exercicios_lista2;

import java.util.Scanner;

public class _3_MaiorIgualMenorDez {
	
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		
		System.out.print("Informe um número real: ");
		x = leitor.nextDouble();
		leitor.close();
		
		if (x > 10 ) {
			System.out.println("O número informado é maior que 10.");
		}
		else if (x ==10){
			System.out.println("O número informado é igual a 10.");
		}
		else {
			System.out.println("O número informado é menor que 10.");
		}
	}

}
