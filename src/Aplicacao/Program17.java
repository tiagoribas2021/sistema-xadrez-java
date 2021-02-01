package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Pessoa;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;

public class Program17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quantidade Contribuintes : ");
		int qtd = scan.nextInt();

		List<Pessoa> lista = new ArrayList<>();

		for (int i = 0; i < qtd; i++) {

			System.out.print("Individual ou Companhia (I / C) ?");
			char ch = scan.next().charAt(0);

			System.out.print("Nome : ");
			String nome = scan.next();

			System.out.print("Renda Anual $ : ");
			Double rendaAnual = scan.nextDouble();

			if (ch == 'I') {
				System.out.print("Digite Gastos Com Saúde $ : ");
				Double gastoComSaude = scan.nextDouble();

				lista.add(new PessoaFisica(nome, rendaAnual, gastoComSaude));
			} else if (ch == 'C') {
				System.out.print("Digite Qtde Funcionários : ");
				int numeroFuncionarios = scan.nextInt();

				lista.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}

		Double sum = 0.0;
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.toString());
			sum += pessoa.valorImposto();
		}

		System.out.println("Total Taxas : $ " + sum);

		scan.close();
	}

}
