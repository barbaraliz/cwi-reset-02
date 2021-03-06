package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;
import br.com.banco.desgraca.exception.SaqueInvalidoException;

import java.time.LocalDate;

public class ContaCorrente implements ContaBancaria {

    private Integer numero;
    private InstituicaoBancaria instituicaoBancaria;
    private Double saldo;

    public ContaCorrente(Integer numero, InstituicaoBancaria instituicaoBancaria, Double saldo) {
        this.numero = numero;
        this.instituicaoBancaria = instituicaoBancaria;
        this.saldo = saldo;
    }

    public Double consultarSaldo() {
        return this.saldo;
    }

    public void depositar(Double valor) {
        this.saldo += valor;
        Transacao depositar = new Transacao(TipoTransacao.DEPOSITAR, LocalDate.now(), valor);
        System.out.println("Depositando valor R$ " + valor + " na Conta " + this.instituicaoBancaria + this.numero + ".");
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void sacar(Double valor){
        if(valor % 5 == 0){
            this.saldo -= valor;
            Transacao sacar = new Transacao(TipoTransacao.SACAR, LocalDate.now(), valor);
            System.out.println("Sacando valor R$ " + valor + " da Conta " + this.instituicaoBancaria + this.numero + ".");
            System.out.println("Saldo atual: " + this.saldo);

        } else {
            throw new SaqueInvalidoException("Valor de saque inválido. Saque disponível apenas para notas de R$ 5,00 - R$ 10,00 - R$ 20,00 - R$ 50,00 - R$ 100,00 - R$ 200,00.");
        }

    }

    public void transferir(Double valor, ContaBancaria contaDestino) {
        if(valor < this.saldo) {
            if(contaDestino.equals(instituicaoBancaria)){
                contaDestino.depositar(valor);
                this.saldo -= valor;
                Transacao transferir = new Transacao(TipoTransacao.TRANSFERIR, LocalDate.now(), valor);
                System.out.println("Transferindo valor R$ " + valor + " da Conta " + this.instituicaoBancaria + this.numero + " para a conta " + contaDestino);
                System.out.println("Saldo atual: " + this.saldo);
            } else {
                this.saldo = (this.saldo - valor) - (valor * 0.01);
                Transacao transferir = new Transacao(TipoTransacao.TRANSFERIR, LocalDate.now(), valor);
                System.out.println("Transferindo valor R$ " + valor + " da Conta " + this.instituicaoBancaria + this.numero + " para a conta " + contaDestino);
                System.out.println("Saldo atual: " + this.saldo);
            }
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para concluir esta transação!");
        }

    public void exibirExtrato(LocalDate inicio, LocalDate fim)

    }

    public Integer getNumero() {
        return numero;
    }

    public InstituicaoBancaria getInstituicaoBancaria() {
        return this.instituicaoBancaria;
    }

    public Double getSaldo() {
        return saldo;
    }
}