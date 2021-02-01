package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entidades.ProdutoImportado;
import Entidades.ProdutoUsado;
import Entidades.Produtos;

public class Program16 {

	public static void main(String args[]) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Quantidade Produtos : ");

		int qtd = scan.nextInt();

		List<Produtos> lista = new ArrayList<>();

		for (int i = 0; i < qtd; i++) {

			System.out.print("Qual o Tipo do Produto (C / U / I) ?");
			char ch = scan.next().charAt(0);

			System.out.print("Nome : ");
			String nome = scan.next();

			if (ch == 'C') {
				System.out.print("preco : ");
				Double preco = scan.nextDouble();

				lista.add(new Produtos(nome, preco));
			} else if (ch == 'I') {

				System.out.print("preco : ");
				Double preco = scan.nextDouble();

				System.out.print("Taxa Alfandega : ");
				Double taxaAlfandega = scan.nextDouble();

				lista.add(new ProdutoImportado(nome, preco, taxaAlfandega));
			} else {

				System.out.print("preco : ");
				Double preco = scan.nextDouble();

				System.out.print("Dt Fabricação : ");
				Date dtFabricacao = sdf.parse(scan.next());
				
				lista.add(new ProdutoUsado(nome, preco, dtFabricacao));
				
			}

		}

		for (Produtos prod : lista) {
			System.out.println(prod.precoTag());
		}

		scan.close();

	}
}
