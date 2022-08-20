import java.util.Scanner;

public class Aula2QuantidadeSegundos {
	public static void main (String[] args) {
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double horas = 0;
		double minutos= 0;
		double segundos= 0;
		double resultado = 0;
		
		//Entrada de dados
		System.out.print("Informe a quantidade de horas: ");
		horas = leitor.nextDouble();
		System.out.print("Informe a quantidade de minutos: ");
		minutos = leitor.nextDouble();
		System.out.print("Informe a quantidade de segundos: ");
		segundos = leitor.nextDouble();
		leitor.close();
		
		//Processamento
		resultado = ((3600 * horas) + (minutos * 60) + segundos); 
	
		//Saída de dados
		System.out.println("A quantidade total de segundos é: " + resultado);
		
	}
	
}
