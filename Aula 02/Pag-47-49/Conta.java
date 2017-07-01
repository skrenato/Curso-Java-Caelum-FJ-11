class Conta {

    String titular, agencia, dataDeAbertura;
    int numero;
    double saldo;
    
    void saca (double valor) {

        this.saldo -= valor;    

    }

    void deposita (double valor) {

        this.saldo += valor;

    }

    double calculaRendimento() {
        
        return this.saldo * 0.1;
        
    }

    String recuperaDadosParaImpressao() {

        String dados = "Titular: " + this.titular;
        dados += "\nNumero da Conta: " + this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nData de Abertura: " + this.dataDeAbertura;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nRendimento Mensal: " + this.calculaRendimento();
        
        return dados;

    }

}
