package br.com.caelum.contas.main;

import java.io.PrintStream;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaConta {

	public static void main(String[] args) {
		
		
		Conta conta = new ContaCorrente();
		
		Throwable t = new Throwable();
		
		conta.setTitular("Renato");
		conta.deposita(300.0);
		
		System.out.println(conta);
		
		// Exercicio (1) pg. 171
		// System.out.println(t);
		// se imprime o nome da classe + @ + algum codigo maluco, entao nao herda.
		// pois o padrao do object eh @ + <codigo_maluco>
		// Ex: br.com.caelum.contas@15db9742
		
		// Exercicio (2) pg. 171
		PrintStream saida = System.out;
		saida.println("ola");
		
		//conta.saca(320);
		
		/*
		 * mudamos o saca de boolean para void
		if (conta.saca(200.0)) {

			System.out.println("\nSacou");

		} else {

			System.out.println("\nNao Sacou");

		}
		*/
	}

}
