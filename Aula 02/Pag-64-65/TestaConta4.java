class TestaConta4 {

    public static void main(String[] args) {

        Conta4 c1 = new Conta4("Hugo");
        
        c1.setDataDeAbertura("01/07/17");
        c1.setAgencia("45678-9");
        c1.setNumero(123);
        
        System.out.println(c1.recuperaDadosParaImpressao());
        
        c1.setTitular("Fulano");
        c1.setDataDeAbertura("02/07/17");
        c1.setAgencia("7894-0");
        c1.setNumero(321);
        
        System.out.println(c1.recuperaDadosParaImpressao());
        
        Conta4 c2 = new Conta4("Ciclano");
        
        c2.setDataDeAbertura("03/07/17");
        c2.setAgencia("1234-5");
        c2.setNumero(456);
        
        System.out.println(c2.recuperaDadosParaImpressao());
        
    }

}
