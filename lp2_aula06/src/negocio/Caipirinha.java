package negocio;

public class Caipirinha extends Drink implements Mixer{
	public void misturar() {
		adicionar(new Ingrediente("Pinga", 50, " ml"));
		adicionar(new Ingrediente("Lim�o", 2, " unidades"));
		adicionar(new Ingrediente("A�ucar", 15, " gramas"));
		adicionar(new Ingrediente("G�lo", 5, " pedras"));
		
	}
}
