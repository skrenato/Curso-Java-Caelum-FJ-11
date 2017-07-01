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
    
        this.ano;
    
    }
    
    public void setDia(int dia) {
        
        if(this.mes/2 > 1) {
        
            if(dia <= 28) {
            
                this.dia = dia;
            
            } else {
            
                System.out.println("Data invalida");
            
            }
            
        } else {
        
            
        
        }
        
        this.dia = dia;
    
    }
    
    public void setMes(int mes) {
    
        this.mes = mes;
    
    }
    
    public void setAno() {
    
        this.ano = ano;
    
    }
    
}
