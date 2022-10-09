package aula8_lp;

public class _6_NumerosPrimos {
	public static void main(String[] args) {

		long numero = 0; 
		boolean primo = false;

		// while (numero < 1000) {    pra delimitar
		while (true) {               //infinito
			numero++;
			primo = true;

			for (int i = 2; i < (numero / 2); i++) { // opcional numero / 2 pra aumentar a performance
				if ((numero % i) == 0) {
					primo = false;
					break; // break pra aumentar a performance
				}
			}

			if (primo) {
				System.out.println(numero);
			}
		}

	}

}
