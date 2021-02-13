package exercicio01;

public class Filme {

        private String nome;
        private String descricao;
        private int anoLancamento;
        private int duracao;
        private int avaliacao;
        private exercicio01.Diretor diretor;
        //Necessário criar a classe construtor

    public Filme(String nome, String descricao, int anoLancamento, int duracao, int nota, exercicio01.Diretor diretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.avaliacao = nota;
        this.diretor = diretor;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo filme :");
        System.out.println("* Nome: " + this.nome + ";");
        System.out.println("* Breve descrição: " + this.descricao + ";");
        System.out.println("* Tempo de duração: " + this.duracao + " minutos;");
        System.out.println("* Dirigido por: " + this.diretor.getNome() + ".");
    }

}
