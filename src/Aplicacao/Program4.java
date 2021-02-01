package Aplicacao;

import java.util.Scanner;

import Util.ConverteMoedas;

public class Program4 {

	public static void main(String[] args) {	

		Scanner scan = new Scanner(System.in);

		System.out.println("Cotação Atualo do Dolar $ : ");
		double valorCotacao = scan.nextDouble();

		System.out.println("Quantos Doláres deseja Comprar ? : ");
		double qtdMoeda = scan.nextDouble();
		
		ConverteMoedas moeda = new ConverteMoedas(valorCotacao,qtdMoeda);

		// moeda.setValorCotacao(5);
		// System.out.println("Valor Em Reais : " + moeda.getValorCotacao());
		
		System.out.println("Valor Em Reais : " + moeda.calculaValorTotal());

		scan.close();
	}

}
