// Classe Account que cont�m uma vari�vel de inst�ncia name
// e m�todos para configurar e obter seu valor

package livro_deitel;

public class Account {
	private String name; //vari�vel de inst�ncia 
	
	//m�todo para definir o nome do objeto
	public void setName(String name)
	{
		this.name = name; //armazena o nome
	}
	
	//m�todo para recuperar o nome do objeto
	public String getName()
	{
		return name; // retorna valor do nome para o chamador
	}

} // fim da classe Account
