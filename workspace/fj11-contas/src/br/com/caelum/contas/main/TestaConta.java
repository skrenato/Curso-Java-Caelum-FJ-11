package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaConta {

	public static void main(String[] args) {
		
		
		Conta conta = new ContaCorrente();
		
		conta.setTitular("Renato");
		conta.deposita(300.0);
		
		System.out.println(conta);
		
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
