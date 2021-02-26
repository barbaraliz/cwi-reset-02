package br.com.banco.desgraca.domain;

import br.com.banco.desgraca.Data;

import java.time.LocalDate;

public class Transacao {

    private TipoTransacao transacao;
    private LocalDate dataTransacao;
    private Double valorTransacao;


    public Transacao(TipoTransacao transacao, LocalDate dataTransacao, Double valorTransacao) {
        this.transacao = transacao;
        this.dataTransacao = dataTransacao;
        this.valorTransacao = valorTransacao;
    }

    public TipoTransacao getTransacao() {
        return transacao;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public Double getValorTransacao() {
        return valorTransacao;
    }


}
