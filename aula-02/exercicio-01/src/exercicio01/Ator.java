package exercicio01;

public class Ator {
    private String nome;
    private int idade;
    private int numeroDeOscars;
    private Genero genero;

    public Ator(String nome, int idade, int numeroDeOscars, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.numeroDeOscars = numeroDeOscars;
        this.genero = genero;
    }

    public void perfilAtor(){
        System.out.println("O(a) Ator(a) " + this.nome + ", possui " + this.idade + " anos de idade, possui " +
                this.numeroDeOscars + " Oscars e se identifica com o gênero " +
                this.genero.getDescricao() + ".");
    }
}