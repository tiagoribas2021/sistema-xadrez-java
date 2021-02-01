package Entidades;

public class PessoaJuridica extends Pessoa {

	private Integer numeroFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double valorImposto() {
		Double sum = 0.0;

		if (numeroFuncionarios < 10) {
			sum = super.getRendaAnual() * 0.16;
		} else {
			sum = super.getRendaAnual() * 0.14;
		}
		return sum;
	}
	
	@Override
	public String toString() {
		return super.getNome() + " : $ " + valorImposto();
	}

}
