public class Aluno {

    private String nome;
    private double notaFinal;
    private String situacao;

    public Aluno(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public void situacao() {
       if (notaFinal >= 7){
           this.situacao = "Aluno aprovado!";
       }
       else{
           this.situacao = "Aluno reprovado!";
       }
    }

    public String getNome() {
        return nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public String getSituacao() {
        return situacao;
    }
}

