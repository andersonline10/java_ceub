package aula13_lp;

public class PrimeiraFuncao {
	// retorno nome(parametros)
	public static int soma(int a, int b) {
		int retorno = 0;
		
		retorno =  (a + b);
		// a = 200;  se Valor n�o altera, se for por Refer�ncia altera
		// Java tipo 8 b�sicos por valor (int, short, long, etc)
		// Java objetos por refer�ncia
		
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
