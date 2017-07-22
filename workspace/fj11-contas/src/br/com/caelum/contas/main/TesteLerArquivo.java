package br.com.caelum.contas.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteLerArquivo {

	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while (linha != null) {
			
			System.out.println(linha);
			
			linha = br.readLine();
			
		}
		
		br.close();

	}

}
