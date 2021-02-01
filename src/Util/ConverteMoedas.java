package Util;

public class ConverteMoedas {
	
	private double valorCotacao;
	private double qtdMoeda;
	
	public double calculaValorTotal() {
		return valorCotacao * qtdMoeda;
	}
	
	public ConverteMoedas() { //  construtor Padrao
	}
		
	public ConverteMoedas(double valorCotacao, double qtdMoeda) { //  construtor
		this.valorCotacao = valorCotacao;
		this.qtdMoeda = qtdMoeda;
	}
	
	public ConverteMoedas(double valorCotacao) { //  construtor com sobrecarga
		this.valorCotacao = valorCotacao;
	}

	public double getQtdMoeda() {
		return qtdMoeda;
	}

	public void setQtdMoeda(double qtdMoeda) {
		this.qtdMoeda = qtdMoeda;
	}

	public double getValorCotacao() {
		return valorCotacao;
	}
	



	

	
	
	
}
