package IF_Ex01;

import javax.swing.JOptionPane;

public class PrincipalAgua {
    public static void main(String[] args){
        Agua agua = new Agua();
        
        JOptionPane.showMessageDialog(null,"O tipo de solo é: " +
                agua.analise(Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de água presente no solo"))));
    }
    
}
