//programa percentual de votos válidos em eleição

package aula3_lp;

import java.util.Scanner;

public class Aula3VotosValidos {
	public static void main(String[]args) {
		//declaracao
		Scanner leitor = new Scanner(System.in);
		double votosA = 0;
		double votosB = 0;
		double votosC = 0;
		double votosD = 0;
		
		double nulos = 0;
		double brancos = 0;
		
		double totalVotos = 0;
		double totalValidos = 0;
		
		double porcentagemA = 0;
		double porcentagemB = 0;
		double porcentagemC = 0;
		double porcentagemD = 0;
		
		double porcentagemValidos = 0;
		
		//entrada
		System.out.print("Quantos votos tem o candidato A: ");
		votosA = leitor.nextInt();
		System.out.print("Quantos votos tem o candidato B: ");
		votosB = leitor.nextInt();
		System.out.print("Quantos votos tem o candidato C: ");
		votosC = leitor.nextInt();
		System.out.print("Quantos votos tem o candidato D: ");
		votosD = leitor.nextInt();
		System.out.print("Informe a quantidade de votos nulos: ");
		nulos = leitor.nextInt();
		System.out.print("Informe a quantidade de votos em branco: ");
		brancos = leitor.nextInt();
		leitor.close();
		//processamento
		
		totalVotos = votosA + votosB + votosC + votosD + brancos + nulos;
		totalValidos = (votosA + votosB + votosC + votosD);
		porcentagemValidos = (totalValidos/totalVotos)*100;
		
		porcentagemA = (votosA/totalValidos)*100;
		porcentagemB = (votosB/totalValidos)*100;
		porcentagemC = (votosC/totalValidos)*100;
		porcentagemD = (votosD/totalValidos)*100;
		
		porcentagemValidos = totalValidos/totalVotos*100;
		
		//percentual de cada candidato
		//percentual dos votos válidos
		
		//dúvida, como colocar o símbolo % sem dar erro, isso no printf abaixo
		//saída
		
		System.out.println("Percentual de votos do candidato A: " + porcentagemA + "%.");
		System.out.println("Percentual de votos do candidato B: " + porcentagemB + "%.");
		System.out.println("Percentual de votos do candidato C: " + porcentagemC + "%.");
		System.out.println("Percentual de votos do candidato D: " + porcentagemD + "%.");
		
		System.out.println("O percentual de votos válidos na eleição é o de " + porcentagemValidos + "%.");
		
		
	}

}
