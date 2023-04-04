package negocio;

public class BubbleSort implements Ordenacao{
	
	public void ordenar(int[] vetor) {
		boolean troquei = false;
		
		
		do {
			troquei = false;
			
			for (int i = 0; i < (vetor.length - 1); i++){
				if (vetor[i] > vetor[i + 1]) {
					troquei = true;
					
					int temp = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = temp;
				}
			}
			
		} while (troquei);
	}

}
