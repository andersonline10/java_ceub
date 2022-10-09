package aula8_lp;

import java.util.Scanner;

public class _3_PesquisaSocioeconomica {
	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in);
		
		
		
		double qtdPessoasClasseA = 0;
		double qtdPessoasClasseB = 0;
		double qtdPessoasClasseC = 0;
		double qtdPessoasClasseD = 0;
		double qtdPessoasClasseE = 0;
		
		double qtdTotalDePessoas = 0;
		
		double percentualClasseA = 0;
		double percentualClasseB = 0;
		double percentualClasseC = 0;
		double percentualClasseD = 0;
		double percentualClasseE = 0;
		
		double rendaFamiliar = 0;
		int qtdPessoasFamilia = 0;
		
		do {
			System.out.print("Qual a renda familiar: ");
			rendaFamiliar = leitor.nextDouble();
			
			System.out.print("Quantas pessoas moram na casa: ");
			qtdPessoasFamilia = leitor.nextInt();
			
			if ((rendaFamiliar / qtdPessoasFamilia) > 10000) {
				qtdPessoasClasseA += qtdPessoasFamilia;
				
			} else if ((rendaFamiliar / qtdPessoasFamilia) > 10000) {
				qtdPessoasClasseB += qtdPessoasFamilia;
				
			} else if ((rendaFamiliar / qtdPessoasFamilia) > 10000) {
				qtdPessoasClasseC += qtdPessoasFamilia;
				
			} else if ((rendaFamiliar / qtdPessoasFamilia) > 10000) {
				qtdPessoasClasseD += qtdPessoasFamilia;
				
			} else {
				qtdPessoasClasseD += qtdPessoasFamilia;
			}

						
			System.out.print("Digite <1> para mais incluir mais uma casa: ");
			
		} while (leitor.nextInt() == 1);
		
		leitor.close();
		
		qtdTotalDePessoas = (qtdPessoasClasseA + qtdPessoasClasseB + qtdPessoasClasseC + qtdPessoasClasseD + qtdPessoasClasseE);
		
		percentualClasseA = (100 * (qtdPessoasClasseA / qtdTotalDePessoas));
		percentualClasseB = (100 * (qtdPessoasClasseB / qtdTotalDePessoas));
		percentualClasseC = (100 * (qtdPessoasClasseC / qtdTotalDePessoas));
		percentualClasseD = (100 * (qtdPessoasClasseD / qtdTotalDePessoas));
		percentualClasseE = (100 * (qtdPessoasClasseE / qtdTotalDePessoas));
		
		
		System.out.println("O percentual de pessoas da classe A é: " + percentualClasseA);
		System.out.println("O percentual de pessoas da classe B é: " + percentualClasseB);
		System.out.println("O percentual de pessoas da classe C é: " + percentualClasseC);
		System.out.println("O percentual de pessoas da classe D é: " + percentualClasseD);
		System.out.println("O percentual de pessoas da classe E é: " + percentualClasseE);
		
	}		
	
}
