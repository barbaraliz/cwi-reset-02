package br.com.banco.desgraca.domain;

public enum InstituicaoBancaria {

    BANCO_DO_BRASIL("Banco do Brasil"),
    BRADESCO("Bradesco"),
    CAIXA("Caixa Econômica Federal"),
    ITAU("Itaú"),
    NUBANK("Nubank");

    private final String instituicaoBancaria;

    InstituicaoBancaria(String instituicaoBancaria) {
        this.instituicaoBancaria = instituicaoBancaria;
    }

    public String getInstituicaoBancaria(){
        return instituicaoBancaria;
    }

    @Override
    public String toString() {
        return instituicaoBancaria;
    }
}
