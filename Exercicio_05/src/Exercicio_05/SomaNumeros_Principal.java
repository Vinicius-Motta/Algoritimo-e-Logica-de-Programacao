package Exercicio_05;

import javax.swing.JOptionPane;


public class SomaNumeros_Principal {
    public static void main(String[] args){
        int x;
        SomaNumeros somanumeros = new SomaNumeros();
        
        for (int cont = 1; cont <=10; cont++){
            x =Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            somanumeros.numero(x);
        }
        JOptionPane.showMessageDialog(null, somanumeros.soma());

    }

    
}
