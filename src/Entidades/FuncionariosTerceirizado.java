package Entidades;

public class FuncionariosTerceirizado extends Funcionarios {

	private Double despesaAdicional;

	public FuncionariosTerceirizado() {
	}
	
	public FuncionariosTerceirizado(String name, Integer horasTrabalhadas, Double valorHoras, Double despesaAdicional) {
		super(name, horasTrabalhadas, valorHoras);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	
}
