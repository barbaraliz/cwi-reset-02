package br.com.banco.desgraca.domain;

public enum TipoTransacao {

    DEPOSITAR("Depositar"),
    SACAR("Sacar"),
    TRANSFERIR("Transferir");

    private final String tipoTransacao;

    TipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    @Override
    public String toString() {
        return  tipoTransacao;
    }
}
