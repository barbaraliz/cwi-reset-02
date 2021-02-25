package com.company;

import com.company.domain.Editora;
import com.company.domain.Filme;
import com.company.heranca.Pessoa;
import com.company.enumerador.Genero;
import com.company.heranca.Ator;
import com.company.heranca.Diretor;

import java.util.ArrayList;
import java.util.List;

public class AplicacaoTeste {

    public static void main(String[] args) throws IllegalAccessException {

        List<Pessoa> elenco = new ArrayList<Pessoa>();
        Diretor diretor = new Diretor("João", 45, 10, Genero.MASCULINO);
        elenco.add(diretor);
        elenco.add(new Ator("Pedro", 30, 3, Genero.MASCULINO));
        elenco.add(new Ator("Alex", 20, 5, Genero.NAO_BINARIO));
        Editora editora1 = new Editora("DC Comics", "USA");
//        Editora editora2 = new Editora("MARVEL", "USA");

        Filme filme1 = new Filme("Filme Histórico", "Filme sobre a hisória da humanidade",
                2015, 120, 4, diretor, elenco, editora1);
//        Filme filme2 = new Filme("Filme Histórico", "Filme sobre a hisória da humanidade",
//                2015, 120, 8, diretor, elenco, editora2);



        filme1.exibirCreditos();
//        filme2.exibirCreditos();

    }



}
