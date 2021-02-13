package exercicio01;

public class Filme {

        private String nome;
        private String descricao;
        private int anoLancamento;
        private int duracao;
        private int avaliacao;
        private exercicio01.Diretor diretor;

    public Filme(String nome, String descricao, int anoLancamento, int duracao, int avaliacao, exercicio01.Diretor diretor) {
        defineAvaliacao(avaliacao);
        validaNomeEDefineAvaliacao (nome);
        this.nome = nome;
        this.descricao = descricao;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        //Retirar essas atribuições pois estão sendo mencionadas abaixo
        // this.avaliacao = avaliacao;
        this.diretor = diretor;
    }
    public void reproduzir() {

        System.out.println("* Nome: " + this.nome + ";");
        System.out.println("* Breve descrição: " + this.descricao + ";");
        System.out.println("* Avaliação: " + avaliacao);
        System.out.println("* Tempo de duração: " + this.duracao + " minutos;");
        System.out.println("* Dirigido por: " + this.diretor.getNome() + ".");

    }

    private void defineAvaliacao(int avaliacao) {
        if (avaliacao < 1 || avaliacao > 5){
            this.avaliacao = 3;
        } else {
            this.avaliacao = avaliacao;
        }
    }

    private void validaNomeEDefineAvaliacao (String nome) {
        if (nome == "O Clube da Luta") {
            this.avaliacao = 5;
        } else if (nome == "Batman vs Superman") {
            this. avaliacao = 1;
        } else {
            this.avaliacao = avaliacao;
        }
    }
}
