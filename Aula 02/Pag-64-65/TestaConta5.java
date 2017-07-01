class TestaConta5 {

    public static void main(String[] args) {

        Conta5 c1 = new Conta5("Khal Drogo");
        
        c1.setDataDeAbertura("01/07/17");
        c1.setAgencia("45678-9");
        c1.setNumero(123);
        
        Conta5 c2 = new Conta5("Ciclano");
        
        c2.setDataDeAbertura("03/07/17");
        c2.setAgencia("1234-5");
        c2.setNumero(456);

        System.out.println(c1.recuperaDadosParaImpressao());        
        System.out.println(c2.recuperaDadosParaImpressao());
        
    }

}
