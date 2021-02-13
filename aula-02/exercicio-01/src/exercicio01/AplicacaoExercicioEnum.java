package exercicio01;

public class AplicacaoExercicioEnum {

    public static void main(String[] args){

        Ator ator1 = new Ator("Alex", 30,3, Genero.NAO_BINARIO);
        Diretor diretor1 = new Diretor("João", 45, 10, Genero.MASCULINO);

        ator1.imprimirInformacoes();
        diretor1.imprimirInformacoes();

    }
}
