package com.company.domain;

import com.company.heranca.Diretor;
import com.company.heranca.Pessoa;

import java.util.List;

public class Filme {

    private String nome;
    private String descricao;
    private Integer duracao;
    private Integer anoLancamento;
    private Integer avaliacao;
    private Diretor diretor;
    private List<Pessoa> elenco;
    private Editora editora;

    public Filme(String nome, String descricao, Integer duracao, Integer anoLancamento, Integer avaliacao, Diretor diretor, List<Pessoa> elenco,
                 Editora editora) throws IllegalAccessException {
        defineAvaliacao(avaliacao);
        validaNomeEDefineAvaliacao(nome);
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.elenco = elenco;
        this.editora = editora;
    }

    public void reproduzir() {
        System.out.println("Nome Filme: " + this.nome);
        System.out.println("Descrção: " + this.descricao);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Nome do Diretor: " + this.diretor.getNome());
    }

    private void defineAvaliacao(Integer avaliacao) throws IllegalAccessException {
        if (avaliacao < 1 || avaliacao > 5) {
            throw new IllegalAccessException("Avaliacao inválida!");
        } else {
            this.avaliacao = avaliacao;
        }
    }

    private void validaNomeEDefineAvaliacao(String nome) {
        if ("Batman vs Superman".equals(nome)) {
            this.avaliacao = 1;
        } else if ("Interestelar".equals(nome)) {
            this.avaliacao = 5;
        }
    }
    public void exibirCreditos() {
        System.out.println(">>>>>> " + this.nome + " <<<<<<");
        System.out.println("Editora: " + this.editora.getNome());

        System.out.println("Elenco: ");
        for (Pessoa pessoa: elenco) {
            pessoa.imprimirInformacoes();
        }

    }
}
