package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaCorrente;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        double saldo = 0.0;
        ContaCorrente contaCorrente = new ContaCorrente(123, InstituicaoBancaria.NUBANK, saldo);
        System.out.println("Número da conta: " + contaCorrente.getNumero());
        System.out.println("Instituição bancária: " + contaCorrente.getInstituicaoBancaria());
        System.out.println("Saldo inicial: " + contaCorrente.getSaldo());

        contaCorrente.depositar(100.00);
        contaCorrente.sacar(15.00);



    }
}