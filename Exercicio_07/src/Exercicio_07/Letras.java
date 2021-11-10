package Exercicio_07;

public class Letras {
private String letra;
    private int consoantes, A, E, I, O, U;


    public void verificarLetras(String letra){
        this.letra = letra;
        if(letra.equalsIgnoreCase("A")){
            this.A++;
        }
        else if(letra.equalsIgnoreCase("E")){
            this.E++;
        }
        else if(letra.equalsIgnoreCase("I")){
            this.I++;
        }
        else if(letra.equalsIgnoreCase("O")){
            this.O++;
        }
        else if(letra.equalsIgnoreCase("U")){
            this.U++;
        }
        else if(!letra.equalsIgnoreCase("0")){
            this.consoantes++;
        }

    }
    public String mostrarResultado(){
        return "O número de letras A é: "+this.A + "\nO número de letras E é: "+this.E+
        "\nO número de letras I é: "+this.I+"\nO número de letras O é: "+this.O+"\nO número de letras U é: "+this.U+
        "\nO número de Consoantes é: "+this.consoantes;

    }
    }  
