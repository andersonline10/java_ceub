package aula2_lp;
import java.util.Scanner;

public class Aula2PesoMassaCorporal {
	public static void main (String[] args) {
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double altura = 0;
		double peso = 0;
		double imc = 0;
		
		//Entrada de dados
		System.out.print("Digite o seu peso: ");
		peso = leitor.nextDouble();
		
		System.out.print("Digite sua altura: ");
		altura = leitor.nextDouble();
		
		leitor.close();
		
		//Processamento
		imc = (peso / Math.pow(altura, 2));
		
		System.out.println("Seu IMC é: " + imc);
}

}