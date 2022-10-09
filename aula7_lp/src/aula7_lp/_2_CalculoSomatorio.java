// Cálculo do somatório 

package aula7_lp;



public class _2_CalculoSomatorio { 
	public static void main(String[] args) {
		
		double somatorio = 0;
		
		for (int x = 1; x <= 100; x++) {
			somatorio += (Math.pow(x, 2) + 3 * x + 5);
		}
		
		System.out.println("Somatório é " + somatorio);
		
				
	}

}
