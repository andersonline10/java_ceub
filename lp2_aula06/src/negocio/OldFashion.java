package negocio;

public class OldFashion extends Drink implements Mixer{
	public void misturar() {
		adicionar(new Ingrediente("Vhiskey", 100, " ml"));
		adicionar(new Ingrediente("Gelo", 1, " bola"));
		adicionar(new Ingrediente("Laranja", 1, " fatia"));
		adicionar(new Ingrediente("Açucar", 10, " g"));
		 
		
	}
}