package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Produtos;

public class Program7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite qtde Registros");
		
		int n = scan.nextInt();
		
		Produtos[] vetor = new Produtos[n];
		
		for (int i = 0; i < vetor.length; i++) {
			
			scan.nextLine();
			String nome = scan.nextLine();
			double preco = scan.nextDouble();
			
			vetor[i] = new Produtos(nome, preco);	
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < vetor.length; i++) {
			
			sum += vetor[i].getPreco();
		}
		
		System.out.println("Valor Médio é "+sum/n);
		
		scan.close();
	}

}
