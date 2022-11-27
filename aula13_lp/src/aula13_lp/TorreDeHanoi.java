package aula13_lp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TorreDeHanoi {
	public static void main(String[] args) {
		//declaração
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		int quantidadeDiscos = 0;
		
		// entrada
		
		try {
			System.out.print("Informe a quantidade de discos: ");
			quantidadeDiscos = Integer.parseInt(leitor.readLine());
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		// processamento
		
		moverTorre(quantidadeDiscos, "inicio", "meio", "fim");
		
		
	}
		public static void moverTorre(int disco, String inicio, String fim, String meio) {
			if (disco > 0) {
				moverTorre(disco - 1, inicio, fim, meio);
				System.out.println("Movi o disco " + disco + " do " + inicio + " para " + fim);
				moverTorre(disco - 1, meio, inicio, fim);
			}
						
		}
		

}


