package br.com.caelum.contas;

import br.com.caelum.contas.modelo.*;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta;
	//rr
	
	public void criaConta(Evento evento){
		
		String tipo = evento.getSelecionadoNoRadio("tipo");
		
		if (tipo.equals("Conta Corrente")) {
			
			this.conta = new ContaCorrente();
			
		} else if (tipo.equals("Conta Poupança")) {
			
			this.conta = new ContaPoupanca();
			
		}
		
		this.conta.setTitular(evento.getString("titular"));
		
		this.conta.setNumero(evento.getInt("numero"));
		
		this.conta.setAgencia(evento.getString("agencia"));
		
	}	
	
	public void deposita(Evento evento){
		
		double valor = evento.getDouble("valorOperacao");
		this.conta.deposita(valor);
		
	}
	
	public void saca(Evento evento){
		
		double valor = evento.getDouble("valorOperacao");
		
		this.conta.saca(valor + 0.10);
			
	}
	
	public void transfere(Evento evento) {
		
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"), destino);
		
	}
	
}
