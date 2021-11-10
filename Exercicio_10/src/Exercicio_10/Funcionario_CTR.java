
package Exercicio_10;


public class Funcionario_CTR {
    Funcionario_DAO funcionario_DAO = new Funcionario_DAO();
   
   public String mostrarCodigoTelefone(Funcionario_DTO funcionario_DTO){
       return funcionario_DAO.mostrarCodigoTelefone(funcionario_DTO);
   }
    
}
