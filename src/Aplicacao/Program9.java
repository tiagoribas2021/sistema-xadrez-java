package Aplicacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Contato;

public class Program9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Contato> lista = new ArrayList<Contato>(10);

		criarContatosDinamicamento(5, lista);
		
		
		scan.close();
	}
	
	public static void criarContatosDinamicamento(int quantidade, List<Contato> lista) {
		Contato contato;
		
		for (int i = 0; i <= quantidade; i++) {
			
			contato = new Contato();
			
			contato.setNome("Contato "+i);
			contato.setFone("123514"+i);
			
		lista.add(contato);
		
		}
		
	}

}
