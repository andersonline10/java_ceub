package aula8_lp;

import java.util.Scanner; 

public class _1_PesoMedioPopulacao {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double somaPeso = 0; 
		double media = 0;
		int qtdPessoas = 0;
		
		
		do {
			System.out.print("Informe o peso da pessoa: ");
			somaPeso += leitor.nextDouble();
			qtdPessoas++;
			
			System.out.print("Digite <1> se houver mais pessoas ou outro número para sair: ");
						
		} while (leitor.nextInt() == 1);
		
		leitor.close();
		
		media = somaPeso / qtdPessoas;
		
		System.out.println("A média de peso da população é: " + media);
	}

}
