package com.company.domain;

import com.company.exception.EditoraException;

public class Editora {
    private String nome;
    private String localisacao;

    public Editora(String nome, String localicacao) {
        validarEditora(nome);
        this.nome = nome;
        this.localisacao = localicacao;
    }

    public void validarEditora(String nome) {
        if(nome.equals("DC Comics")) {
            throw new EditoraException("Não podemos aceitar a editora " + nome + ", pois todos sabemos que a MARVEL é a melhor!");
        }
    }

    public String getNome() {
        return nome;
    }
}
