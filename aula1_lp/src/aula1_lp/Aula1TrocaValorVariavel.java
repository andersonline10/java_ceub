package aula1_lp;

public class Aula1TrocaValorVariavel {
	public static void main (String[] args) {
		// Declara��o de vari�veis
		int a = 1;
		int b = 2;
		int temp = 0;
		
		// Processamento
		temp = a;
		a = b;
		b = temp;
		
		// Sa�da de dados
		System.out.println(a);
		System.out.println(b);
	}
}
