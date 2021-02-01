package Entidades;

public class PessoaFisica extends Pessoa {

	private Double gastoComSaude;
	private Double tetoImposto = 20000.0;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	public Double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}

	@Override
	public Double valorImposto() {
		Double sum = 0.0;

		if (super.getRendaAnual() < tetoImposto) {
			if (gastoComSaude > 0) {
				sum = super.getRendaAnual() * 0.15;
				sum -= gastoComSaude / 2;
			} else {
				sum = super.getRendaAnual() * 0.15;
			}
		}

		if (super.getRendaAnual() > tetoImposto) {
			if (gastoComSaude > 0) {
				sum = super.getRendaAnual() * 0.25;
				sum -= gastoComSaude / 2;
			} else {
				sum = super.getRendaAnual() * 0.25;
			}
		}

		return sum;
	}
	
	@Override
	public String toString() {
		return super.getNome() + " : $ " + valorImposto();
	}
}
