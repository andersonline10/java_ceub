package negocio;

public class MoscowMule extends Drink implements Mixer{
	public void misturar() {
		adicionar(new Ingrediente("Vodka", 50, " ml"));
		adicionar(new Ingrediente("Lim�o", 2, " unidades"));
		adicionar(new Ingrediente("A�ucar", 15, " gramas"));
		adicionar(new Ingrediente("G�lo", 5, " pedras"));
		adicionar(new Ingrediente("Gengibre", 2, " gramas"));
		adicionar(new Ingrediente("Espuma de Gengibre", 10, " ml"));
		 
		
	}
}