package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0;  i < mat.length; i++) {
			
			for (int j = 0; j < mat.length; j++) {
				
				mat[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Diagonal principal");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i]+" ");
		}
		System.out.println(" ");
		System.out.println("Numeros negativos");
		
		int qtdNegativo = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(mat[i][j] < 0) {
					qtdNegativo++;
				}		
			}
		}
		
		System.out.println("Temos "+qtdNegativo+" números Negativos.");
		
		
		scan.close();
	}

}
