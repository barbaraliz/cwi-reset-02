package exercicio01;

public class Aplicacao {

    public static void main(String[] args){

                Diretor diretor1 = new Diretor("João", 45, 10);
        Filme filme1 = new Filme("Filme Histórico", "Filme sobre a história da humanindade",
                2015, 120, 4, diretor1);

        Diretor diretor2 = new Diretor("Maria", 40, 15);
        Filme filme2 = new Filme("Filme Cientiífico", "Filme sobre ficção científica",
                2020, 125, 5, diretor2);

        filme1.reproduzir();
        filme2.reproduzir();

    }
}
