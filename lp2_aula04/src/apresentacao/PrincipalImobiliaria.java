package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Imovel;
import negocio.Novo;
import negocio.Usado;

public class PrincipalImobiliaria {

	public static void main(String[] args) throws Exception {
		
		//declara��o de vari�veis
		
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Imovel objImovel = null;
		String tipo = "";
		
		//entrada de dados
		
		System.out.print("Digite <N> para im�vel novo ou <U> para im�vel usado: ");
		tipo = leitor.readLine();
		
		if (tipo.equalsIgnoreCase("N")) {
			objImovel = new Novo();
		} else {
			objImovel = new Usado();
		}
		
		System.out.print("Digite o endere�o: ");
		objImovel.setEndereco(leitor.readLine());
		
		System.out.print("Digite a metragem: ");
		objImovel.setMetragem(Double.parseDouble(leitor.readLine()));
		
		System.out.print("Digite o valor: ");
		objImovel.setValor(Double.parseDouble(leitor.readLine()));
		
		if (tipo.equalsIgnoreCase("N")) {
			System.out.print("Digite o adicional: ");
			((Novo) objImovel).setAdicional(Double.parseDouble(leitor.readLine()));
		} else {
			System.out.print("Digite a deprecia��o: ");
			((Usado) objImovel).setDepreciacao(Double.parseDouble(leitor.readLine()));
		}
		
		System.out.println("Endere�o: " +objImovel.getEndereco());
		System.out.println("Metragem: " +objImovel.getMetragem());
		System.out.println("Valor: " +objImovel.getValor());

	}

}
