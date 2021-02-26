package com.company.heranca;

import com.company.enumerador.Genero;

public class Diretor extends Pessoa {

    private Integer quantidadeFilmesDirigidos;

    public Diretor(String nome, Integer idade, Integer quantidadeFilmesDirigidos, Genero genero) {
        super(nome, idade, genero);
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Quantidade de filmes dirigidos: " + this.quantidadeFilmesDirigidos);
    }

}