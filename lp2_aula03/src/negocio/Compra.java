package negocio;

import java.util.Calendar;
import java.util.Date;

public class Compra {
	
	// Propriedades da classe
	private Produto objProduto = null;
	private int quantidade = 0;
	private Date data = null;
	
	// Métodos construtores
	
	private String cartao = "";
	public Compra() {
		super();
	}
	
	
	public Compra(Produto objProduto, int quantidade, Date data, String cartao) {
		super();
		this.objProduto = objProduto;
		this.quantidade = quantidade;
		this.data = data;
		this.cartao = cartao;
	}

	// métodos get/set

	public Produto getObjProduto() {
		return objProduto;
	}


	public void setObjProduto(Produto objProduto) {
		this.objProduto = objProduto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getCartao() {
		return cartao;
	}


	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
	// Métodos da classe
	public String getDataParaTela() {
		Calendar objCalendar = Calendar.getInstance();
		
		objCalendar.setTime(getData());
		
		return objCalendar.get(Calendar.DAY_OF_MONTH)+ "/" + 
				(objCalendar.get(Calendar.MONTH)+1)+ "/"  + 
				objCalendar.get(Calendar.YEAR);
	}
	
	public String getDataParaBanco() {
		Calendar objCalendar = Calendar.getInstance();
		
		objCalendar.setTime(getData());
		
		return objCalendar.get(Calendar.YEAR)+ "-" + 
				(objCalendar.get(Calendar.MONTH)+1)+ "-"  + 
				objCalendar.get(Calendar.DAY_OF_MONTH);
	}
	
	public void setDataDaTela(String data)throws Exception {
		Calendar objCalendar = Calendar.getInstance();
		
		objCalendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data.substring(0, 2)));
		objCalendar.set(Calendar.MONTH, Integer.parseInt(data.substring(3, 5))-1);
		objCalendar.set(Calendar.YEAR, Integer.parseInt(data.substring(6, 10)));
		
		setData(objCalendar.getTime());
		
	}
	
	
	public void setDataDoBanco(String data)throws Exception {
		Calendar objCalendar = Calendar.getInstance();
		
		objCalendar.set(Calendar.YEAR, Integer.parseInt(data.substring(0, 4)));
		objCalendar.set(Calendar.MONTH, Integer.parseInt(data.substring(5, 7))-1);
		objCalendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data.substring(8, 10)));
		
		
		setData(objCalendar.getTime());
		
	}
	
}
