package negocio;

public class DryMartini extends Drink implements Mixer{
	public void misturar() {
		adicionar(new Ingrediente("Vodka", 50, " ml"));
		adicionar(new Ingrediente("Gin", 50, " ml"));
		adicionar(new Ingrediente("Vermuth", 10, " ml"));
		adicionar(new Ingrediente("Gêlo", 5, " pedras"));
		adicionar(new Ingrediente("Azeitona", 3, " unidades"));
		
	}
}
