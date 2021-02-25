package exercicio01;

import java.time.LocalDate;

public class Ator extends Pessoa {

    private int numeroDeOscars;

    public Ator(String nome, int idade, Genero genero, int numeroDeOscars) {
        super(nome, idade, genero);
        this.numeroDeOscars = numeroDeOscars;

    }

    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Quantidade de Oscars vencidos: " + this.numeroDeOscars);
    }


}