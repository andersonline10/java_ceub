package java_exercicios_lista1;

import java.util.Scanner;

public class _7_IntReal2casas {
	public void main(String[] args) {
	//Declara��o de vari�veis
	Scanner leitor = new Scanner(System.in);
	int numerointeiro = 0;
	double numeroreal = 0;

	//Entrada de dados
	System.out.print("Informe um n�mero inteiro: ");
	numerointeiro = leitor.nextInt();
	System.out.print("Informe um n�mero real: ");
	numeroreal = leitor.nextInt();
	leitor.close();
		
	//Sa�da de dados
	System.out.printf("Voc� informou os n�meros: %d e %.2f.", numerointeiro, numeroreal);
	}
}
