//Programa leitura de string e impress�o da primeira letra, �ltima letra e tamanho da string
//Programa altera��o de mai�sculas para min�sculas em uma string
// Programa altera��o de mai�sculas para min�sculas em uma string
//Programa remo��o de determinado caractere de uma string
//Programa contagem da quantidade de ocorr�ncias de uma palavra espec�fica em uma string
// Programa verifica��o de pal�ndromo


package aula12_lp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2_TratamentoStrings {

	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		String texto = "";
		String remover = "";
		String procurar = "";
		int contador = 0;
		int posicao = 0;

		try {
			System.out.print("Digite um texto: ");
			texto = leitor.readLine();
			System.out.print("Digite o que deve ser removido do texto: ");
			remover = leitor.readLine();
			System.out.print("Digite o que deve ser procurado: ");
			procurar = leitor.readLine();
			
		} catch (Exception erro) {
			System.out.println("erro");
		}
		
		//processamento
		posicao = -1;
		do { 
			posicao = texto.indexOf(procurar, posicao + 1);
			if (posicao > -1  ) {
				contador++;
				System.out.println("Posi��o: " + posicao + "\t");
			}
			
		} while (posicao > -1);
		
		//sa�da
		
		System.out.println("Primeira letra: " + texto.substring(0, 1));
		System.out.println("�ltima letra: " + texto.substring(texto.length() - 1, texto.length()));  // da �ltima pra uma a mais pra voltar, ex. J�nior, 0 1 2 3 4 5(da� fica da 5 a 6) 
		System.out.println("Tamanho: " + texto.length());
		System.out.println();
		System.out.println("Tudo mai�sculo: " + texto.toUpperCase());  //mai�sculo
		System.out.println("Tudo min�sculo: " + texto.toLowerCase()); //min�sculo
		System.out.println();
		System.out.println("Texto removido: " + texto.replace(remover, ""));  //remover texto
		System.out.println();
		System.out.println("Quantidade de ocorr�ncias: " + contador);
		
		
	}

}
