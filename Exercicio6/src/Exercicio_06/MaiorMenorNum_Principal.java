package Exercicio_06;

import javax.swing.JOptionPane;


public class MaiorMenorNum_Principal {
    public static void main (String[] args){
        MaiorMenorNum maiormenornum = new MaiorMenorNum();
        
        for (int cont = 1; cont <=10; cont++){
            maiormenornum.lerNum(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));    
        }
        JOptionPane.showMessageDialog(null,"O maior número é: "+ maiormenornum.maiorNumero());
        JOptionPane.showMessageDialog(null,"O menor número é: "+ maiormenornum.menorNumero());
        
    }
    
}
