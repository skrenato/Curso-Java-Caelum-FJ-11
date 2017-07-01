class TestaConta7 {

    public static void main (String[] args) {

        Conta7 c1 = new Conta7();
        
        c1.titular = "Hugo";
        c1.agencia = "45678-9";
        c1.numero = 123;
        c1.saldo = 50.0;
        
        Data data = new Data();
        data.dia = 01;
        data.mes = 07;
        data.ano = 17;
        
        c1.dataDeAbertura = data;
        
        System.out.println(c1.recuperaDadosParaImpressao());
        /*
        Nao atribuir os valores de dia/mes/ano de Data em c1 fara com que seja retornado
        o erro NullPointerException
        Exception in thread "main" java.lang.NullPointerException
	        at Conta7.recuperaDadosParaImpressao(Conta7.java:36)
	        at TestaConta7.main(TestaConta7.java:12)
        */
        
    }

}
