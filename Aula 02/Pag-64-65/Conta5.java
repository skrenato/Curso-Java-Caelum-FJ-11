class Conta5 {

    private String titular, agencia, dataDeAbertura;
    private int numero;
    private double saldo;
    private static int contador;
    private int identificador;
    
    public void saca(double valor) {

        this.saldo -= valor;    

    }

    public void deposita(double valor) {

        this.saldo += valor;

    }

    public double getRendimento() {

        return this.saldo * 0.1;
        
    }
    
    public String recuperaDadosParaImpressao() {

        String dados = "\nTitular: " + this.titular;
        dados += "\nNumero da Conta: " + this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nData de Abertura: " + this.dataDeAbertura;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nRendimento Mensal: " + this.getRendimento();
        dados += "\nIdentificador: " + this.getIdentificador() + "\n";
        
        return dados;

    }
    
    public void setTitular(String titular) {
    
        this.titular = titular;
    
    }
    
    public String getTitular() {
    
        return this.titular;
    
    }
    
    public double getSaldo() {
    
        return this.saldo;
    
    }
    
    public void setAgencia(String agencia) {
    
        this.agencia = agencia;
    
    }
    
    public String getAgencia() {
    
        return this.agencia;
    
    } 
    
    public void setNumero(int numero) {
    
        this.numero = numero;
    
    }
    
    public int getNumero() {
    
        return this.numero;
    
    }
    
    public String getDataDeAbertura() {
    
        return this.dataDeAbertura;
    
    }
    
    public void setDataDeAbertura(String dataDeAbertura) {
    
        this.dataDeAbertura = dataDeAbertura;
    
    }
    
    public Conta5(String titular) {
    
        this.titular = titular;
        this.contador += 1;
        this.identificador = contador;
            
    }
    
    public int getIdentificador() {
    
        return this.identificador;
    
    }
    
}
