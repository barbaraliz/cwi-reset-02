import java.text.DecimalFormat;

public class Apartamento extends Imovel{
    private int andar;

    public Apartamento(Endereco endereco, double valor, int andar){
        super(endereco, valor);
        this.andar = andar;
    }

    public String apresentacao(){
        return "Imóvel do tipo apartamento, localizado no endereço "  + super.getEndereco().enderecoCompleto() + ".\nNo andar número: "
                + this.andar + ".\nValor: R$ " + DecimalFormat.getCurrencyInstance().format(super.getValor()) + ".";
    }
}
