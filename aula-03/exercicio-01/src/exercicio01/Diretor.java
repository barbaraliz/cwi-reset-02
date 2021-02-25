package exercicio01;

import java.time.LocalDate;

public class Diretor extends Pessoa {

    private int quantidadeDeFilmes;

    public Diretor(String nome, int idade, Genero genero, int quantidadeDeFilmes) {
        super(nome, idade, genero);
        this.quantidadeDeFilmes = quantidadeDeFilmes;
    }

    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Quantidades de filmes dirigidos: " + this.quantidadeDeFilmes);

    }


}
