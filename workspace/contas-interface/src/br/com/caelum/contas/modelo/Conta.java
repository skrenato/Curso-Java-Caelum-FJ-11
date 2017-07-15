package br.com.caelum.contas.modelo;

public interface Conta {
	
	public void getSaldo();
	
	public void deposita(double valor);
	
	public void saca(double valor);
	
	public void atualiza(double taxaSelic);
		
}
