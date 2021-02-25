package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class AplicacaoTeste {

    public static void main(String[] args){
        List<Pessoa> elenco = new ArrayList<Pessoa>();

        Diretor diretor = new Diretor("João", 45, Genero.MASCULINO, 10);
        elenco.add(diretor);
        elenco.add(new Ator("Pedro", 30, Genero.MASCULINO,3));
        elenco.add(new Ator("Alex", 20, Genero.NAO_BINARIO,5));
        elenco.add(new Ator("Vicente", 28, Genero.MASCULINO, 8));
        Filme filme1 = new Filme("Filme Histórico", "Filme sobre a história da humanindade",
                2015, 120, 4, diretor, elenco);

        filme1.exibirCreditos();

    }
}
