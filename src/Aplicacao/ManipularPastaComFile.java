package Aplicacao;

import java.io.File;
import java.util.Scanner;

public class ManipularPastaComFile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	
		System.out.println("Digite o Caminho da pasta : ");
		
		String strPath = scan.nextLine();
		
		File path = new File(strPath);
		
		File[] pastas = path.listFiles(File::isDirectory);
		
		for (File fl : pastas) {
			System.out.println(fl.getName()); // Nomes só da pasta
			System.out.println(fl); // Caminho absoluto
		}
		
		System.out.println("----------------------");
		
		File[] arquivos = path.listFiles(File::isFile);
		
		for (File arq : arquivos) {
			System.out.println(arq.getName());
			System.out.println(arq);
		}
			
		boolean sucesso = new File( strPath + "\\NewPasta").mkdir();	// Cria nova pasta no diretorio	
		
		
		
		scan.close();
	}

}
