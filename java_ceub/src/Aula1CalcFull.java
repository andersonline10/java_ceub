import java.util.Scanner;

public class Aula1CalcFull {
	public static void main (String[] args) {
		// declarar variáveis
		Scanner leitor = new Scanner(System.in);
		
		int primeiroNumero = 0;
		int segundoNumero = 0;
		int resultado = 0;
		
		// Entrada de dados
		System.out.print("Digite o primeiro número: ");
		primeiroNumero = leitor.nextInt();
		
		System.out.print("Digite o segundo número: ");
		segundoNumero = leitor.nextInt();
		
		leitor.close();
		
		// a classe scanner exige que seja explicitamente fechada, pra encerrar o fluxo do teclado
		
		// Processamento
		resultado = (primeiroNumero + segundoNumero);
		
		// Saída de dados
		System.out.println(resultado);
		
	}

}
