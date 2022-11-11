// Programa preenchimento de tabela de códigos e valores de produtos

package aula10_lp;

import java.util.Scanner;

public class _5_TabelaCodigosProdutos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double[] tabela = new double[10000];
		int codigo = 0;
		
		
		//Entrada de dados
		
		do {
			System.out.print("Digite o código do produto: ");
			codigo = leitor.nextInt();
			
			System.out.print("Digite o valor do produto: ");
			tabela[codigo] = leitor.nextDouble();
			
			System.out.print("Digite <S> para mais produtos: ");
			
			
		} while (leitor.next().equalsIgnoreCase("S"));
		
				
		leitor.close();
		
		// Saída de dados
		System.out.println("+========================+");
		System.out.println("|  Código  |    Valor    |");
		System.out.println("+========================+");
				
		for (int i = 0; i < tabela.length; i++) {
			if (tabela[i] > 0) { 
				System.out.println("|    " + i + "\t   |    " + tabela[i] + "\t |");
			}
		}
		System.out.println("+========================+");
		
	}
}
