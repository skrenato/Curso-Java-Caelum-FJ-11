class Data6 {

    private int dia;
    private int mes;
    private int ano;
    
    public int getDia() {
    
        return this.dia;
    
    }
    
    public int getMes() {
    
        return this.mes;    
    
    }
    
    public int getAno() {
    
        return this.ano;
    
    }
    
    public void setDia(int dia) {
        
        this.dia = dia;
    
    }
    
    public void setMes(int mes) {
    
        this.mes = mes;
    
    }
    
    public void setAno(int ano) {
    
        this.ano = ano;
    
    }
    
    private void validaData(int dia, int mes, int ano) {
    
        /*
        
        mes 01,03,05,07,08,10,12 = 31 (resultado = 1)
        
        mes 02 = 28
        
        mes 04,06,09,11 = 30 (resultado = 0)
        
        */

        if(this.mes % 2 == 0) {
            
            if(this.mes == 2) {
        
                // nao permite configurar dia > 28
                if (this.dia > 28) {
                
                    System.out.println("Dia invalido para o mes indicado\n");
                   
                }
            
            } else if (this.dia > 30) {
            // nao permite configurar dia > 30
            
               System.out.println("Dia invalido para o mes indicado\n");
               
            }
            
        }
        
        if(this.mes % 2 == 1) {
        
            // nao permite configurar dia > 31
            if (this.dia > 31) {
            
               System.out.println("Dia invalido para o mes indicado\n");
               
            }        
        }

    }
    
    public Data6(int dia, int mes, int ano) {
    
        this.validaData(dia,mes,ano);
        
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    
    }
    
}
