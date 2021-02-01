package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entidades.enums.OrderStatus;

public class Pedido {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private OrderStatus status;

	private Clientes clientes;
	private List<PedidoItem> pedido_item = new ArrayList<PedidoItem>();

	public Pedido() {
	}

	public Pedido(Date momento, OrderStatus status, Clientes clientes) {
		this.momento = momento;
		this.status = status;
		this.clientes = clientes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Clientes getClientes() {
		return clientes;
	}


	public void addPedidoItem(PedidoItem pedidodoitem) {
		pedido_item.add(pedidodoitem);
	}

	public void removePedidoItem(PedidoItem pedidodoitem) {
		pedido_item.remove(pedidodoitem);
	}

	public double total() {
		double sum = 0;
		for (PedidoItem pi : pedido_item) {
			sum += pi.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento Pedido : ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("status Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente : ");
		sb.append(clientes + "\n");
		sb.append("Order items:\n");
		for (PedidoItem item : pedido_item) {
			sb.append(item + "\n");
		}
		sb.append("Preço Total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
