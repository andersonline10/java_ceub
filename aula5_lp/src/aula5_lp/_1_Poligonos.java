package aula5_lp;

import java.util.Scanner;

public class _1_Poligonos {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int lado = 0;
		double aresta = 0;
		
		double perimetro = 0;
		double area = 0;
		
		System.out.print("Digite a quantidade de lados: ");
		lado = leitor.nextInt();
		
		System.out.print("Digite o tamanho da aresta: ");
		aresta = leitor.nextDouble();
		
		leitor.close();
		
		switch (lado) {
			case 3:
				perimetro = (3 * aresta);
				area = ((Math.pow(aresta,  2) * Math.sqrt(3)) / 4); 
				break;
			case 4:
				perimetro = (4 * aresta);
				area = (Math.pow(aresta,  2)); 
				break;
			case 5:
				perimetro = (5 * aresta);
				area = ((Math.pow(aresta,  2)) / (4 * Math.tan(36))); 
				break;
			case 6:
				perimetro = (6 * aresta);
				area = (3 * (Math.pow(aresta,  2) * Math.sqrt(3)) / 4);; 
				break;
			case 7:
				perimetro = (7 * aresta);
				area = ((7 / 4) * Math.pow(aresta,  2) * (1 / Math.tan(51.4285714))); 
				break;
			default: 
				System.out.println("Tá de sacanagem! Só consigo de 3 a 7.");
		}
				
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
						
	}

}
