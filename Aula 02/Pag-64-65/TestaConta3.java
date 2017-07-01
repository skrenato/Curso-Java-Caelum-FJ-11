class TestaConta3 {

    public static void main(String[] args) {

        Conta2 c1 = new Conta2();
        
        c1.setTitular("Hugo");
        c1.setDataDeAbertura("01/07/17");
        c1.setAgencia("45678-9");
        c1.setNumero(123);
        
        System.out.println(c1.recuperaDadosParaImpressao());
        
        c1.setTitular("Fulano");
        c1.setDataDeAbertura("02/07/17");
        c1.setAgencia("7894-0");
        c1.setNumero(321);
        
        System.out.println(c1.recuperaDadosParaImpressao());
    }

}
