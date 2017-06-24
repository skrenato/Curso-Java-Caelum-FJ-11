class Academia {

    public static void main(String[] args) {

        String nome = "Lucas";
        int idade = 16;
        float peso = 95.5f;
        // variavel que guarda a altura
        double altura = 1.80;
        char sexo = 'M';
        // Nao existe aspas simples!!!! Eh apostrofo!!!
        boolean ehFumante = false;
        boolean ehAmigo = false;
        
        // Or = ||
        // And = &&
        if (idade >= 18 || ehAmigo) {

            System.out.println("Idade permite matricular");        

        }

        else {
        
            System.out.println("Idade nao permite matricular");

        }
        
        while (idade < 18) {

            System.out.println("Tente novamente daqui 1 ano");
            
            //idade = idade +1;
            
            idade++;

            /*  idade = idade + 3
                idade += 3 
                o codigo de baixo produz o mesmo resultado do de cima. */


        }

        //imprimir de 1 a 10

        for (int i = 1; i <= 10; i++) {

            System.out.println("Valor de i =" + i);
        
        }

        //exemplo de casting        
        double d = 10.5;
        int ii = (int) d;
        

        // valor eh literal
        float f = 90.5;


    }

}
