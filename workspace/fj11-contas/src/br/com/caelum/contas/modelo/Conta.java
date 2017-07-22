package br.com.caelum.contas.modelo;
/**
 * Classe que modela as contas do sistema
 * @author renato
 *
 */


public abstract class Conta implements Comparable<Conta> {
	
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
		
		return this.saldo;
		
	}
	
	/**
	 * Metodo para imprimir os dados da conta
	 * @return Os dados da conta.
	 */
	public String recuperaDados()  {
		
		return "A conta eh uma: " + this.getTipo();
		
	}
	
	/**
	 * Metodo para incrementar o saldo da conta.
	 * @param valor O valor a ser depositado.
	 */
	public void deposita(double valor) {
		
		if (valor < 0) {
			
			throw new IllegalArgumentException("Voce tentou depositar um valor negativo");
			
		} else {
			
			this.saldo += valor;
			
		}
		
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
	public abstract String getTipo();
	
	public void transfere(double valor, Conta conta) {
		
		this.saca(valor);
		conta.deposita(valor);
		
	}
	
	/*
	 * Exercicio (4) pg 171. 
	@Override
	public String toString() {
		
		return "[titular=" + this.titular.toUpperCase() + ", numero=" + this.numero
				+ ", agencia=" + agencia + "]";
		
	}
	*/
	
	// Exercicio (5) pg 172
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			
			return false;
			
		}
		
		Conta outraConta = (Conta) obj; 
		
		return this.numero == outraConta.numero &&
				this.agencia.equals(outraConta.agencia);
	}
	
	// Exercicios (1) e (2), pg 196 
	@Override
	public int compareTo(Conta o) {
		
		return this.titular.compareTo(o.titular);
		
	}
	
}
