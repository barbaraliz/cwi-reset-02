import java.text.DecimalFormat;

public class Casa extends Imovel{
    private boolean patio;

    public Casa(Endereco endereco, double valor, boolean patio){
        super(endereco, valor);
        this.patio = patio;
    }

    public String apresentacao(){
        String possuiPatio;

        if (this.patio) {
            possuiPatio = "sim";
        } else{
            possuiPatio = "não";
        }

        return "Imóvel do tipo casa, localizado no endereço "  + super.getEndereco().enderecoCompleto() + ".\nPossui pátio: "
                + possuiPatio + ".\nValor: R$ " + DecimalFormat.getCurrencyInstance().format(super.getValor()) + ".";
    }
}
