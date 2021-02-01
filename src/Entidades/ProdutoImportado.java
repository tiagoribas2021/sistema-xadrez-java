package Entidades;

public class ProdutoImportado extends Produtos{

	private Double taxaAlfandega;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public double precoTotal() {
		return super.preco + taxaAlfandega;
	}
	
	@Override
	public String precoTag() {	
		StringBuilder sb = new StringBuilder();
		sb.append(super.nome+" $ ");
		sb.append(precoTotal()+" ");
		sb.append("( Custo de Taxas $ : ");
		sb.append(taxaAlfandega+")");
		return sb.toString();
	}
	
}
