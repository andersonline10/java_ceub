package aula2_lp;
import java.util.Scanner;

public class Aula2VolumeEsfera {
	public static void main (String[] args) {
		//Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		double raio = 0;
		double volume = 0;
		
		//Entrada de dados
		System.out.print("Digite o raio: ");
		raio = leitor.nextDouble();
		leitor.close();
		
		// Processamento
		volume = ((4 * Math.PI * Math.pow(raio, 3)) / 3);
		
		//Sa�da de dados
		System.out.println ("O volume da esfera �: " + volume);
	}

}
