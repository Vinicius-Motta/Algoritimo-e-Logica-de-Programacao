package Exercicio_10;

public class Funcionario_DAO {
     public String mostrarCodigoTelefone(Funcionario_DTO funcionario_DTO){
        return "O código é: " + funcionario_DTO.getCodigo() +
                "\nO telefone é: " + funcionario_DTO.getTelefone();
     }
}
