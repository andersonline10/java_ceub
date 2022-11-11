// Programa identificação de números perfeitos

package aula9_lp;

public class _2_NumerosPerfeitos {

	public static void main(String[] args) {
		
		int somaDivisores = 0;
				
		for(int candidato = 1; true; candidato++) {
			somaDivisores = 0;
			for (int i=1; i <= candidato / 2; i++ ) {
				if ((candidato % i) ==0) {
					somaDivisores += i;
				}
			}
			
			if (candidato == somaDivisores) {
				System.out.println(candidato);
			}
			
		}
		 
	}

}
