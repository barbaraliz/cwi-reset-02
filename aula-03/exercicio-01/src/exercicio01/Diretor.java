package exercicio01;

public class Diretor extends Pessoa {

    private int quantidadeDeFilmes;

    public Diretor(String nome, int idade, int quantidadeDeFilmes, Genero genero) {
        super(nome, idade, genero);
        this.quantidadeDeFilmes = quantidadeDeFilmes;
    }

    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Quantidades de filmes dirigidos: " + this.quantidadeDeFilmes);

    }


}
