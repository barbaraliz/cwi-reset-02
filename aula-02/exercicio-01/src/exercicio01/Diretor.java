package exercicio01;

public class Diretor {
    private String nome;
    private int idade;
    private int quantidadeDeFilmes;
    private Genero genero;

    public Diretor(String nome, int idade, int quantidadeDeFilmes, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeDeFilmes = quantidadeDeFilmes;
        this.genero = genero;
    }

    public void perfilDiretor(){
        System.out.println("O(a) Diretor(a) " + this.nome + ", possui " + this.idade + " anos de idade, dirigiu " +
                this.quantidadeDeFilmes + " filmes e se identifica com o gênero " + this.genero.getDescricao() + ".");
}

    public String getNome() {

        return this.nome;
    }
}
