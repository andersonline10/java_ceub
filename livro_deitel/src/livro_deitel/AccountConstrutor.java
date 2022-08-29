	// Classe Account que cont�m uma vari�vel de inst�ncia name
	// e m�todos para configurar e obter seu valor
	package livro_deitel;
	public class AccountConstrutor 
	{
		private String name; //vari�vel de inst�ncia 
		
		//o construtor inicializa name com nome do par�metro
		public AccountConstrutor(String name) //o nome do construtor � nome da classe
		{
		this.name = name; //armazena o nome
		}
		
		//m�todo para configurar o nome
		public void setName(String name) 
		{
			this.name = name;
		}
		
		//m�todo para recuperar o nome do objeto
		public String getName()
		{
			return name; // retorna valor do nome para o chamador
		}
	} // fim da classe Account


