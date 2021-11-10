package IF_Ex01;


public class Agua {
    private double agua;
    private String resposta;
    
    public String analise(double agua){
        this.agua = agua;
        
        if(this.agua <= 10){
            this.resposta = "Rochoso";
        }
        else{
            if((this.agua > 10) && (this.agua <= 40)){
                this.resposta = "Firme";
            }
            else{
                if((this.agua > 40) && (this.agua <= 80)){
                    this.resposta = "Pantanoso";
                }
                else{
                    if(this.agua > 80){
                        this.resposta = "Quantidade de água inválida";
                    }
                }
            }
        }
        return this.resposta;
    }
    
}
