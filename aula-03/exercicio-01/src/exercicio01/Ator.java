package exercicio01;

import java.time.LocalDate;

public class Ator extends Pessoa {

    private int numeroDeOscars;

    public Ator(String nome, LocalDate dataNascimento, Genero genero, int numeroDeOscars) {
        super(nome, dataNascimento, genero);
        this.numeroDeOscars = numeroDeOscars;

    }

    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Quantidade de Oscars vencidos: " + this.numeroDeOscars);
    }


}