package Exercicio_06;

import javax.swing.JOptionPane;

public class MaiorMenorNum {
    private int num, maiorNum =-999999  , menorNum = 999999;
    
    public void lerNum(int num){
        this.num = num;
        
        for(int i = 1; i <= 10; i++){
            if(num > maiorNum){
                this.maiorNum = num;
            }
            if(num < menorNum){
            this.menorNum = num;
            }
        }
    }
    
    public int maiorNumero(){
        return this.maiorNum;
    }
    public int menorNumero(){
        return this.menorNum;
    }
}
    

