package negocio;

public class Drink {
	//propriedades da classe
	private Ingrediente[] colecao = new Ingrediente[10];
	private int qtdIngrediente = 0;
	
	//métodos da classe
	
	public void adicionar(Ingrediente objIngrediente) {
		colecao[qtdIngrediente] = objIngrediente;
		qtdIngrediente++;
		
	}
	
	public void beber() {
		for (int i = 0; i < qtdIngrediente; i++) {
			System.out.println(colecao[i].getQuantidade() + "" + colecao[i].getUnidade() + " de " + colecao[i].getNome());
		}
	}
	
	
	
}
