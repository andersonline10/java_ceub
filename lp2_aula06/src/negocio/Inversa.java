package negocio;

public class Inversa implements Ordenacao{
	
	public void ordenar(int[]vetor) {
		for (int i = 0 ; i < (vetor.length - 1); i++) {
			for (int j = (i + 1); j < vetor.length; j++) {
				if (vetor[i] < vetor[j]) {
					int temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
			}
		}
	}

}