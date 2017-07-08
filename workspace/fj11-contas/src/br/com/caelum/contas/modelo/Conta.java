package br.com.caelum.contas.modelo;
/**
 * Classe que modela as contas do sistema
 * @author renato
 *
 */


public class Conta {
	
	private String titular, agencia, dataDeAbertura;
	private int numero;
	protected double saldo;
	
	/**
	 * Metodo para retornar o titular da conta.
	 * @return Nome do titular da conta.
	 */
	public String getTitular() {
		
		return titular;
		
	}
	
	/**
	 * Metodo para alterar o titular da conta.
	 * @param titular Nome do titular.
	 */
	public void setTitular(String titular) {
		
		this.titular = titular;
		
	}
	
	/**
	 * Metodo para consultar o numero da agencia.
	 * @return Numero da agencia.
	 */
	public String getAgencia() {
		
		return agencia;
		
	}
	
	/**
	 * Metodo para alterar o numero da agencia.
	 * @param agencia Numero da agencia.
	 */
	public void setAgencia(String agencia) {
		
		this.agencia = agencia;
		
	}
	
	/**
	 * Metodo para consultar a data de abertura da conta.
	 * @return Data de abertura da conta.
	 */
	public String getDataDeAbertura() {
		
		return dataDeAbertura;
		
	}
	
	/**
	 * Metodo para alterar a data de abertura.
	 * @param dataDeAbertura data de abertura no formato dd/mm/aa.
	 */
	public void setDataDeAbertura(String dataDeAbertura) {
		
		this.dataDeAbertura = dataDeAbertura;
		
	}
	
	/**
	 * Metodo para verificar o numero da conta.
	 * @return Numero da conta.
	 */
	public int getNumero() {
		
		return numero;
		
	}
	
	/**
	 * Metodo para alterar o numero da conta.
	 * @param numero Numero da conta.
	 */
	public void setNumero(int numero) {
		
		this.numero = numero;
		
	}
	
	/**
	 * Metodo para consultar o saldo.
	 * @return O saldo da conta.
	 */
	public double getSaldo() {
		
		return saldo;
		
	}
	/**
	 * Metodo para incrementar o saldo da conta.
	 * @param valor O valor a ser depositado.
	 */
	public void deposita(double valor) {
	
		this.saldo += valor;
		
	}
	
	/**
	 * Metodo para sacar da conta.
	 * @param valor Valor a ser sacado da conta.
	 */
	public void saca(double valor) {
		
		if (valor <= this.saldo) {
			
			this.saldo -= valor;
			
		}
		
	}
	
	/**
	 * Metodo para verificar o tipo da Conta.
	 * @return Tipo da Conta.
	 */
	public String getTipo() {
		
		return "Conta";
		
	}
	
	public void transfere(double valor, Conta conta) {
		
		this.saca(valor);
		conta.deposita(valor);
		
	}
	
}
