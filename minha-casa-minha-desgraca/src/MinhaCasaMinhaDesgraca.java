import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MinhaCasaMinhaDesgraca {

    public static void main(String[] args) throws Exception {

        System.out.println("\n ### Olá, seja bem vindo ao magnífico programa Minha Casa - Minha Desgraça ###\n");

        ImoveisParaFinanciamento opcoesParaFinanciamento = new ImoveisParaFinanciamento();

        /**
         * INÍCIO
         *
         * NÃO MODIFICAR ESTA CLASSE ANTES DESTA LINHA.
         */

        Endereco endereco1 = new Endereco("Rodovia Raposo Tavares", 2460,"Apartamento 205",
                "Lageadinho","Cotia", UnidadeFederativa.SAO_PAULO);
        Apartamento imovel1 = new Apartamento(endereco1,450000,2);
        opcoesParaFinanciamento.registrarImovel(imovel1);

        Endereco endereco2 = new Endereco("Avenida Governador José Malcher",50,"Sem complemento",
                "Nazaré", "Belém", UnidadeFederativa.PARA);
        Casa imovel2 = new Casa(endereco2,250000,true);
        opcoesParaFinanciamento.registrarImovel(imovel2);

        Endereco endereco3 = new Endereco("Rua Tenente-Coronel Cardoso",560,"Apartamento 604",
                "Centro", "Campos dos Goytacazes", UnidadeFederativa.RIO_DE_JANEIRO);
        Apartamento imovel3 = new Apartamento(endereco3,685000,5);
        opcoesParaFinanciamento.registrarImovel(imovel3);

        Endereco endereco4 = new Endereco("Rua Domingos Olímpio",12,"Loteamento B",
                "Centro", "Sobral", UnidadeFederativa.CEARA);
        Casa imovel4 = new Casa(endereco4, 350000,false);
        opcoesParaFinanciamento.registrarImovel(imovel4);

        /**
         * Teste do método opcoesParaFinanciamento.registrarImóvel(): Valor do imóvel acima dos parâmetros (50.000>valor<1.000.000)
         */
//        Endereco endereco5 = new Endereco("Caminho Vinte e Oito",877,"Apartamento 301",
//                "Zambelê", "Vitória da Conquista", UnidadeFederativa.BAHIA);
//        Apartamento imovel5 = new Apartamento(endereco5, 1500000, 3);
//        opcoesParaFinanciamento.registrarImovel(imovel5);

        /**
        * Teste do método opcoesParaFinanciamento.registrarImóvel(): Valor do imóvel abaixo dos parâmetros (50.000>valor<1.000.000)
        */
//        Endereco endereco6 = new Endereco("Rua Maria Chaves do Nascimento",58,"Bloco C",
//                "João Paulo II", "João Pessoa", UnidadeFederativa.PARAIBA);
//        Casa imovel6 = new Casa(endereco6, 40000, true);
//        opcoesParaFinanciamento.registrarImovel(imovel6);

        /**
         * FIM
         *
         * NÃO MODIFICAR ESTA CLASSE APÓS ESTA LINHA.
         */

        List<Imovel> todasAsOpcoes = opcoesParaFinanciamento.buscarOpcoes(Double.MAX_VALUE);
        if (todasAsOpcoes == null || todasAsOpcoes.isEmpty()) {
            throw new RuntimeException("\n\nAtenção! Você precisa registrar opções de financiamento antes de começar a usar o programa.\n"
                    + "Use o método 'registrarImovel', do objeto 'opcoesParaFinanciamento', para incluir algumas opções.\n");
        }

        System.out.println("\nVamos lá, preciso de algumas respostas...\n");
        Thread.sleep(1000);

        System.out.println(" Qual é o teu nome?");
        String nomeBeneficiario = new Scanner(System.in).next();
        Thread.sleep(500);

        System.out.println(" Agora eu preciso saber sobre a mascada, "+ nomeBeneficiario +". Qual é o teu salário?");
        double salarioBeneficiario = new Scanner(System.in).nextDouble();
        Thread.sleep(500);

        Beneficiario beneficiario = new Beneficiario(nomeBeneficiario, salarioBeneficiario);

        System.out.println(" Hummmm, tá grandão hein. E qual é o limite do valor de imóveis que você procura?");
        double valorParaPesquisa = new Scanner(System.in).nextDouble();
        Thread.sleep(500);

        System.out.println("\nTá, deixa eu ver aqui o que eu tenho de opções até "+ DecimalFormat.getCurrencyInstance().format(valorParaPesquisa) +"...");
        Thread.sleep(new Random().nextInt(4000) + 1000);

        List<Imovel> opcoesViaveis = opcoesParaFinanciamento.buscarOpcoes(valorParaPesquisa);
        if (opcoesViaveis == null || opcoesViaveis.isEmpty()) {
            throw new RuntimeException("\n\nPQP! Essa desgraça de programa não tem casas neste valor! Comece uma nova simulação.");
        }

        System.out.println("\nCerto! Encontrei "+ opcoesViaveis.size() + " opções aqui. Dá uma olhada:");
        int index = 0;
        for (Imovel imovel : opcoesViaveis) {
            System.out.printf(" [%d] %s\n", ++index, imovel.apresentacao());
            Thread.sleep(250);
        }

        Imovel imovelEscolhido = null;
        while (imovelEscolhido == null) {

            Thread.sleep(250);

            System.out.println("\nQual a opção que mais te agrada? (Me diz apenas o número.)");
            int opcaoEscolhida = new Scanner(System.in).nextInt();

            Thread.sleep(250);

            if (opcaoEscolhida < 1 || opcaoEscolhida > opcoesViaveis.size()) {
                System.out.println(" > Opção inválida!");
            } else {
                imovelEscolhido = opcoesViaveis.get(opcaoEscolhida - 1);
            }
        }

        System.out.println("\nShow de bola! Agora me diz em quantos meses você quer pagar essa tranqueira:");
        int mesesParaPagamento = new Scanner(System.in).nextInt();

        System.out.printf("\nHumm, certo %s. Você ganha %s e quer financiar um imóvel de %s, no estado %s, pagando em %d meses. Deixa eu ver se é possível...\n\n",
                beneficiario.getNome(),
                DecimalFormat.getCurrencyInstance().format(beneficiario.getSalario()),
                DecimalFormat.getCurrencyInstance().format(imovelEscolhido.getValor()),
                imovelEscolhido.getEndereco().getEstado(),
                mesesParaPagamento);
        Thread.sleep(new Random().nextInt(4000) + 1000);

        PropostaFinanciamento financiamento = new PropostaFinanciamento(beneficiario, imovelEscolhido, mesesParaPagamento);
        financiamento.validarProposta();
    }
}