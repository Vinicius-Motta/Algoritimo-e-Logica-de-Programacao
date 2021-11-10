
package Exercicio_10;

import javax.swing.JOptionPane;

public class Funcionario_VIEW {
    public static void main(String[] args){
        try{
            Funcionario_DTO funcionario_DTO = new Funcionario_DTO();
            Funcionario_CTR funcionario_CTR = new Funcionario_CTR();
            
            funcionario_DTO.setCodigo(JOptionPane.showInputDialog("Informe seu código de funcionário: "));
            funcionario_DTO.setTelefone(JOptionPane.showInputDialog("Informe seu número de telefone: ")); 
            
            JOptionPane.showMessageDialog(null, funcionario_CTR.mostrarCodigoTelefone(funcionario_DTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema" + e.getMessage());
        }
    }
}
