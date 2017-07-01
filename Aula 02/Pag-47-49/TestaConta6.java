class TestaConta6 {

    public static void main (String[] args) {

        Conta6 c1 = new Conta6();
        
        c1.titular = "Hugo";
        c1.agencia = "45678-9";
        c1.numero = 123;
        c1.saldo = 50.0;
        
        Data data = new Data(); // ligacao!
        
        data.dia = 01;
        data.mes = 07;
        data.ano = 17;
        
        c1.dataDeAbertura = data;
                
    }

}
