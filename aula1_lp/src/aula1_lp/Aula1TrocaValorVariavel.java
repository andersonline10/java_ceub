package aula1_lp;

public class Aula1TrocaValorVariavel {
	public static void main (String[] args) {
		// Declaração de variáveis
		int a = 1;
		int b = 2;
		int temp = 0;
		
		// Processamento
		temp = a;
		a = b;
		b = temp;
		
		// Saída de dados
		System.out.println(a);
		System.out.println(b);
	}
}
