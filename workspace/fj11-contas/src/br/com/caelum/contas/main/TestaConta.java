package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new Conta();

		conta.setTitular("Renato");
		conta.deposita(300.0);
		//
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