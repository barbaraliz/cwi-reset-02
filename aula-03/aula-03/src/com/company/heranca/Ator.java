package com.company.heranca;

import com.company.enumerador.Genero;

public class Ator extends Pessoa {
    private int quantidadeOscarsVencidos;

    public Ator(String nome, int idade, int quantidadeOscarsVencidos, Genero genero) {
        super(nome, idade, genero);
        this.quantidadeOscarsVencidos = quantidadeOscarsVencidos;
    }

    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Quantidade de Oscras vencidos: " + this.quantidadeOscarsVencidos);
    }

}
