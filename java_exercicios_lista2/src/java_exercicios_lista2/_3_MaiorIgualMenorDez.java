// 3. Elabore um algoritmo que solicite ao usu�rio um n�mero real e ao final imprima na tela se o
// n�mero informado � maior que dez, se � menor que dez, ou se � igual a dez


package java_exercicios_lista2;

import java.util.Scanner;

public class _3_MaiorIgualMenorDez {
	
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double x = 0;
		
		System.out.print("Informe um n�mero real: ");
		x = leitor.nextDouble();
		leitor.close();
		
		if (x > 10 ) {
			System.out.println("O n�mero informado � maior que 10.");
		}
		else if (x ==10){
			System.out.println("O n�mero informado � igual a 10.");
		}
		else {
			System.out.println("O n�mero informado � menor que 10.");
		}
	}

}
