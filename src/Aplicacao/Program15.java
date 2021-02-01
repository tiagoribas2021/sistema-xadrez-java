package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.Clientes;
import Entidades.Pedido;
import Entidades.PedidoItem;
import Entidades.Produtos;
import Entidades.enums.OrderStatus;

public class Program15 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com os Dados do CLIENTE : ");

		System.out.print("Nome : ");
		String nome = scan.nextLine();

		System.out.print("E-mail : ");
		String email = scan.nextLine();

		System.out.print("Data Niver : ");
		Date dtniver = sdf.parse(scan.next());

		Clientes cliente = new Clientes(nome, email, dtniver);

		//******************************************************
		
		System.out.println(" ");
		System.out.println("Entre com os Dados do PEDIDO : ");
		System.out.println(" ");
		
		System.out.print("Status : ");
		OrderStatus.valueOf(scan.next());		
		
		System.out.print("Informe Quantidade de Itens : ");
		int qtd = scan.nextInt();
		


		Pedido pedido = new Pedido(sdf.parse("20/01/2021"),OrderStatus.valueOf(scan.next()), cliente);
		
		
		System.out.print("OK ");
		
		for (int i = 0; i < qtd; i++) {

			System.out.println(" ");
			System.out.println("Entre com produto #" + (i + 1) + " : ");
			System.out.println(" ");

			System.out.print("Nome do Produto : ");
			String nomeprod = scan.next();

			System.out.print("Valor do Produto : ");
			Double preco = scan.nextDouble();
			
			System.out.print("Quantidade : ");
			int quantidade = scan.nextInt();

			Produtos produtos = new Produtos(nomeprod, preco);
			
			PedidoItem item = new PedidoItem(quantidade, preco, produtos);

			pedido.addPedidoItem(item);
			
		}
		
		

		
		
		

		scan.close();
	}

}
