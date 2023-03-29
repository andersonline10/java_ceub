package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aguia;
import negocio.Animal;
import negocio.Ave;
import negocio.Cachorro;
import negocio.Leopardo;
import negocio.Mamifero;

public class PrincipalZoologico {

	public static void main(String[] args) throws Exception{
		//declaracao de variavesi
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Animal objAnimal = null;
		String tipo = "";
		
		//entrada de dados
		System.out.print("Digite <C> para cachorro, " + "<L> para leopardo ou " + "<A> para águia: ");
		tipo = leitor.readLine();
		
		if (tipo.equalsIgnoreCase("C")) {
			objAnimal = new Cachorro();
		} else if (tipo.equalsIgnoreCase("L")) {
			objAnimal = new Leopardo();
		} else {
			objAnimal = new Aguia();
		}
		
		System.out.print("Digite o peso do animal: ");
		objAnimal.setPeso(Double.parseDouble(leitor.readLine()));
		
		System.out.print("Digite a altura do animal: ");
		objAnimal.setAltura(Double.parseDouble(leitor.readLine()));
		
		System.out.print("Digite o nome do animal: ");
		objAnimal.setNome(leitor.readLine());
		
		if (tipo.equalsIgnoreCase("C")) {
			System.out.print("Digite a quantidade de litros de leite: ");
			((Mamifero) objAnimal).setLitrosLeite(Double.parseDouble(leitor.readLine()));
			System.out.print("Digite a força da mordida: ");
			((Cachorro) objAnimal).setForcaMordida(Double.parseDouble(leitor.readLine()));
		} else if (tipo.equalsIgnoreCase("L")){
			System.out.print("Digite a quantidade de litros de leite: ");
			((Mamifero) objAnimal).setLitrosLeite(Double.parseDouble(leitor.readLine()));
			System.out.print("Digite a velocidade: ");
			((Leopardo) objAnimal).setVelocidade(Double.parseDouble(leitor.readLine()));
		} else {
			System.out.print("Digite a quantidade de ovos: ");
			((Ave) objAnimal).setQuantidadeOvos(Double.parseDouble(leitor.readLine()));
			System.out.print("Digite a autonomia de vôo: ");
			((Aguia) objAnimal).setAutonomia(Double.parseDouble(leitor.readLine()));
		}
		
		//saída de dados
		
		System.out.println("Nome: " + objAnimal.getNome() );
		System.out.println("Peso: " + objAnimal.getPeso());
		System.out.println("Altura: " + objAnimal.getAltura());
		System.out.println("IMC: " + objAnimal.calcularIMC());
		
		if (tipo.equalsIgnoreCase("C")) {
			System.out.println("Litros de leite: " + ((Cachorro) objAnimal).getLitrosLeite());
			System.out.println("Força da mordida: " + ((Cachorro) objAnimal).getForcaMordida());
			((Cachorro) objAnimal).morder();
		} else if (tipo.equalsIgnoreCase("L")) {
			System.out.println("Litros de leite: " + ((Leopardo) objAnimal).getLitrosLeite());
			System.out.println("Força da mordida: " + ((Leopardo) objAnimal).getVelocidade());
			((Leopardo) objAnimal).correr();
		} else {
			System.out.println("Quantidade de ovos: " + ((Aguia) objAnimal).getQuantidadeOvos());
			System.out.println("Autonomia de vôo: " + ((Aguia) objAnimal).getAutonomia());
			((Aguia) objAnimal).voar();
			
		}

	}

}
