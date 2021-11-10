package Exercicio_07;

import javax.swing.JOptionPane;


public class Letras_Principal {
    public static void main (String[] args){
        
        Letras letras = new Letras();
        String letra = "1";
        
        do{
            letra = JOptionPane.showInputDialog("Digite uma letra ou '0' para finalizar");
            letras.verificarLetras(letra);
        }while(!letra.equalsIgnoreCase("0"));

        JOptionPane.showMessageDialog(null, letras.mostrarResultado());
    }
    
}
    

