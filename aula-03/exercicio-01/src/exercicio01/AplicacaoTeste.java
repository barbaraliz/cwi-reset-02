package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class AplicacaoTeste {

    public static void main(String[] args){
        List<Pessoa> elenco = new ArrayList<Pessoa>();
        elenco.add(new Diretor("João", 45, 10, Genero.MASCULINO));
        elenco.add(new Ator("Pedro", 30,3, Genero.MASCULINO));
        elenco.add(new Ator("Alex", 20,5, Genero.NAO_BINARIO));
        Filme filme1 = new Filme("Filme Histórico", "Filme sobre a história da humanindade",
                2015, 120, 4, elenco);


        filme1.exibirCreditos();


    }
}
