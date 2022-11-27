package aula13_lp;

public class PrimeiraFuncao {
	// retorno nome(parametros)
	public static int soma(int a, int b) {
		int retorno = 0;
		
		retorno =  (a + b);
		// a = 200;  se Valor não altera, se for por Referência altera
		// Java tipo 8 básicos por valor (int, short, long, etc)
		// Java objetos por referência
		
		return retorno;
		
	}
	
	
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		int resultado = 0;
		
		resultado = soma(num1, num2);
		
		System.out.println(resultado);
		
	}

}
