package aula13_lp;

public class Fatorial {

	public static double calcularFatorial(double numero) {
		// toda função recursiva exige uma regra do valor fixo
		
		double retorno = 0; 
		
		if (numero ==0) {
			retorno = 1;
		} else {
			retorno = numero * calcularFatorial(numero - 1);
		}
		
		return retorno;
	}
		
	public static void main(String[]args) {
		
		System.out.println(calcularFatorial(5));
		
	}
}
