public class variaveisEOperadores {

    public static void main(String[] args){

        //Multiplicação entre dois números
        int multiplicador1 = 3, multiplicador2 = 6;
        int resultadoMultiplicacao = multiplicador1 * multiplicador2;
        System.out.println("O resultado da multiplicação entre " + multiplicador1 + " e " + multiplicador2 + " é igual a " + resultadoMultiplicacao);

        //Resto da divisão entre dois números
        int dividendo = 6, divisor = 3;
        int restoDivisao = dividendo % divisor;
        System.out.println("O resto da divisão entre os números " + dividendo + " e " + divisor + " é " + restoDivisao);

        //Comparação entre dois números
        int numero1 = 6, numero2 = 3;
        boolean comparacao = numero1 > numero2;
        System.out.println("O número " + numero1 + " é maior que o " + numero2 + "? Resposta: " + comparacao);

    }
}
