import java.text.DecimalFormat;

public class Imovel {
    private Endereco endereco;
    private double valor;

    public Imovel(Endereco endereco, double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public String apresentacao() {
      return "Imóvel localizado no endereço "  + endereco.enderecoCompleto() + ".\nValor: R$ " +
                DecimalFormat.getCurrencyInstance().format(this.valor) + ".";
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }
}
