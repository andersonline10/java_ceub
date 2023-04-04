package negocio;

public class Caipirinha extends Drink implements Mixer{
	public void misturar() {
		adicionar(new Ingrediente("Pinga", 50, " ml"));
		adicionar(new Ingrediente("Limão", 2, " unidades"));
		adicionar(new Ingrediente("Açucar", 15, " gramas"));
		adicionar(new Ingrediente("Gêlo", 5, " pedras"));
		
	}
}
