package Entidades;

public class Banco {

	private int numeroDaConta;
	private String nomeTitular;
	private double saldo = 0;
	private double taxa = 5;
	
	
	
	public double possuiDeposito(double depositoInicial) {
		return saldo = depositoInicial;
	}
	
	public double deposito(double deposito) {
		return saldo += deposito;
	}
	
	public double retirada(double deposito) {
		return saldo -= deposito + taxa;
	}
	
	//////////////////////////////////////////
	
	public Banco() {
		super();
	}
		
	
	public Banco(int numeroDaConta, String nomeTitular, double saldo) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public Banco(int numeroDaConta, String nomeTitular) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.nomeTitular = nomeTitular;
	}

	/////////////////////////////////////////

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	/////////////////////////////////////////

}
