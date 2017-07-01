class TestaConta4 {

    public static void main (String[] args) {

        Conta c1 = new Conta();
        
        c1.titular = "Hugo";
        c1.saldo = 50.0;
        
        Conta c2 = new Conta();
        
        c2.titular = "Hugo";
        c2.saldo = 50.0;
       
        if (c1 == c2) {

            System.out.println("Sao iguais");   
        
        } else {
        
            System.out.println("Sao diferentes");
        
        }


    }

}
