package Entidades;

public class PedidoItem {

	private Integer quantidade;
	private Double preco;
	
	private Produtos produtos;
	
	public PedidoItem() {

	}
	
	public PedidoItem(Integer quantidade, Double preco, Produtos produtos) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produtos = produtos;
	}


	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}

	public double subTotal() {
		return quantidade * preco;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(produtos.getNome()+", ");
		sb.append("$"+preco+", ");
		sb.append("Quantidade : "+quantidade+", ");	
		sb.append("SubTotal : $"+subTotal()+", ");	
				
		return sb.toString();
	}
	
}
