package aula13_lp;

import java.util.Scanner;

public class UA3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double peso;
		double altura;
		double imc;
		int sexo;
		
		
		System.out.print("Informe o sexo: 1-M ou 2-F: ");
		sexo = leitor.nextInt();
		System.out.print("Informe o peso: ");
		peso = leitor.nextDouble();
		System.out.print("Informe a altura: ");
		altura = leitor.nextDouble();
		
		imc = peso / (Math.pow(altura, 2));
		
		System.out.printf("O IMC da pessoa é %.2f. ", imc);
		
		if (sexo == 1 && imc >= 19.1 && imc <= 25.8) {
			System.out.println("Está no peso ideal.");			
		} 
		else if (sexo == 2 && imc >= 20.7 && imc <= 26.4){
			System.out.println("Está no peso ideal.");
		}
		else {
			System.out.println("Não está no peso ideal.");
		}
		
		
		leitor.close();

	}

}
