import java.text.DecimalFormat;

public class PropostaFinanciamento {
    private Beneficiario beneficiario;
    private Imovel imovel;
    private int prazoPagamento;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovel, int prazoPagamento) {
        this.beneficiario = beneficiario;
        this.imovel = imovel;
        this.prazoPagamento = prazoPagamento;
    }

    private void imprimirPropostaAprovada() {
        System.out.println("Nome beneficiário: " + this.beneficiario.getNome() + ";");
        System.out.println("Imóvel: " + this.imovel.getEndereco().enderecoCompleto() + ".\nValor: R$ " +
                DecimalFormat.getCurrencyInstance().format(this.imovel.getValor()) + ";");
        System.out.println("Prazo de pagamento: " + this.prazoPagamento + ".");
        System.out.println(" >> Parabéns! Sua proposta foi aceita! << ");
    }

    private void imprimirPropostaNegada() {
        System.out.println("Nome beneficiário: " + this.beneficiario.getNome() + ";");
        System.out.println("Imóvel: " + this.imovel.getEndereco().enderecoCompleto() + ".\nValor: R$ " +
                DecimalFormat.getCurrencyInstance().format(this.imovel.getValor()) + ";");
        System.out.println("Prazo de pagamento: " + this.prazoPagamento + ".");
        System.out.println(" >> Mais sorte na próxima vez! Sua proposta foi negada! << ");
    }

    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     * <p>
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     * for equivalente a pelo menos 50% do valor do imóvel.
     * <p>
     * Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     * o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */


    public void validarProposta() {
        if (this.imovel.getEndereco().getEstado().getNome() == "São Paulo") {
            if ((this.beneficiario.getSalario() * this.prazoPagamento) >= this.imovel.getValor() * 0.65) {
                imprimirPropostaAprovada();
            } else {
                imprimirPropostaNegada();
            }
        } else if (this.imovel.getEndereco().getEstado().getNome() == "Rio de Janeiro") {
            if ((this.beneficiario.getSalario() * this.prazoPagamento) >= this.imovel.getValor() * 0.6) {
                imprimirPropostaAprovada();
            } else {
                imprimirPropostaNegada();
            }
        } else {
            if ((this.beneficiario.getSalario() * this.prazoPagamento) >= this.imovel.getValor() * 0.5) {
                imprimirPropostaAprovada();
            } else {
                imprimirPropostaNegada();
            }
        }
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public int getPrazoPagamento() {
        return prazoPagamento;
    }
}