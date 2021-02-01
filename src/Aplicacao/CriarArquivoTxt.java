package Aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriarArquivoTxt {

	public static void main(String[] args) {
		
		String[] linhas = new String[] {"Bom Dia","Boa Tarde", "Boa Noite"};

		String path = "C:\\\\FFOutput\\\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
		
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
