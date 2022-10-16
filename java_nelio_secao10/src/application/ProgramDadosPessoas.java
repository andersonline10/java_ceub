//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.

package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, nhomens=0, nmulheres=0;
		double menoraltura=0, maioraltura=0, alturamulherestotal=0, mediaaltmulheres=0;
		
		System.out.print("Quantas pessoas serão digitadas: ");
		n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i = 0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Gênero da %da pessoa: ", i+1);
			genero[i] = sc.next().charAt(0);
		}
		
		menoraltura = altura[0];
		maioraltura = altura[0];	
		
		for(int i = 0; i<n; i++) {
			if (altura[i] < menoraltura) {
				menoraltura = altura[i];
			}
			if (altura[i] > maioraltura) {
				maioraltura = altura[i];
			}
		}
		

		for(int i = 0; i<n; i++) {
			if (genero[i] == 'F') {
				nmulheres++;
				alturamulherestotal += altura[i];
			} 
			else {
				nhomens++;
			}
		}
		
		mediaaltmulheres = alturamulherestotal/nmulheres;
		
		System.out.printf("Menor altura = %.2f\n", menoraltura);
		System.out.printf("Maior altura = %.2f\n", maioraltura);
		System.out.printf("Média das alturas das mulheres = %.2f\n", mediaaltmulheres);
		System.out.printf("Número de homens = %d\n", nhomens);
		
		sc.close();
	}
}
