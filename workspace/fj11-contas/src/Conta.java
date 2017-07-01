
public class Conta {
	
	private String titular, agencia, dataDeAbertura;
	private int numero;
	private double saldo;
	
	public String getTitular() {
		
		return titular;
		
	}
	
	public void setTitular(String titular) {
		
		this.titular = titular;
		
	}
	
	public String getAgencia() {
		
		return agencia;
		
	}
	
	public void setAgencia(String agencia) {
		
		this.agencia = agencia;
		
	}
	
	public String getDataDeAbertura() {
		
		return dataDeAbertura;
		
	}
	
	public void setDataDeAbertura(String dataDeAbertura) {
		
		this.dataDeAbertura = dataDeAbertura;
		
	}
	
	public int getNumero() {
		
		return numero;
		
	}
	
	public void setNumero(int numero) {
		
		this.numero = numero;
		
	}
	
	public double getSaldo() {
		
		return saldo;
		
	}

	public void deposita(double valor) {
	
		this.saldo += valor;
		
	}

	public boolean saca(double valor) {
		
		if (valor <= this.saldo) {
			
			this.saldo -= valor;
			
			return true;
			
		}
		
		return false;
		
	}
	
}
