package aula2_lp;
import java.util.Scanner;

public class Aula2CelsiusParaFahrenheit {
	public static void main (String[] args) {
		//Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		
		double temperaturaCelcius = 0;
		double temperaturaFahrenheit = 0;
		
		//Entrada de dados
		System.out.print("Digite a temperatura em Celcius: ");
		temperaturaCelcius = leitor.nextDouble();
		
		leitor.close();
		
		//Processamento
		temperaturaFahrenheit = (32 + (9 * temperaturaCelcius) / 5);
			
		//Sa�da de dados
		System.out.println ("A temperatura equivalente em Fahrenheit � " + temperaturaFahrenheit);
		
		
		
	}

}
