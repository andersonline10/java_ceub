package aula2_lp;
import java.util.Scanner;	
//import java.text.DecimalFormat;	

public class Aula2QuantidadeSalariosMinimos {
	public static void main (String[] args) {
		// Declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		double salario = 0;
		double resultado = 0;
		
		//Entrada de dados
		System.out.print("Digite o valor do seu sal�rio: ");
		salario = leitor.nextDouble();
		
		leitor.close();
		
		//Processamento
		resultado = (salario / 1212);
		
		//String resultado = new DecimalFormat("#,##0.00").format(12005.11);
		
		//Sa�da de dados
		System.out.println("A quantidade de sal�rios m�nimos " + 
							" que voc� ganha �: " + resultado);
		
		
		
	}
}


