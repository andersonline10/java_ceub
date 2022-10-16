//Fazer um programa para ler um vetor de N n�meros inteiros. Em seguida, mostrar na tela a m�dia
//aritm�tica somente dos n�meros pares lidos, com uma casa decimal. Se nenhum n�mero par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"

package application;
	
import java.util.Locale;
import java.util.Scanner;

public class ProgramMediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, somapares = 0, npares = 0;
		
		double mediapares;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = sc.nextInt();
		}
		
		
		for(int i=0;i<n;i++) {
			if (vetor[i] % 2 == 0) {
				somapares += vetor[i];
				npares++;
			}
		} 
		
		if (npares == 0) {
			System.out.println("NENHUM N�MERO PAR!");
		} 
		else {
			mediapares = (double)somapares / npares;
			System.out.println("MEDIA DOS PARES:" ); 
			System.out.printf("%.1f\n", mediapares);
			
		}
		
		sc.close();
	}

}
