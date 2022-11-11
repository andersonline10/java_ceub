// Programa cálculo do lançamento balístico
// – angulo = ((pi * angulo) / 180)
// – tempo = ((2 * velocidade * sen(angulo)) / gravidade);
// – distanciaFinal = ((velocidadeˆ2 * sen(2 * angulo)) / gravidade);
// – distanciaTempoATempo = (velocidade * cos(angulo) * tempo)

package aula9_lp;

import java.util.Scanner;

public class _5_LancamentoBalistico {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double angulo = 0;
		double tempo = 0;
		double velocidade = 0;
		double distanciaFinal = 0;
		double distanciaTempoATempo = 0;
		
		System.out.println("Digite o ângulo: ");
		angulo = leitor.nextDouble();
		
		System.out.println("Digite a velocidade inicial: ");
		velocidade = leitor.nextDouble();
				
		leitor.close();
		
		angulo = ((Math.PI * angulo) / 180);
		tempo = ((2 * velocidade * Math.sin(angulo) / 9.81));
		distanciaFinal = ((Math.pow(velocidade,  2) * Math.sin(2 * angulo)) / 9.81);
		
		System.out.println("Tempo total de lançamento:  " + tempo);
		
		for (int i = 0; i < tempo ; i++) {
			distanciaTempoATempo = (velocidade * Math.cos(angulo) * i);
			System.out.println(i + "s\t" + distanciaTempoATempo );
		}
		
		System.out.println("Distância final: " + distanciaFinal);

	}

}
