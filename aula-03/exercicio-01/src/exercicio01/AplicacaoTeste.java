package exercicio01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AplicacaoTeste {

    public static void main(String[] args){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

//        LocalDate dataNascimento1 = LocalDate.parse("26-10-1994",formatter);//
//        Pessoa pessoa = new Pessoa("Bárbara", dataNascimento1, Genero.FEMININO);
//
//        pessoa.imprimirInformacoes();

        List<Pessoa> elenco = new ArrayList<Pessoa>();

        LocalDate dataNascimentoDiretor = LocalDate.parse("28-08-1976",formatter);
        Diretor diretor = new Diretor("João", dataNascimentoDiretor, Genero.MASCULINO, 10);
        elenco.add(diretor);
        LocalDate dataNascimentoAtor1 = LocalDate.parse("26-02-1983",formatter);
        elenco.add(new Ator("Pedro",dataNascimentoAtor1, Genero.MASCULINO,3));
        LocalDate dataNascimentoAtor2 = LocalDate.parse("15-07-2001",formatter);
        elenco.add(new Ator("Alex", dataNascimentoAtor2, Genero.NAO_BINARIO,5));
        LocalDate dataNascimentoAtor3 = LocalDate.parse("29-05-1993",formatter);
        elenco.add(new Ator("Vicente", dataNascimentoAtor3, Genero.MASCULINO, 8));
        Filme filme1 = new Filme("Filme Histórico", "Filme sobre a história da humanindade",
                2015, 120, 4, diretor, elenco);

        filme1.exibirCreditos();

    }
}
