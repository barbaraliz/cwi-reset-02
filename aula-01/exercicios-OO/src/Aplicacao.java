public class Aplicacao {

    public static void main(String[] args) {

        //Exercício #1 - Calculadora
        Calculadora calcular = new Calculadora ();
        int resultadoSoma = calcular.soma(1,2);
        System.out.println("Resultado soma: " + resultadoSoma);

        int resultadoSubtracao = calcular.subtracao(4,3);
        System.out.println("Resultado subtração: " + resultadoSubtracao);

        int resultadoMultiplicacao = calcular.multiplicacao(5,2);
        System.out.println("Resultado multiplicação: " + resultadoMultiplicacao);

        int resultadoDivisao = calcular.divisao(6,2);
        System.out.println("Resultado divisão: " + resultadoDivisao);

        //Exercício #2 - Comprador
        Comparador comparar = new Comparador();
        boolean resultadoComparador = comparar.menorQue(1,2);
        System.out.println("O primeiro número é maior que o segundo? " + resultadoComparador);

        //Exercício #3 - Gerenciador de Notas
        Aluno aluno = new Aluno("Bárbara", 7.5);
        aluno.situacao();
        System.out.println("O aluno " + aluno.getNome() + " teve sua nota final " + aluno.getNotaFinal() + ", logo sua situação é: " + aluno.getSituacao());

    }
}
