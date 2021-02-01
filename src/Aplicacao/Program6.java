package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite qtde Registros");
		
		int n = scan.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("Digite a posição "+i);		
			vetor[i] = scan.nextDouble();
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < vetor.length; i++) {
			
			sum += vetor[i];
		}
		 
		System.out.println("Valor Médio é "+sum/n);
		
		
		
		
		scan.close();
	}

}
