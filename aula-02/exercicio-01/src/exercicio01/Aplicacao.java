package exercicio01;

public class Aplicacao {

    public static void main(String[] args){
        Ator ator1 = new Ator("Pedro", 30,3, Genero.MASCULINO);
        Diretor diretor1 = new Diretor("João", 45, 10, Genero.MASCULINO);
        Filme filme1 = new Filme("Filme Histórico", "Filme sobre a história da humanindade",
                2015, 120, 4, diretor1);

        Ator ator2 = new Ator("Alex", 20,5, Genero.NAO_BINARIO);
        Diretor diretor2 = new Diretor("Maria", 40, 15, Genero.FEMININO);
        Filme filme2 = new Filme("Filme Cientiífico", "Filme sobre ficção científica",
                2020, 125, 5, diretor2);

        filme1.reproduzir();
        filme2.reproduzir();

    }
}
