package java_exercicios_lista1;

import java.util.Scanner;

public class _7_IntReal2casas {
	public void main(String[] args) {
	//Declaração de variáveis
	Scanner leitor = new Scanner(System.in);
	int numerointeiro = 0;
	double numeroreal = 0;

	//Entrada de dados
	System.out.print("Informe um número inteiro: ");
	numerointeiro = leitor.nextInt();
	System.out.print("Informe um número real: ");
	numeroreal = leitor.nextInt();
	leitor.close();
		
	//Saída de dados
	System.out.printf("Você informou os números: %d e %.2f.", numerointeiro, numeroreal);
	}
}
