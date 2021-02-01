package Entidades;

public class Funcionarios {

	private String name;
	private Integer horasTrabalhadas;
	private Double valorHoras;
	
	public Funcionarios() {
	}
	
	public Funcionarios(String name, Integer horasTrabalhadas, Double valorHoras) {
		super();
		this.name = name;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHoras = valorHoras;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(Double valorHoras) {
		this.valorHoras = valorHoras;
	}
		
	public Double pagamento() {
		return valorHoras * horasTrabalhadas;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("PAGAMENTOS");
		sb.append(name +" - "+pagamento());
	
		return sb.toString();
	}
	
	
	
}
