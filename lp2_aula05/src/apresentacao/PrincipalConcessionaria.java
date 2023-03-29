package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Carro;
import negocio.Fabricante;
import negocio.Moto;
import negocio.Veiculo;

public class PrincipalConcessionaria {

	public static void main(String[] args) throws Exception{
		//declaracao de variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Veiculo objVeiculo = null;
		String tipo = "";
		
		//Entrada de dados
		
		System.out.print("Digite <C> para carro ou <M> para moto: ");
		tipo = leitor.readLine();
		//polimorfismo
		if (tipo.equalsIgnoreCase("C")) {
			objVeiculo = new Carro();
		} else {
			objVeiculo = new Moto();
		}
		
		System.out.print("Digite o modelo do veículo: ");
		objVeiculo.setModelo(leitor.readLine());
		

		System.out.print("Digite o fabricante do veículo: ");
		objVeiculo.setObjFabricante(new Fabricante(leitor.readLine()));
		
		System.out.print("Digite a cor do veículo: ");
		objVeiculo.setCor(leitor.readLine());
		
		if (tipo.equalsIgnoreCase("C")) {
			System.out.print("Digite <S/N> para teto solar: ");
			((Carro) objVeiculo).setTetoSolar(leitor.readLine().equalsIgnoreCase("S"));
			
		} else {
			System.out.print("Digite a cilindrada da moto: ");
			((Moto) objVeiculo).setCilindrada(Integer.parseInt(leitor.readLine()));
		}
		
		//saída de dados
		
		System.out.println("Modelo: " + objVeiculo.getModelo());
		System.out.println("Fabricante: " + objVeiculo.getObjFabricante().getNome());
		System.out.println("Cor: " + objVeiculo.getCor());
		
		if (tipo.equalsIgnoreCase("C")) {
			System.out.println("Teto solar: " + ((((Carro) objVeiculo).isTetoSolar()) ? "SIM" : "NÃO"));
			
			
		} else {
			System.out.println("Cilindrada: " + ((Moto) objVeiculo).getCilindrada());
		}
		
		
	}

}
