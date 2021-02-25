package exercicio01;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private int idade;
    private Genero genero;

    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + this.nome + ".");
        System.out.println("Idade: " + this.idade + " anos.");
        System.out.println("Genero: " + this.genero + ".");
    }

    public String getNome() {

        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Genero getGenero() {

        return genero;
    }
}
