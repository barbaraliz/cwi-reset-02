package exercicio01;

public class Ator extends Pessoa {

    private int numeroDeOscars;

    public Ator(String nome, int idade, int numeroDeOscars, Genero genero) {
        super(nome, idade, genero);
        this.numeroDeOscars = numeroDeOscars;

    }

    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Quantidade de Oscars vencidos: " + this.numeroDeOscars);
    }


}