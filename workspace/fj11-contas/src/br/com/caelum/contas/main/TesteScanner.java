package br.com.caelum.contas.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);

		PrintStream out = new PrintStream("saida.txt");
		
		while(s.hasNextLine()) {
			
			String linha = s.nextLine();
			
			out.println(linha);
			
		}
		
	}

}
