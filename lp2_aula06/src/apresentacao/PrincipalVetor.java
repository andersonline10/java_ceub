package apresentacao;

import negocio.BubbleSort;
import negocio.Direta;
import negocio.Inversa;
import negocio.Ordenacao;

public class PrincipalVetor {

	private static void imprimir(int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "\t");
		}
		System.out.println();
			
	}

	public static void main(String[] args) {
		//Declaração de variáveis
		Ordenacao objOrdenacao = null;
		int[] vetor = new int[100];
		
		//entrada de dados
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = ((int) (100 * Math.random()));
		}
		
		
		//processamento
		
		imprimir(vetor);
		
		objOrdenacao = new Direta();
		objOrdenacao.ordenar(vetor);
		imprimir(vetor);
		
		objOrdenacao = new Inversa();
		objOrdenacao.ordenar(vetor);
		imprimir(vetor);
		
		objOrdenacao = new BubbleSort();
		objOrdenacao.ordenar(vetor);
		imprimir(vetor);
		
	}
	
}
