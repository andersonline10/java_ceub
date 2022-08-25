package aula3_lp;

import java.util.Scanner;

public class Aula3AzulejosPiscina {
	public static void main (String [] args) {
	
	//declaração:
	Scanner leitor = new Scanner(System.in);
	
	double largura = 0;
	double profundidade = 0;
	double comprimento = 0;
	
	double aresta = 0;
	
	double areaPiscina = 0;
	double areaAzulejo = 0;
	
	double quantidadeAzulejo = 0;
	
	//entrada
	System.out.print("Informe a profundidade: ");
	profundidade = leitor.nextDouble();
	System.out.print("Informe a largura: ");
	largura = leitor.nextDouble();
	System.out.print("Informe a comprimento:5 ");
	comprimento = leitor.nextDouble();
	System.out.print("Informe a aresta do azulejo: ");
	aresta = leitor.nextDouble();
	leitor.close();
	
	//processamento
	areaPiscina = ((2 * comprimento * profundidade) + (2 * largura * profundidade) + (comprimento * largura));
	
	areaAzulejo = Math.pow(aresta, 2);
	
	quantidadeAzulejo = (areaPiscina / areaAzulejo);
	
	//saída
	System.out.println("A quantidade de azulejos é: " + quantidadeAzulejo);
	
	}
}
