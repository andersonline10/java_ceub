//Programa leitura de string e impressão da primeira letra, última letra e tamanho da string
//Programa alteração de maiúsculas para minúsculas em uma string
// Programa alteração de maiúsculas para minúsculas em uma string
//Programa remoção de determinado caractere de uma string
//Programa contagem da quantidade de ocorrências de uma palavra específica em uma string
// Programa verificação de palíndromo


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
				System.out.println("Posição: " + posicao + "\t");
			}
			
		} while (posicao > -1);
		
		//saída
		
		System.out.println("Primeira letra: " + texto.substring(0, 1));
		System.out.println("Última letra: " + texto.substring(texto.length() - 1, texto.length()));  // da última pra uma a mais pra voltar, ex. Júnior, 0 1 2 3 4 5(daí fica da 5 a 6) 
		System.out.println("Tamanho: " + texto.length());
		System.out.println();
		System.out.println("Tudo maiúsculo: " + texto.toUpperCase());  //maiúsculo
		System.out.println("Tudo minúsculo: " + texto.toLowerCase()); //minúsculo
		System.out.println();
		System.out.println("Texto removido: " + texto.replace(remover, ""));  //remover texto
		System.out.println();
		System.out.println("Quantidade de ocorrências: " + contador);
		
		
	}

}
