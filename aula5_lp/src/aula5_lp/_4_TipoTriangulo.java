package aula5_lp;

import java.util.Scanner;

public class _4_TipoTriangulo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int aresta1 = 0;
		int aresta2 = 0;
		int aresta3 = 0;
		
		System.out.print("Informe o tamanho da aresta 1: ");
		aresta1 = leitor.nextInt();
		
		System.out.print("Informe o tamanho da aresta 2: ");
		aresta2 = leitor.nextInt();
		
		System.out.print("Informe o tamanho da aresta 3: ");
		aresta3 = leitor.nextInt();
				
		leitor.close();
		
		if ((aresta1 == aresta2) && (aresta1 == aresta3)) {
			System.out.println("O tipo do triângulo é o equilátero.");
		}
		else if ((aresta1 == aresta2) || (aresta1 == aresta3) || (aresta2 == aresta3)){
			System.out.println("O tipo do triângulo é o isóceles.");
		}
		else {
			System.out.println("O tipo do triângulo é o escaleno.");
		}
		
		
		
		
		
	}

}
