package Aplicacao;

import java.io.File;
import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o Caminho da pasta : ");

		String strPath = scan.nextLine();

		File path = new File(strPath);

		scan.close();
	}

}
