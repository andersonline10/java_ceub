//programa percentual de votos v�lidos em elei��o

package aula3_lp;

import java.util.Scanner;

public class Aula3VotosValidos {
	public static void main(String[]args) {
		//declaracao
		Scanner leitor = new Scanner(System.in);
		int total = 0;
		int nulos = 0;
		int brancos = 0;
		int validos = 0;
		double porcentagem = 0;
		//entrada
		System.out.print("Informe a quantidade total de votos: ");
		total = leitor.nextInt();
		System.out.print("Informe a quantidade de votos nulos: ");
		nulos = leitor.nextInt();
		System.out.print("Informe a quantidade de votos em branco: ");
		brancos = leitor.nextInt();
		//processamento
		validos = (total - nulos - brancos);
		porcentagem = (double) validos/total*100;
		
		//d�vida, como colocar o s�mbolo % sem dar erro, isso no printf abaixo
		//sa�da
		System.out.printf("O percentual de votos v�lidos na elei��o � o de %.2f.", porcentagem);
		
		
	}

}
